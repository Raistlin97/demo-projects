/** ---------------------------------------------------------------------------*
 * Copyright Sabuj Das | sabuj.das@gmail.com all rights reserved.
 * <br/>
 * This document cannot be copied, modified or re-distributed without prior 
 * permission from the author.
 *  ---------------------------------------------------------------------------* 
 * Type     : com.gs.tools.trackdesk.ui.TrackDeskFrame
 * Date     : May 10, 2013
 */

package com.gs.tools.trackdesk.ui;

import com.gs.utils.swing.window.WindowUtil;
import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Sabuj Das | sabuj.das@gmail.com
 */
public class TrackDeskFrame extends javax.swing.JFrame {

    /** Creates new form TrackDeskFrame */
    public TrackDeskFrame() {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource(
               "/com/gs/tools/trackdesk/images/sheduled_task.png")).getImage());
        WindowUtil.bringToCenter(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseToolBar = new javax.swing.JToolBar();
        newTaskToolButton = new javax.swing.JButton();
        statusToolBar = new javax.swing.JToolBar();
        baseContainerPanel = new javax.swing.JPanel();
        baseMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newTaskMenuItem = new javax.swing.JMenuItem();
        newNoteMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        saveAllMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        importMenuItem = new javax.swing.JMenuItem();
        exportMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        printPreviewMenuItem = new javax.swing.JMenuItem();
        printMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        minimize2trayMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undoMenuItem = new javax.swing.JMenuItem();
        redoMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        findMenuItem = new javax.swing.JMenuItem();
        replaceMenuItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        settingsMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/gs/tools/trackdesk/i18n/Message"); // NOI18N
        setTitle(bundle.getString("lbl.application.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(800, 580));

        baseToolBar.setFloatable(false);
        baseToolBar.setRollover(true);

        newTaskToolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/new_task.png"))); // NOI18N
        newTaskToolButton.setFocusable(false);
        newTaskToolButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newTaskToolButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        baseToolBar.add(newTaskToolButton);

        getContentPane().add(baseToolBar, java.awt.BorderLayout.PAGE_START);

        statusToolBar.setRollover(true);
        getContentPane().add(statusToolBar, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout baseContainerPanelLayout = new javax.swing.GroupLayout(baseContainerPanel);
        baseContainerPanel.setLayout(baseContainerPanelLayout);
        baseContainerPanelLayout.setHorizontalGroup(
            baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        baseContainerPanelLayout.setVerticalGroup(
            baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        getContentPane().add(baseContainerPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setText(bundle.getString("lbl.file.menu")); // NOI18N

        newTaskMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newTaskMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/new_task.png"))); // NOI18N
        newTaskMenuItem.setText(bundle.getString("lbl.new.task.menu.item")); // NOI18N
        fileMenu.add(newTaskMenuItem);

        newNoteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/note_new.gif"))); // NOI18N
        newNoteMenuItem.setText(bundle.getString("lbl.new.note.menu.item")); // NOI18N
        fileMenu.add(newNoteMenuItem);
        fileMenu.add(jSeparator1);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/save_edit.gif"))); // NOI18N
        saveMenuItem.setText(bundle.getString("lbl.save.menu.item")); // NOI18N
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/saveas_edit.gif"))); // NOI18N
        saveAsMenuItem.setText(bundle.getString("lbl.save.as.menu.item")); // NOI18N
        fileMenu.add(saveAsMenuItem);

        saveAllMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAllMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/saveall_edit.gif"))); // NOI18N
        saveAllMenuItem.setText(bundle.getString("lbl.save.all.menu.item")); // NOI18N
        fileMenu.add(saveAllMenuItem);
        fileMenu.add(jSeparator2);

        importMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/import_wiz.gif"))); // NOI18N
        importMenuItem.setText(bundle.getString("lbl.import.menu.item")); // NOI18N
        fileMenu.add(importMenuItem);

        exportMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/export_wiz.gif"))); // NOI18N
        exportMenuItem.setText(bundle.getString("lbl.export.menu.item")); // NOI18N
        fileMenu.add(exportMenuItem);
        fileMenu.add(jSeparator3);

        printPreviewMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/printpreview.gif"))); // NOI18N
        printPreviewMenuItem.setText(bundle.getString("lbl.print.preview.menu.item")); // NOI18N
        fileMenu.add(printPreviewMenuItem);

        printMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        printMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/print_edit.gif"))); // NOI18N
        printMenuItem.setText(bundle.getString("lbl.print.menu.item")); // NOI18N
        fileMenu.add(printMenuItem);
        fileMenu.add(jSeparator7);

        minimize2trayMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        minimize2trayMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/hide.png"))); // NOI18N
        minimize2trayMenuItem.setText(bundle.getString("lbl.minimize2tray.menu.item")); // NOI18N
        minimize2trayMenuItem.addActionListener(formListener);
        fileMenu.add(minimize2trayMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/exit.png"))); // NOI18N
        exitMenuItem.setText(bundle.getString("lbl.exit.menu.item")); // NOI18N
        fileMenu.add(exitMenuItem);

        baseMenuBar.add(fileMenu);

        editMenu.setText(bundle.getString("lbl.edit.menu")); // NOI18N

        undoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/undo.png"))); // NOI18N
        undoMenuItem.setText(bundle.getString("lbl.undo.menu.item")); // NOI18N
        editMenu.add(undoMenuItem);

        redoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        redoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/redo.png"))); // NOI18N
        redoMenuItem.setText(bundle.getString("lbl.redo.menu.item")); // NOI18N
        editMenu.add(redoMenuItem);
        editMenu.add(jSeparator4);

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/cut_edit.gif"))); // NOI18N
        cutMenuItem.setText(bundle.getString("lbl.cut.menu.item")); // NOI18N
        editMenu.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/copy_edit.gif"))); // NOI18N
        copyMenuItem.setText(bundle.getString("lbl.copy.menu.item")); // NOI18N
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/paste.png"))); // NOI18N
        pasteMenuItem.setText(bundle.getString("lbl.paste.menu.item")); // NOI18N
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/delete.png"))); // NOI18N
        deleteMenuItem.setText(bundle.getString("lbl.delete.menu.item")); // NOI18N
        editMenu.add(deleteMenuItem);
        editMenu.add(jSeparator5);

        findMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        findMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/find.gif"))); // NOI18N
        findMenuItem.setText(bundle.getString("lbl.find.menu.item")); // NOI18N
        editMenu.add(findMenuItem);

        replaceMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        replaceMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/edit-replace.png"))); // NOI18N
        replaceMenuItem.setText(bundle.getString("lbl.replace.menu.item")); // NOI18N
        editMenu.add(replaceMenuItem);
        editMenu.add(jSeparator6);

        settingsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        settingsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gs/tools/trackdesk/images/settings.png"))); // NOI18N
        settingsMenuItem.setText(bundle.getString("lbl.settings.menu.item")); // NOI18N
        editMenu.add(settingsMenuItem);

        baseMenuBar.add(editMenu);

        viewMenu.setText(bundle.getString("lbl.view.menu")); // NOI18N

        jMenuItem7.setText("jMenuItem7");
        viewMenu.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        viewMenu.add(jMenuItem8);

        jMenuItem9.setText("jMenuItem9");
        viewMenu.add(jMenuItem9);

        jMenuItem10.setText("jMenuItem10");
        viewMenu.add(jMenuItem10);

        jMenuItem11.setText("jMenuItem11");
        viewMenu.add(jMenuItem11);

        jMenuItem12.setText("jMenuItem12");
        viewMenu.add(jMenuItem12);

        jMenuItem13.setText("jMenuItem13");
        viewMenu.add(jMenuItem13);

        jMenuItem14.setText("jMenuItem14");
        viewMenu.add(jMenuItem14);

        baseMenuBar.add(viewMenu);

        setJMenuBar(baseMenuBar);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == minimize2trayMenuItem) {
                TrackDeskFrame.this.minimize2trayMenuItemActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void minimize2trayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize2trayMenuItemActionPerformed
        ActionListener exitListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        minimizeToTray(this, new javax.swing.ImageIcon(getClass()
                .getResource("/com/gs/tools/trackdesk/images/sheduled_task.png")).getImage(),
                exitListener);
    }//GEN-LAST:event_minimize2trayMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseContainerPanel;
    private javax.swing.JMenuBar baseMenuBar;
    private javax.swing.JToolBar baseToolBar;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem findMenuItem;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenuItem minimize2trayMenuItem;
    private javax.swing.JMenuItem newNoteMenuItem;
    private javax.swing.JMenuItem newTaskMenuItem;
    private javax.swing.JButton newTaskToolButton;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem printMenuItem;
    private javax.swing.JMenuItem printPreviewMenuItem;
    private javax.swing.JMenuItem redoMenuItem;
    private javax.swing.JMenuItem replaceMenuItem;
    private javax.swing.JMenuItem saveAllMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem settingsMenuItem;
    private javax.swing.JToolBar statusToolBar;
    private javax.swing.JMenuItem undoMenuItem;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables

    public TrayIcon minimizeToTray(final Frame frame, final Image image, ActionListener exitListener) {
        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon = new TrayIcon(image, frame.getTitle(), popup);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trayIcon.displayMessage("Action Event",
                        "An Action Event Has Been Performed!",
                        TrayIcon.MessageType.INFO);
            }
        };
        if (SystemTray.isSupported()) {
            // get the SystemTray instance
            final SystemTray tray = SystemTray.getSystemTray();
            MouseListener mouseListener = new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                    if (MouseEvent.BUTTON1 == e.getButton() && e.getClickCount() == 2) {
                        tray.remove(trayIcon);
                        frame.setVisible(true);
                    }
                }

                public void mouseEntered(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse entered!");
                }

                public void mouseExited(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse exited!");
                }

                public void mousePressed(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse pressed!");
                }

                public void mouseReleased(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse released!");
                }
            };




            MenuItem restoreItem = new MenuItem("Restore");
            restoreItem.setShortcut(new MenuShortcut('R'));
            restoreItem.addActionListener(
                    new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tray.remove(trayIcon);
                    frame.setVisible(true);
                }
            });
            popup.add(restoreItem);

            MenuItem exitItem = new MenuItem("Exit");
            exitItem.addActionListener(exitListener);
            popup.add(exitItem);

            trayIcon.setImageAutoSize(true);
            trayIcon.addActionListener(actionListener);
            trayIcon.addMouseListener(mouseListener);

            try {
                tray.add(trayIcon);
                frame.setVisible(false);
            } catch (AWTException e) {
                System.err.println("TrayIcon could not be added.");
            }

            return trayIcon;
        } else {
            // disable tray option in your application or
            // perform other actions
        }
        return null;
    }
    
}