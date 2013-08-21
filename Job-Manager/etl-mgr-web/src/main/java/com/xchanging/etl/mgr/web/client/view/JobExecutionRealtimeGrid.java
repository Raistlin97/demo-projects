/**
 * 
 */
package com.xchanging.etl.mgr.web.client.view;

import java.util.Date;
import java.util.List;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.smartgwt.client.data.Criteria;
import com.smartgwt.client.data.Criterion;
import com.smartgwt.client.data.DSCallback;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DSResponse;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ExpansionMode;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.types.OperatorId;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.grid.CellFormatter;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.HLayout;
import com.xchanging.etl.mgr.model.vo.JobExecutionHistoryVo;
import com.xchanging.etl.mgr.model.vo.JobMonitorHistoryVo;
import com.xchanging.etl.mgr.web.client.ds.JobExecutionHistoryDataSource;
import com.xchanging.etl.mgr.web.client.ds.JobMonitorHistoryDataSource;
import com.xchanging.etl.mgr.web.client.ds.LatestJobExecutionDataSource;

/**
 * @author Sabuj
 *
 */
public class JobExecutionRealtimeGrid extends ListGrid {

	
	private List<JobMonitorHistoryVo> jobExecutionData;
	private LatestJobExecutionDataSource jobMonitorHistoryDS = LatestJobExecutionDataSource.getInstance();
	
	/**
	 * 
	 */
	public JobExecutionRealtimeGrid() {
		addColumns();
		setDataSource(jobMonitorHistoryDS);
		setShowAllRecords(true); 
		setAutoFetchData(false);
		setCanExpandRecords(false);
		setShowRecordComponents(true);
		setShowRecordComponentsByCell(true);
		setShowAllColumns(true);
		//setExpansionMode(ExpansionMode.DETAILS);
		
		invalidateCache();
		fetchData();
	}
	
	
	
	/**
	 * 
	 */
	private void addColumns() {
		ListGridField nameField = new ListGridField(JobExecutionHistoryVo.Fields.JOB_NAME, "JOB Name");
		nameField.setWidth(180);
		ListGridField exitCodeField = new ListGridField(JobExecutionHistoryVo.Fields.EXIT_CODE, "Status");
		exitCodeField.setAlign(Alignment.CENTER);
		exitCodeField.setWidth(100);
		
		final DateTimeFormat dateFormatter = DateTimeFormat.getFormat("MMM d, yyyy");  
        
		
		ListGridField startTimeField = new ListGridField(JobExecutionHistoryVo.Fields.START_TIME, "Start Time");
		startTimeField.setType(ListGridFieldType.DATE);
		startTimeField.setWidth(150);
		startTimeField.setAlign(Alignment.CENTER);
		startTimeField.setCellFormatter(new CellFormatter() {  
            public String format(Object value, ListGridRecord record, int rowNum, int colNum) {  
                if (value != null) {  
  
                    try {  
                        Date dateValue = (Date) value;  
                        return dateFormatter.format(dateValue);  
                    } catch (Exception e) {  
                        return value.toString();  
                    }  
                } else {  
                    return "";  
                }  
            }  
        });
		
		ListGridField endTimeField = new ListGridField(JobExecutionHistoryVo.Fields.END_TIME,  "End Time");
		endTimeField.setWidth(150);
		endTimeField.setAlign(Alignment.CENTER);
		endTimeField.setType(ListGridFieldType.DATE);
		endTimeField.setCellFormatter(new CellFormatter() {  
            public String format(Object value, ListGridRecord record, int rowNum, int colNum) {  
                if (value != null) {  
  
                    try {  
                        Date dateValue = (Date) value;  
                        return dateFormatter.format(dateValue);  
                    } catch (Exception e) {  
                        return value.toString();  
                    }  
                } else {  
                    return "";  
                }  
            }  
        });
		
		ListGridField executeJobField = new ListGridField("executeJob", "Action");
		executeJobField.setAlign(Alignment.RIGHT);
		
		setFields(nameField, exitCodeField, 
				startTimeField, endTimeField, executeJobField);
	}

	/**
	 * @return the jobExecutionData
	 */
	public List<JobMonitorHistoryVo> getJobExecutionData() {
		return jobExecutionData;
	}

	/**
	 * @param jobExecutionData the jobExecutionData to set
	 */
	public void setJobExecutionData(List<JobMonitorHistoryVo> jobExecutionData) {
		this.jobExecutionData = jobExecutionData;
		//populateData();
	}

	@Override  
    protected String getBaseStyle(ListGridRecord record, int rowNum, int colNum) {  
        if (getFieldName(colNum).equals(JobExecutionHistoryVo.Fields.EXIT_CODE)) {  
        	String value = record.getAttributeAsString(JobExecutionHistoryVo.Fields.EXIT_CODE);

        	if("COMPLETED".equals(value)){
        		return "status_success";
        	} else if("FAILED".equals(value)){
        		return "status_error";
        	} else if("UNKNOWN".equals(value)){
        		return "status_unknown";
        	} else {  
                return super.getBaseStyle(record, rowNum, colNum);  
            }  
        } else {  
            return super.getBaseStyle(record, rowNum, colNum);  
        }  
    } 
	
	/*protected String getCellCSSText(ListGridRecord record, int rowNum, int colNum) {  
        if (getFieldName(colNum).equals(JobExecutionHistoryVo.Fields.EXIT_CODE)) {  
        	String value = record.getAttributeAsString(JobExecutionHistoryVo.Fields.EXIT_CODE);

        	if("COMPLETED".equals(value)){
        		return "font-weight:bold; color:#287fd6;";
        	} else if("FAILED".equals(value)){
        		return "font-weight:bold; color:#d64949;";
        	} else {  
                return super.getCellCSSText(record, rowNum, colNum);  
            }  
        	
        } else {  
            return super.getCellCSSText(record, rowNum, colNum);  
        }  
    }  */
	
	/* (non-Javadoc)
	 * @see com.smartgwt.client.widgets.grid.ListGrid#createRecordComponent(com.smartgwt.client.widgets.grid.ListGridRecord, java.lang.Integer)
	 */
	@Override
	protected Canvas createRecordComponent(final ListGridRecord record, Integer colNum) {
		String fieldName = this.getFieldName(colNum); 
		if (fieldName.equals("executeJob")) {  
            IButton button = new IButton();  
            button.setHeight(18);  
            button.setWidth(65);                      
            button.setTitle("Run");  
            button.addClickHandler(new ClickHandler() {  
                public void onClick(ClickEvent event) {  
                	Window.alert(record.getAttribute("jobName") + " execute clicked.");  
                }  
            });  
            return button;  
        } else {  
        	return super.createRecordComponent(record, colNum);
        }  
		
		
		
	}
}