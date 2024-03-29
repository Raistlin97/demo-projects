/**
 * -------------------------------------------------------------------------- *
 * 								ETL Manager
 * 						Monitor | Manage | Admin
 * -------------------------------------------------------------------------- *
 * Type:	com.xchanging.etl.mgr.web.client.view.NavigationView
 * Date:	Aug 5, 2013  6:25:26 PM
 * 
 * -------------------------------------------------------------------------- *
 */
package com.xchanging.etl.mgr.web.client.view;

import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.types.SelectionType;
import com.smartgwt.client.types.VisibilityMode;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.events.ResizedEvent;
import com.smartgwt.client.widgets.events.ResizedHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.SectionStack;
import com.smartgwt.client.widgets.layout.SectionStackSection;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.toolbar.ToolStrip;
import com.smartgwt.client.widgets.toolbar.ToolStripButton;
import com.smartgwt.client.widgets.tree.TreeGrid;
import com.smartgwt.client.widgets.tree.TreeGridField;
import com.xchanging.etl.mgr.web.client.EtlManager;
import com.xchanging.etl.mgr.web.client.UIConstants;
import com.xchanging.etl.mgr.web.client.dialog.AddJMXSchedulerDialog;

/**
 * @author Sabuj Das | sabuj.das@asia.xchanging.com
 * 
 */
public class NavigationView extends VLayout implements ResizedHandler {
	public static final String JOB_MONITOR_BTN_GROUP = "job.monitor.btn.group";
	public static final String SCHEDULER_MONITOR_BTN_GROUP = "scheduler.monitor.btn.group";
	
	private final SectionStack navigationStack = new SectionStack();   
	
	private final SectionStackSection monitorSection = new SectionStackSection();
	private final VLayout monitorSectionContent = new VLayout();
	private final SectionStackSection historySection = new SectionStackSection();
	private final VLayout historySectionContent = new VLayout();
	private final SectionStackSection schedulerSection = new SectionStackSection();
	private final VLayout schedulerSectionContent = new VLayout();
	private final VLayout addedSchedulerSectionContent = new VLayout();
	
	private final ToolStrip jobServerToolStrip = new ToolStrip();
	private final TreeGrid treeGrid = new TreeGrid();  
	
