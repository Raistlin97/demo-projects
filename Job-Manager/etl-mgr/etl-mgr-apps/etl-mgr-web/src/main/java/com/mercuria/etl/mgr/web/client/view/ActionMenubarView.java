package com.xchanging.etl.mgr.web.client.view;

import com.google.gwt.core.client.GWT;
import com.xchanging.etl.mgr.web.client.UIConstants;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.HLayout;

public class ActionMenubarView extends HLayout {

	
	public ActionMenubarView() {
		super();
		
		GWT.log("init ActionMenubarView ...");
		
	    this.setHeight(UIConstants.MENUBAR_HEIGHT);
	    this.setBackgroundColor("#4096EE");  

	    
	 // initialise the application menu label
	    Label label = new Label(); 
	    label.setContents("Application Menu");  
	    //label.setAlign(Alignment.CENTER);  
	    //label.setOverflow(Overflow.HIDDEN);  
			    
	    // add the label to the layout container
	    this.addMember(label); 

	}
}
