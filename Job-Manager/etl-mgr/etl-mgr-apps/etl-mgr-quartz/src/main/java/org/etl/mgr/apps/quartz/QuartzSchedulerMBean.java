/**
 * -------------------------------------------------------------------------- *
 * 								ETL Manager
 * 						Monitor | Manage | Admin
 * -------------------------------------------------------------------------- *
 * Type:	org.etl.mgr.apps.quartz.QuartzSchedulerMBean
 * Date:	Aug 26, 2013  8:08:25 PM
 * 
 * -------------------------------------------------------------------------- *
 */
package org.etl.mgr.apps.quartz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanServer;
import javax.management.MBeanServerConnection;
import javax.management.ObjectInstance;
import javax.management.ReflectionException;

import com.xchanging.etl.mgr.core.jmx.JmxMethodInvocationException;
import com.xchanging.etl.mgr.core.jmx.SchedulerMBean;
import com.xchanging.etl.mgr.model.scheduler.BatchJobDetail;

/**
 * @author Sabuj Das | sabuj.das@asia.xchanging.com
 * 
 */
public class QuartzSchedulerMBean implements SchedulerMBean {

	private String schedulerName;
	private ObjectInstance schedulerJmxInstance;
	private MBeanServerConnection mbeanServerConnection;
	private Set<String> allJobNames;
	private Map<String, Set<String>> jobNamesByGroup;
	private List<BatchJobDetail> allJobDetails;
	private Map<String, List<BatchJobDetail>> jobDetailsByGroup;

	/**
	 * 
	 */
	public QuartzSchedulerMBean() {
		allJobNames = new HashSet<>();
		jobNamesByGroup = new LinkedHashMap<>();
		allJobDetails = new ArrayList<>();
		jobDetailsByGroup = new LinkedHashMap<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.xchanging.etl.mgr.core.jmx.SchedulerMBean#getSchedulerName()
	 */
	@Override
	public String getSchedulerName() {
		return schedulerName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.xchanging.etl.mgr.core.jmx.SchedulerMBean#getAllJobNames()
	 */
	@Override
	public Set<String> getAllJobNames() {
		return allJobNames;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.xchanging.etl.mgr.core.jmx.SchedulerMBean#getAllJobNames(java.lang
	 * .String)
	 */
	@Override
	public Set<String> getAllJobNames(String jobGroupName) {
		return jobNamesByGroup.get(jobGroupName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.xchanging.etl.mgr.core.jmx.SchedulerMBean#getAllJobDetails()
	 */
	@Override
	public List<BatchJobDetail> getAllJobDetails() {
		return allJobDetails;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.xchanging.etl.mgr.core.jmx.SchedulerMBean#getAllJobDetails(java.lang
	 * .String)
	 */
	@Override
	public List<BatchJobDetail> getAllJobDetails(String groupName) {
		return jobDetailsByGroup.get(groupName);
	}


	/**
	 * @return the jobNamesByGroup
	 */
	public Map<String, Set<String>> getJobNamesByGroup() {
		return jobNamesByGroup;
	}

	/**
	 * @param jobNamesByGroup
	 *            the jobNamesByGroup to set
	 */
	public void setJobNamesByGroup(Map<String, Set<String>> jobNamesByGroup) {
		this.jobNamesByGroup = jobNamesByGroup;
	}

	/**
	 * @return the allJobDetails
	 */
	public List<BatchJobDetail> getAllJobDetailNames() {
		return allJobDetails;
	}

	/**
	 * @param allJobDetails
	 *            the allJobDetails to set
	 */
	public void setAllJobDetails(List<BatchJobDetail> allJobDetails) {
		this.allJobDetails = allJobDetails;
	}

	/**
	 * @return the jobDetailsByGroup
	 */
	public Map<String, List<BatchJobDetail>> getJobDetailsByGroup() {
		return jobDetailsByGroup;
	}

	/**
	 * @param jobDetailsByGroup
	 *            the jobDetailsByGroup to set
	 */
	public void setJobDetailsByGroup(
			Map<String, List<BatchJobDetail>> jobDetailsByGroup) {
		this.jobDetailsByGroup = jobDetailsByGroup;
	}

	/**
	 * @param schedulerName
	 *            the schedulerName to set
	 */
	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}

	/**
	 * @param allJobNames
	 *            the allJobNames to set
	 */
	public void setAllJobNames(Set<String> allJobNames) {
		this.allJobNames = allJobNames;
	}

	public ObjectInstance getSchedulerJmxInstance() {
		return schedulerJmxInstance;
	}

	public void setSchedulerJmxInstance(ObjectInstance schedulerJmxInstance) {
		this.schedulerJmxInstance = schedulerJmxInstance;
	}

	public MBeanServerConnection getMbeanServerConnection() {
		return mbeanServerConnection;
	}

	public void setMbeanServerConnection(
			MBeanServerConnection mbeanServerConnection) {
		this.mbeanServerConnection = mbeanServerConnection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.xchanging.etl.mgr.core.jmx.SchedulerMBean#executeJob(com.xchanging
	 * .etl.mgr.model.scheduler.BatchJobDetail)
	 */
	@Override
	public void executeJob(BatchJobDetail jobDetail)
			throws JmxMethodInvocationException {
		// TODO Auto-generated method stub

	}
	
	@Override
	public synchronized void executeJob(String jobName) throws JmxMethodInvocationException,
			InstanceNotFoundException, MBeanException, ReflectionException,
			IOException {
		Collection<List<BatchJobDetail>> jobDetailsByGroup = getJobDetailsByGroup().values();
		if (null != jobDetailsByGroup && mbeanServerConnection != null) {
			for (List<BatchJobDetail> jobDetails : jobDetailsByGroup) {
				if(null != jobDetails && jobDetails.size() > 0){
					for (BatchJobDetail jobDetail : jobDetails) {
						if (jobDetail.getJobName().equals(jobName)) {
							mbeanServerConnection.invoke(
									schedulerJmxInstance.getObjectName(), "triggerJob",
									new Object[] { jobDetail.getJobDetailName(),
											jobDetail.getGroupName() }, new String[] {
											"java.lang.String", "java.lang.String" });
							System.out.println(jobName + " is triggred");
							return;
						}
					}
				}
				
			}
		}
	}

}