	public NavigationView() {
		super();
		this.addResizedHandler(this);
		this.setWidth(UIConstants.NAV_WEST_WIDTH);
		this.setHeight100();
		this.setMembersMargin(20);
		this.setOverflow(Overflow.HIDDEN);
		this.setShowResizeBar(true);
		
		jobServerToolStrip.setWidth100();
		jobServerToolStrip.setHeight(25);
		ToolStripButton addServerButton = new ToolStripButton();
		addServerButton.setTitle("Add");
		ToolStripButton editServerButton = new ToolStripButton();
		editServerButton.setTitle("Edit");
		ToolStripButton removeServerButton = new ToolStripButton();
		removeServerButton.setTitle("Rem");
		jobServerToolStrip.addButton(addServerButton);
		jobServerToolStrip.addButton(editServerButton);
		jobServerToolStrip.addButton(removeServerButton);
		jobServerToolStrip.addSeparator();
		ToolStripButton exportServerButton = new ToolStripButton();
		exportServerButton.setTitle("Export");
		ToolStripButton importServerButton = new ToolStripButton();
		importServerButton.setTitle("Import");
		jobServerToolStrip.addButton(exportServerButton);
		jobServerToolStrip.addButton(importServerButton);
		
		addMember(jobServerToolStrip);

		
		/*
		
        treeGrid.setCanEdit(true);  
        treeGrid.setLoadDataOnDemand(false);  
        treeGrid.setWidth100();  
        treeGrid.setHeight100();  
        //treeGrid.setDataSource(employeesDS);  
        treeGrid.setNodeIcon("icons/16/folder_document.png");  
        treeGrid.setFolderIcon("icons/16/document_plain_new.png");  
        treeGrid.setShowOpenIcons(false);  
        treeGrid.setShowDropIcons(false);  
        treeGrid.setClosedIconSuffix("");  
        treeGrid.setAutoFetchData(true);  
  
        TreeGridField nameField = new TreeGridField("Server Name");  
        TreeGridField jobField = new TreeGridField("Status");  
  
        treeGrid.setFields(nameField, jobField);  
		addMember(treeGrid);*/
		
		
		navigationStack.setVisibilityMode(VisibilityMode.MUTEX);   
		navigationStack.setWidth("227");   
		navigationStack.setHeight100();   
		navigationStack.setAutoWidth();
		navigationStack.setOverflow(Overflow.HIDDEN);
		navigationStack.setStyleName("navigationAccordianTitle");

		monitorSection.setTitle("Job Monitor");
		monitorSection.setExpanded(true);
		monitorSectionContent.setWidth100();   
		monitorSectionContent.setHeight("*");
		
		
		Button rtAllJobsButton = new Button(
				"All Jobs"
				);
		rtAllJobsButton.setStyleName("navigationButton");
		rtAllJobsButton.setWidth100();
		rtAllJobsButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				BaseContainerView.getContainer().setView(new RTAllJobsJobMonitorView());
			}
		});
		rtAllJobsButton.setActionType(SelectionType.RADIO);
		rtAllJobsButton.setRadioGroup(JOB_MONITOR_BTN_GROUP);
		monitorSectionContent.addMember(rtAllJobsButton);
		
		Button rtLastHourButton = new Button(
				"Last Hour"
				);
		rtLastHourButton.setStyleName("navigationButton");
		rtLastHourButton.setWidth100();
		rtLastHourButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				BaseContainerView.getContainer().setView(new RTLastHourJobMonitorView());
			}
		});
		rtLastHourButton.setActionType(SelectionType.RADIO);
		rtLastHourButton.setRadioGroup(JOB_MONITOR_BTN_GROUP);
		monitorSectionContent.addMember(rtLastHourButton);
		
		Button rtLastDayButton = new Button(
				"Last Day"
				);
		rtLastDayButton.setStyleName("navigationButton");
		rtLastDayButton.setWidth100();
		rtLastDayButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				BaseContainerView.getContainer().setView(new RTLastDayJobMonitorView());
			}
		});
		rtLastDayButton.setActionType(SelectionType.RADIO);
		rtLastDayButton.setRadioGroup(JOB_MONITOR_BTN_GROUP);
		monitorSectionContent.addMember(rtLastDayButton);
		
		Button rtSelectedJobsButton = new Button(
				"Selected Jobs"
				);
		rtSelectedJobsButton.setStyleName("navigationButton");
		rtSelectedJobsButton.setWidth100();
		rtSelectedJobsButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				BaseContainerView.getContainer().setView(new RTSelectedJobMonitorView());
			}
		});
		rtSelectedJobsButton.setActionType(SelectionType.RADIO);
		rtSelectedJobsButton.setRadioGroup(JOB_MONITOR_BTN_GROUP);
		monitorSectionContent.addMember(rtSelectedJobsButton);
		
		Button rtFilteredJobsButton = new Button(
				"Filtered Jobs"
				);
		rtFilteredJobsButton.setStyleName("navigationButton");
		rtFilteredJobsButton.setWidth100();
		rtFilteredJobsButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				BaseContainerView.getContainer().setView(new RTFilteredJobMonitorView());
			}
		});
		rtFilteredJobsButton.setActionType(SelectionType.RADIO);
		rtFilteredJobsButton.setRadioGroup(JOB_MONITOR_BTN_GROUP);
		monitorSectionContent.addMember(rtFilteredJobsButton);
		
				
		Button historicalJobMonitorButton = new Button(
				EtlManager.MESSAGES.getLabel4JobMonitorHistorical()
				);
		historicalJobMonitorButton.setStyleName("navigationButton");
		historicalJobMonitorButton.setWidth100();
		historicalJobMonitorButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				BaseContainerView.getContainer().setView(new HistoryJobMonitorView());
			}
		});
		historicalJobMonitorButton.setActionType(SelectionType.RADIO);
		historicalJobMonitorButton.setRadioGroup(JOB_MONITOR_BTN_GROUP);
		
		monitorSectionContent.addMember(historicalJobMonitorButton);
		
		monitorSection.addItem(monitorSectionContent);
		navigationStack.addSection(monitorSection);
		
		historySection.setTitle("History");
		historySection.setExpanded(false);
		
		historySectionContent.setWidth100();   
		historySectionContent.setHeight("*");
		historySectionContent.addMember(new Button("Job History"));
		historySection.addItem(historySectionContent);
		navigationStack.addSection(historySection);
		
		schedulerSection.setTitle("Scheduler");
		schedulerSection.setExpanded(false);
		schedulerSectionContent.setWidth100();   
		schedulerSectionContent.setHeight("*");
		addedSchedulerSectionContent.setWidth100();   
		addedSchedulerSectionContent.setHeight("*");
		
		Button addJmxSchedulerButton = new Button(
				"Add JMX Scheduler"
				);
		addJmxSchedulerButton.setStyleName("navigationButton");
		addJmxSchedulerButton.setWidth100();
		addJmxSchedulerButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				final AddJMXSchedulerDialog dialog
					= new AddJMXSchedulerDialog();
				dialog.show();
			}
		});
		
		schedulerSectionContent.addMember(addJmxSchedulerButton);
		
		schedulerSection.addItem(schedulerSectionContent);
		navigationStack.addSection(schedulerSection);
		
		HLayout topLayout = new HLayout();
		topLayout.setWidth(200);
		topLayout.setHeight100();
		
		//topLayout.addMember(navigationStack);
		addMember(navigationStack);
		HLayout bottomLayout = new HLayout();
		bottomLayout.setWidth(200);
		bottomLayout.setHeight(UIConstants.HEADER_HEIGHT);
		bottomLayout.addMember(new Label("Bottom"));
		
		
		
		this.addMember(bottomLayout);

	}
	
	public void onResized(ResizedEvent event) {
		if(this.getWidth() > UIConstants.NAV_WEST_WIDTH)
			navigationStack.setWidth(this.getWidth());
		else 
			navigationStack.setWidth(UIConstants.NAV_WEST_WIDTH);
		BaseContainerView.getContainer().redraw();
	}

}
