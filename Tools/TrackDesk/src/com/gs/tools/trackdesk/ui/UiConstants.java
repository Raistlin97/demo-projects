/** ---------------------------------------------------------------------------*
 * Copyright Sabuj Das | sabuj.das@gmail.com all rights reserved.
 * <br/>
 * This document cannot be copied, modified or re-distributed without prior 
 * permission from the author.
 *  ---------------------------------------------------------------------------* 
 * Type     : com.gs.tools.trackdesk.ui.UiConstants
 * Date     : May 14, 2013
 */

package com.gs.tools.trackdesk.ui;

import java.awt.Color;

/**
 *
 * @author Sabuj Das | sabuj.das@gmail.com
 */
public interface UiConstants {
    interface CalendarColors{
		Color BACKGROUND = new Color(220,235,252);;
		
		Color SELECTION_OUTTER_BORDER = new Color(125,162,206);
		Color SELECTION_INNER_BORDER = new Color(222,237,254);
		Color SELECTION_GRAD_TOP = Color.decode("0xDCEBFC");//new Color(220,235,252); //DCEBFC
		Color SELECTION_GRAD_BOTTOM = Color.decode("0xC1DBFC");//new Color(193,219,252);
		
		Color HOVER_OUTTER_BORDER = new Color(184,214,251);
		Color HOVER_INNER_BORDER = new Color(252,253,254);
		Color HOVER_GRAD_TOP = new Color(241,247,254);
		Color HOVER_GRAD_BOTTOM = new Color(235,243,253);
		
		Color HORIZONTAL_LINE = new Color(214,229,245);
        Color GRID_LINE = new Color(155,187,89);
		Color YEAR_TEXT = new Color(42,110,18);
		Color MONTH_NAME_TEXT = new Color(117,128,165);
        Color DAY_NAME_TEXT = new Color(117,128,165);
        Color DAY_TEXT = new Color(0,0,0);
	}
	
	interface MenuContentColors{
		Color BACKGROUND = Color.decode("0xFAFDFE");
		
		Color BACKGROUND_GRAD_TOP = Color.decode("0xF7F7F9");;
		Color BACKGROUND_GRAD_BOTTOM = Color.decode("0xE6EDF6");;
		
		Color OUTTER_BORDER = Color.decode("0xAECFF7");
		Color INNER_BORDER = Color.decode("0xFAFDFE");
		
	}
	
	interface MenuTabColors{
		Color BACKGROUND = Color.decode("0x186337");
		Color FOREGROUND = Color.BLACK;
		
		Color SELECTED_FOREGROUND = Color.decode("0xF2F6F0");
		Color SELECTED_BG_GRAD_TOP = Color.decode("0x4BA231");
		Color SELECTED_BG_GRAD_BOTTOM = Color.decode("0x287D2B");;
		Color SELECTED_OUTTER_BORDER = Color.decode("0x186337");
		Color SELECTED_INNER_BORDER = Color.decode("0x64BA43");
		
		Color OUTTER_BORDER = Color.decode("0xAECFF7");
		Color INNER_BORDER = Color.decode("0xFAFDFE");
	}
}