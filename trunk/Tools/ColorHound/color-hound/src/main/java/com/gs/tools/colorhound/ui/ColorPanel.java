/** ---------------------------------------------------------------------------*
 * Copyright Sabuj Das | sabuj.das@gmail.com all rights reserved.
 * <br/>
 * This document cannot be copied, modified or re-distributed without prior 
 * permission from the author.
 *  ---------------------------------------------------------------------------* 
 * Type     : com.gs.tools.colorhound.ui.ColorPanel
 * Date     : May 23, 2013
 */

package com.gs.tools.colorhound.ui;

import com.gs.tools.colorhound.event.ApplicationEventManager;
import com.gs.tools.colorhound.event.ColorGrabEvent;
import com.gs.tools.colorhound.event.ColorPanelSelectedEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicGraphicsUtils;

/**
 *
 * @author Sabuj Das | sabuj.das@gmail.com
 */
public class ColorPanel extends JPanel implements MouseListener{

    private final JPanel parentPanel;
    private final String paletteName;
    private Color selectedColor;
    private String colorHexCode;
    private boolean selected = false;
    
    public final static int MAX_WIDTH = 45;
    public final static int MAX_HEIGHT = 45;
    private boolean colorGrabbed = false;
    
    private final ResourceBundle resourceBundle 
            = ResourceBundle.getBundle("i18n/Message");

    public ColorPanel(JPanel parent, String paletteName) {
        this.parentPanel = parent;
        this.paletteName = paletteName;
        selectedColor = Color.WHITE;
        colorHexCode = Color.BLACK.toString();
        Dimension d = new Dimension(MAX_WIDTH, MAX_HEIGHT);
        setMaximumSize(d);
        setMinimumSize(d);
        setPreferredSize(d);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setLayout(null);
        addMouseListener(this);
        setToolTipText(resourceBundle.getString("tip.color.panel.info"));
    }

    public JPanel getParentPanel() {
        return parentPanel;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
    }

    public void mouseClicked(MouseEvent e) {
        if(MouseEvent.BUTTON1 == e.getButton()){
            selected = true;
            ColorPaletteManager.getInstance().selectPanel(paletteName, this);
            updateUI();
            parentPanel.updateUI();
            ColorPanelSelectedEvent event = new ColorPanelSelectedEvent
                    (false, selected, this);
            if(colorGrabbed)
                event.setSelectedColor(selectedColor);
            ApplicationEventManager.getInstance().fireEvent(event);
        } else if(MouseEvent.BUTTON3 == e.getButton() ){
            Color newColor = JColorChooser.showDialog(this, 
                    resourceBundle.getString("lbl.color.chooser.title"), 
                    selectedColor);
            if(null != newColor){
                selectedColor = newColor;
                colorGrabbed = true;
                ApplicationEventManager.getInstance().fireEvent(
                        new ColorGrabEvent(selectedColor, selectedColor, this)
                        );
                updateUI();
                parentPanel.updateUI();
            }
        }
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void mouseExited(MouseEvent e) {
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    @Override
    public void paint(Graphics g) {
        g.setColor((selected ? Color.MAGENTA : Color.BLUE));
        BasicGraphicsUtils.drawDashedRect(g, 0, 0, MAX_WIDTH, MAX_HEIGHT);
        if(null != selectedColor){
            g.setColor(selectedColor);
            g.fillRect(4, 4, MAX_WIDTH-8, MAX_HEIGHT-8);
        }
    }

    public void setColorGrabbed(boolean b) {
        this.colorGrabbed = b;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public String getColorHexCode() {
        return colorHexCode;
    }

    public boolean isSelected() {
        return selected;
    }

    public boolean isColorGrabbed() {
        return colorGrabbed;
    }

    
    
    
    
    
    
}