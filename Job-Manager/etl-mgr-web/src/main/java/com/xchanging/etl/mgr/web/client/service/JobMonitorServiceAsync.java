/**
 * File :: com.xchanging.etl.mgr.web.client.service.JobMonitorServiceAsync
 * Date :: 24-Jul-2013
 */
package com.xchanging.etl.mgr.web.client.service;

import java.util.Date;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.xchanging.etl.mgr.model.vo.JobExecutionHistoryVo;
import com.xchanging.etl.mgr.model.vo.JobMonitorHistoryVo;

/**
 * @author Sabuj Das | sabuj.das@gmail.com
 * 
 */
public interface JobMonitorServiceAsync {

	void loadHistoricalMonitorData(
			AsyncCallback<List<JobMonitorHistoryVo>> asyncCallback);

	void loadHistoricalMonitorData(List<String> jobNames,
			AsyncCallback<String> asyncCallback);

	void loadHistoricalMonitorData(List<String> jobNames, Date startTime,
			Date endTime, AsyncCallback<String> asyncCallback);

	void loadCurrentMonitorData(List<String> jobNames,
			AsyncCallback<String> asyncCallback);

	/**
	 * @param asyncCallback
	 */
	void loadJobMonitorHistoryData(
			AsyncCallback<List<JobMonitorHistoryVo>> asyncCallback);

	/**
	 * @param jobName
	 * @param asyncCallback
	 */
	void loadJobExecutionHistoryDateData(String jobName,
			AsyncCallback<List<JobExecutionHistoryVo>> asyncCallback);

	/**
	 * @param asyncCallback
	 */
	void loadAllJobNames(AsyncCallback<List<String>> asyncCallback);

	/**
	 * @param jobNames
	 * @param asyncCallback
	 */
	void loadJobCurrentExecutionData(String[] jobNames,
			AsyncCallback<List<JobExecutionHistoryVo>> asyncCallback);

}
