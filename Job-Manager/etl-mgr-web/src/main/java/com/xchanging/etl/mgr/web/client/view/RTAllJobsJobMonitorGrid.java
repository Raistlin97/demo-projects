/**
 * 
 */
package com.xchanging.etl.mgr.web.client.view;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.data.SortSpecifier;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.types.SortDirection;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.grid.CellFormatter;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.HLayout;
import com.xchanging.etl.mgr.model.vo.JobExecutionHistoryVo;
import com.xchanging.etl.mgr.web.client.ds.RTAllJobsJobMonitorDataSource;
import com.xchanging.etl.mgr.web.client.endpoint.RemoteServiceEndpointFactory;
import com.xchanging.etl.mgr.web.shared.WebConstants;

/**
 * @author Sabuj
 *
 */
public class RTAllJobsJobMonitorGrid extends ListGrid {

	public static final String ID = "RTAllJobsJobMonitorGrid";
	
	/**
	 * 
	 */
	public RTAllJobsJobMonitorGrid() {
		setShowAllRecords(true); 
		setAutoFetchData(false);
		setCanExpandRecords(false);
		setShowRecordComponents(true);
		setShowRecordComponentsByCell(true);
		setShowAllColumns(true);
		setGroupStartOpen(WebConstants.JOB_EXIT_CODE_STARTED, WebConstants.JOB_EXIT_CODE_FAILED);
		setGroupByField(JobExecutionHistoryVo.Fields.STATUS_CODE);
		SortSpecifier sortSpecifier = new SortSpecifier(
				JobExecutionHistoryVo.Fields.STATUS_CODE, 
				SortDirection.ASCENDING);
		setSort(new SortSpecifier[]{sortSpecifier});
		invalidateCache();
		setDataSource(
				RTAllJobsJobMonitorDataSource.getInstance()
				);
		addColumns();
	}
	
	
	
	/**
	 * 
	 */
	private void addColumns() {
		ListGridField nameField = new ListGridField(JobExecutionHistoryVo.Fields.JOB_NAME, "JOB Name");
		ListGridField exitCodeField = new ListGridField(JobExecutionHistoryVo.Fields.EXIT_CODE, "Exit Code");
		exitCodeField.setAlign(Alignment.CENTER);
		exitCodeField.setWidth(100);
		ListGridField statusCodeField = new ListGridField(JobExecutionHistoryVo.Fields.STATUS_CODE, "Status");
		statusCodeField.setAlign(Alignment.CENTER);
		statusCodeField.setWidth(100);
		
		final DateTimeFormat dateFormatter = DateTimeFormat.getFormat("dd-MMM-yyyy HH:mm:ss.SSS");  
        
		
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
		executeJobField.setWidth(75);
		
		
		
		setFields(nameField, exitCodeField, statusCodeField, 
				startTimeField, endTimeField, executeJobField);
	}

	

	@Override  
    protected String getCellCSSText(ListGridRecord record, int rowNum, int colNum) {  
        if (getFieldName(colNum).equals(JobExecutionHistoryVo.Fields.EXIT_CODE)) {  
        	String value = record.getAttributeAsString(JobExecutionHistoryVo.Fields.EXIT_CODE);

        	if(WebConstants.JOB_EXIT_CODE_COMPLETED.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_COMPLETED;
        	} else if(WebConstants.JOB_EXIT_CODE_FAILED.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_ERROR;
        	} else if(WebConstants.JOB_EXIT_CODE_UNKNOWN.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_UNKNOWN;
        	} else if(WebConstants.JOB_EXIT_CODE_STARTED.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_STARTED;
        	} else {  
                return super.getCellCSSText(record, rowNum, colNum);  
            }  
        } else if (getFieldName(colNum).equals(JobExecutionHistoryVo.Fields.STATUS_CODE)) {  
        	String value = record.getAttributeAsString(JobExecutionHistoryVo.Fields.STATUS_CODE);

        	if(WebConstants.JOB_EXIT_CODE_COMPLETED.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_COMPLETED;
        	} else if(WebConstants.JOB_EXIT_CODE_FAILED.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_ERROR;
        	} else if(WebConstants.JOB_EXIT_CODE_UNKNOWN.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_UNKNOWN;
        	} else if(WebConstants.JOB_EXIT_CODE_STARTED.equals(value)){
        		return WebConstants.STYLE_JOB_STATUS_STARTED;
        	} else {  
                return super.getCellCSSText(record, rowNum, colNum);  
            }  
        } else {  
            return super.getCellCSSText(record, rowNum, colNum);  
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
		String statusCode = record.getAttributeAsString(JobExecutionHistoryVo.Fields.STATUS_CODE);
		String exitCode = record.getAttributeAsString(JobExecutionHistoryVo.Fields.EXIT_CODE);
		if (fieldName.equals("executeJob")) {  
            HLayout hLayout = new HLayout();
            hLayout.setWidth100();
            hLayout.setHeight100();
			hLayout.setMembersMargin(2);
			hLayout.setAlign(Alignment.RIGHT);
			hLayout.setAlign(VerticalAlignment.CENTER);
            
            if(WebConstants.JOB_EXIT_CODE_FAILED.equalsIgnoreCase(exitCode)){
            	IButton exitMgsButton = new IButton();  
                exitMgsButton.setHeight(18);  
                exitMgsButton.setWidth(65);                      
                exitMgsButton.setTitle("Exit Msg");  
                exitMgsButton.addClickHandler(new ClickHandler() {  
                    public void onClick(ClickEvent event) {  
                    	Window.alert(record.getAttributeAsString(JobExecutionHistoryVo.Fields.EXIT_MESSAGE));  
                    }  
                });
                hLayout.addMember(exitMgsButton);
            }
            
			IButton runButton = new IButton();  
            runButton.setHeight(18);  
            runButton.setWidth(65);                      
            runButton.setTitle("Run");  
            runButton.addClickHandler(new ClickHandler() {  
                public void onClick(ClickEvent event) {  
                	String jobName = record.getAttribute("jobName");
                	//Window.alert(record.getAttribute("jobName") + " execute clicked.");
                	RemoteServiceEndpointFactory.getInstance()
                		.getJmxJobRunnerServiceEndpoint().runJob(jobName, new AsyncCallback<String>() {
							
							@Override
							public void onSuccess(String result) {
								SC.say(result);
							}
							
							@Override
							public void onFailure(Throwable caught) {
								SC.say(caught.getMessage());
							}
						});
                }  
            });
            
            if(WebConstants.JOB_STATUS_STARTED.equalsIgnoreCase(statusCode)){
            	runButton.setDisabled(true);
            } else {
            	runButton.setDisabled(false);
            }
            
            hLayout.addMember(runButton);
            
            return hLayout;  
        } else {  
        	return super.createRecordComponent(record, colNum);
        }  
	}
}