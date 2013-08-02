package com.mercuria.etl.mgr.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mercuria.etl.mgr.common.exception.ApplicationException;
import com.mercuria.etl.mgr.dao.JobInstanceDao;
import com.mercuria.etl.mgr.dao.JobMonitorJdbcDao;
import com.mercuria.etl.mgr.model.entity.JobExecution;
import com.mercuria.etl.mgr.model.entity.JobInstance;
import com.mercuria.etl.mgr.model.vo.JobExecutionHistoryVo;
import com.mercuria.etl.mgr.model.vo.JobMonitorHistoryVo;
import com.mercuria.etl.mgr.model.vo.JobMonitorVo;
import com.mercuria.etl.mgr.service.JobDetailMonitorService;

/**
 * @author Sabuj Das | sabuj.das@asia.xchanging.com
 *
 */
@Service
public class JobDetailMonitorServiceImpl implements JobDetailMonitorService {

	private static Logger logger = Logger.getLogger(JobDetailMonitorServiceImpl.class);
	
	@Autowired
	private JobInstanceDao jobInstanceDao;
	@Autowired 
	private JobMonitorJdbcDao jobMonitorJdbcDao;
	
	public void setJobInstanceDao(JobInstanceDao jobInstanceDao) {
		this.jobInstanceDao = jobInstanceDao;
	}

	public void setJobMonitorJdbcDao(JobMonitorJdbcDao jobMonitorJdbcDao) {
		this.jobMonitorJdbcDao = jobMonitorJdbcDao;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<JobMonitorVo> getJobExecutionHistory() {
		List<JobInstance> jobInstances = null;
		try {
			jobInstances = jobInstanceDao.getAllInstances();
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
		List<JobMonitorVo> jobMonitorVos = new ArrayList<>();
		if(null != jobInstances){
			if(logger.isDebugEnabled()){
				logger.debug("Total instance count: " + jobInstances.size());
			}
			
			for (JobInstance jobInstance : jobInstances) {
				JobMonitorVo jobMonitorVo = new JobMonitorVo();
				
				jobMonitorVo.setJobName(jobInstance.getJobName());
				
				Set<JobExecution> executions = jobInstance.getJobExecutions();
				if(null != executions && executions.size() > 0){
					if(logger.isDebugEnabled()){
						logger.debug("Total execution count: " + executions.size() 
								+ " for job instance: " + jobInstance.getInstanceId());
					}
					JobExecution execution = executions.iterator().next();
					jobMonitorVo.setStartTime(execution.getStartTime());
					jobMonitorVo.setEndTime(execution.getEndTime());
					
					jobMonitorVo.setExitCode(execution.getExitCode());
					jobMonitorVo.setExitMessage(execution.getExitMessage());
				}
				
				jobMonitorVos.add(jobMonitorVo);
			}
		}
		if(logger.isDebugEnabled()){
			logger.debug("Total monitorVO count: " + jobMonitorVos.size());
		}
		return jobMonitorVos;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<JobMonitorVo> getAllJobHistory() {
		try{
			return jobMonitorJdbcDao.getAllJobHistory();
		} catch (ApplicationException e){
			logger.error(e);
		}
		return new ArrayList<>();
	}

	/* (non-Javadoc)
	 * @see com.mercuria.etl.mgr.service.JobDetailMonitorService#getAllJobMonitorHistory()
	 */
	@Override
	public List<JobMonitorHistoryVo> getAllJobMonitorHistory() {
		List<JobMonitorHistoryVo> historyVos = new ArrayList<>();
		try{
			historyVos = jobMonitorJdbcDao.getLastJobExecutionByJobNames();
			if(null == historyVos){
				logger.info("No data found");
				return new ArrayList<>();
			}
			List<JobMonitorVo> jobMonitorVos = jobMonitorJdbcDao.getAllJobHistory();
			
			if(null != jobMonitorVos && jobMonitorVos.size() > 0){
				Map<String, JobMonitorHistoryVo> historyMap = new LinkedHashMap<>();
				for (JobMonitorHistoryVo historyVo :  historyVos){
					historyMap.put(historyVo.getJobName(), historyVo);
				}
				
				for(JobMonitorVo monitorVo : jobMonitorVos){
					final JobMonitorHistoryVo historyVo = historyMap.get(monitorVo.getJobName());
					JobExecutionHistoryVo executionHistoryVo = new JobExecutionHistoryVo();
					executionHistoryVo.setJobName(monitorVo.getJobName());
					executionHistoryVo.setExitCode(monitorVo.getExitCode());
					executionHistoryVo.setExitMessage(monitorVo.getExitMessage());
					executionHistoryVo.setStartTime(monitorVo.getStartTime());
					executionHistoryVo.setEndTime(monitorVo.getEndTime());
					if(historyVo.getLastStartedTime().equals(monitorVo.getStartTime())
							&& historyVo.getLastEndedTime().equals(monitorVo.getEndTime())){
						historyVo.setStatus(monitorVo.getStatus());
					}
					historyVo.getExecutionDetails().add(executionHistoryVo);
				}
				
			}
		}catch(ApplicationException ex){
			logger.error(ex);
		}
		
		return historyVos;
	}

	
}
