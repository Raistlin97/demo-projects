/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.tools.gsplit.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import net.sf.tools.gsplit.SplitterConstants;
import net.sf.tools.gsplit.ui.core.SecureSplitPanel;
import net.sf.tools.gsplit.util.WindowUtil;

/**
 *
 * @author SG1736
 */
public class GsplitBaseFrame extends javax.swing.JFrame {

    private static final WindowManager WINDOW_MANAGER = WindowManager.getManager();
    /**
     * Creates new form GsplitBaseFrame
     */
    public GsplitBaseFrame() {
        initComponents();
        WINDOW_MANAGER.baseDesktopPane = this.baseDesktopPane;
        WINDOW_MANAGER.windowManagerLabel = this.windowManagerLabel;
        WINDOW_MANAGER.windowManagerPopupMenu = this.windowManagerPopupMenu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        baseDesktopPopupMenu = new javax.swing.JPopupMenu();
        minimizeAllMenuItem = new javax.swing.JMenuItem();
        maximizeAllMenuItem = new javax.swing.JMenuItem();
        windowManagerPopupMenu = new javax.swing.JPopupMenu();
        showAllMenuItem = new javax.swing.JMenuItem();
        baseToolBar = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        baseStatusBar = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        windowManagerLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton6 = new javax.swing.JButton();
        baseDesktopPane = new javax.swing.JDesktopPane();
        baseMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        secureSplitMenuItem = new javax.swing.JMenuItem();
        secureJoinMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        flatMenuItem = new javax.swing.JMenuItem();
        flatJoinMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        textSplitMenuItem = new javax.swing.JMenuItem();
        textJoinMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        openMdatMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        minimize2trayMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        settingsMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        showToolbarChkbxMenuItem = new javax.swing.JCheckBoxMenuItem();
        showStatusbarChkbxMenuItem = new javax.swing.JCheckBoxMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        showLogMenuItem = new javax.swing.JMenuItem();
        openLogFileMenuItem = new javax.swing.JMenuItem();
        exploreLogFolderMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        FormListener formListener = new FormListener();

        minimizeAllMenuItem.setText("Minimize All");
        minimizeAllMenuItem.addActionListener(formListener);
        baseDesktopPopupMenu.add(minimizeAllMenuItem);

        maximizeAllMenuItem.setText("Maximize All");
        maximizeAllMenuItem.addActionListener(formListener);
        baseDesktopPopupMenu.add(maximizeAllMenuItem);

        showAllMenuItem.setText("Show All");
        showAllMenuItem.addActionListener(formListener);
        windowManagerPopupMenu.add(showAllMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baseToolBar.setRollover(true);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        baseToolBar.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        baseToolBar.add(jButton2);
        baseToolBar.add(jSeparator6);

        jButton3.setText("jButton3");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        baseToolBar.add(jButton3);

        jButton4.setText("jButton4");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        baseToolBar.add(jButton4);
        baseToolBar.add(jSeparator7);

        getContentPane().add(baseToolBar, java.awt.BorderLayout.PAGE_START);

        baseStatusBar.setFloatable(false);
        baseStatusBar.setRollover(true);
        baseStatusBar.setMaximumSize(new java.awt.Dimension(36, 25));
        baseStatusBar.setMinimumSize(new java.awt.Dimension(47, 23));
        baseStatusBar.setPreferredSize(new java.awt.Dimension(100, 23));

        jLabel1.setText(" ");
        baseStatusBar.add(jLabel1);

        windowManagerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/window-manager_24x24.png"))); // NOI18N
        windowManagerLabel.setText("Window Manager");
        windowManagerLabel.setEnabled(false);
        windowManagerLabel.addMouseListener(formListener);
        baseStatusBar.add(windowManagerLabel);
        baseStatusBar.add(jSeparator5);

        statusPanel.setLayout(new java.awt.GridBagLayout());

        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        statusPanel.add(statusLabel, gridBagConstraints);

        baseStatusBar.add(statusPanel);
        baseStatusBar.add(jSeparator8);

        jLabel4.setText("Current Process ");
        baseStatusBar.add(jLabel4);

        jProgressBar2.setMaximumSize(new java.awt.Dimension(160, 19));
        jProgressBar2.setMinimumSize(new java.awt.Dimension(160, 19));
        baseStatusBar.add(jProgressBar2);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stop.png"))); // NOI18N
        jButton6.setToolTipText("Stop");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        baseStatusBar.add(jButton6);

        getContentPane().add(baseStatusBar, java.awt.BorderLayout.PAGE_END);

        baseDesktopPane.setComponentPopupMenu(baseDesktopPopupMenu);
        baseDesktopPane.setMinimumSize(new java.awt.Dimension(500, 300));
        baseDesktopPane.setPreferredSize(new java.awt.Dimension(640, 350));
        getContentPane().add(baseDesktopPane, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        secureSplitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        secureSplitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-split.png"))); // NOI18N
        secureSplitMenuItem.setText("Secure Split");
        secureSplitMenuItem.addActionListener(formListener);
        fileMenu.add(secureSplitMenuItem);

        secureJoinMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        secureJoinMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-join.png"))); // NOI18N
        secureJoinMenuItem.setText("Secure Join");
        secureJoinMenuItem.addActionListener(formListener);
        fileMenu.add(secureJoinMenuItem);
        fileMenu.add(jSeparator1);

        flatMenuItem.setText("Flat Split");
        flatMenuItem.addActionListener(formListener);
        fileMenu.add(flatMenuItem);

        flatJoinMenuItem.setText("Flat Join");
        flatJoinMenuItem.addActionListener(formListener);
        fileMenu.add(flatJoinMenuItem);
        fileMenu.add(jSeparator2);

        textSplitMenuItem.setText("Text Split");
        textSplitMenuItem.addActionListener(formListener);
        fileMenu.add(textSplitMenuItem);

        textJoinMenuItem.setText("Text Join");
        textJoinMenuItem.addActionListener(formListener);
        fileMenu.add(textJoinMenuItem);
        fileMenu.add(jSeparator3);

        openMdatMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMdatMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file-splitter_16x16.png"))); // NOI18N
        openMdatMenuItem.setText("Open Metadata file");
        openMdatMenuItem.addActionListener(formListener);
        fileMenu.add(openMdatMenuItem);
        fileMenu.add(jSeparator4);

        minimize2trayMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        minimize2trayMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        minimize2trayMenuItem.setText("Minimize to Tray");
        minimize2trayMenuItem.addActionListener(formListener);
        fileMenu.add(minimize2trayMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(formListener);
        fileMenu.add(exitMenuItem);

        baseMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        settingsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        settingsMenuItem.setText("Settings");
        settingsMenuItem.addActionListener(formListener);
        editMenu.add(settingsMenuItem);

        baseMenuBar.add(editMenu);

        viewMenu.setText("View");

        showToolbarChkbxMenuItem.setSelected(true);
        showToolbarChkbxMenuItem.setText("Show Toolbar");
        showToolbarChkbxMenuItem.addActionListener(formListener);
        viewMenu.add(showToolbarChkbxMenuItem);

        showStatusbarChkbxMenuItem.setSelected(true);
        showStatusbarChkbxMenuItem.setText("Show Statusbar");
        showStatusbarChkbxMenuItem.addActionListener(formListener);
        viewMenu.add(showStatusbarChkbxMenuItem);
        viewMenu.add(jSeparator9);

        showLogMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file_extension_log.png"))); // NOI18N
        showLogMenuItem.setText("Show Log");
        showLogMenuItem.addActionListener(formListener);
        viewMenu.add(showLogMenuItem);

        openLogFileMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder_open_document_text.png"))); // NOI18N
        openLogFileMenuItem.setText("Open Log File");
        openLogFileMenuItem.addActionListener(formListener);
        viewMenu.add(openLogFileMenuItem);

        exploreLogFolderMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder_explore.png"))); // NOI18N
        exploreLogFolderMenuItem.setText("Open Log Folder");
        exploreLogFolderMenuItem.addActionListener(formListener);
        viewMenu.add(exploreLogFolderMenuItem);

        baseMenuBar.add(viewMenu);

        helpMenu.setText("Help");

        helpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        helpMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        helpMenuItem.setText("Help");
        helpMenuItem.addActionListener(formListener);
        helpMenu.add(helpMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(formListener);
        helpMenu.add(aboutMenuItem);

        baseMenuBar.add(helpMenu);

        setJMenuBar(baseMenuBar);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == secureSplitMenuItem) {
                GsplitBaseFrame.this.secureSplitMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == secureJoinMenuItem) {
                GsplitBaseFrame.this.secureJoinMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == flatMenuItem) {
                GsplitBaseFrame.this.flatMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == flatJoinMenuItem) {
                GsplitBaseFrame.this.flatJoinMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == textSplitMenuItem) {
                GsplitBaseFrame.this.textSplitMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == textJoinMenuItem) {
                GsplitBaseFrame.this.textJoinMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == openMdatMenuItem) {
                GsplitBaseFrame.this.openMdatMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == minimize2trayMenuItem) {
                GsplitBaseFrame.this.minimize2trayMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == exitMenuItem) {
                GsplitBaseFrame.this.exitMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == settingsMenuItem) {
                GsplitBaseFrame.this.settingsMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == showToolbarChkbxMenuItem) {
                GsplitBaseFrame.this.showToolbarChkbxMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == showStatusbarChkbxMenuItem) {
                GsplitBaseFrame.this.showStatusbarChkbxMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == showLogMenuItem) {
                GsplitBaseFrame.this.showLogMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == openLogFileMenuItem) {
                GsplitBaseFrame.this.openLogFileMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == exploreLogFolderMenuItem) {
                GsplitBaseFrame.this.exploreLogFolderMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == helpMenuItem) {
                GsplitBaseFrame.this.helpMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == aboutMenuItem) {
                GsplitBaseFrame.this.aboutMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == showAllMenuItem) {
                GsplitBaseFrame.this.showAllMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == minimizeAllMenuItem) {
                GsplitBaseFrame.this.minimizeAllMenuItemActionPerformed(evt);
            }
            else if (evt.getSource() == maximizeAllMenuItem) {
                GsplitBaseFrame.this.maximizeAllMenuItemActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == windowManagerLabel) {
                GsplitBaseFrame.this.windowManagerLabelMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == windowManagerLabel) {
                GsplitBaseFrame.this.windowManagerLabelMouseEntered(evt);
            }
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == windowManagerLabel) {
                GsplitBaseFrame.this.windowManagerLabelMouseExited(evt);
            }
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == windowManagerLabel) {
                GsplitBaseFrame.this.windowManagerLabelMousePressed(evt);
            }
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == windowManagerLabel) {
                GsplitBaseFrame.this.windowManagerLabelMouseReleased(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void flatMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flatMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flatMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void settingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsMenuItemActionPerformed

    private void secureSplitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secureSplitMenuItemActionPerformed
        if(WINDOW_MANAGER.containsFrame(WindowManager.SECURE_SPLIT_WINDOW_TITLE)){
            WINDOW_MANAGER.showFrame(WindowManager.SECURE_SPLIT_WINDOW_TITLE);
            return;
        }
        SecureSplitPanel secureSplitPanel = new SecureSplitPanel();
        BaseInternalFrame baseInternalFrame = new BaseInternalFrame(secureSplitPanel);
        baseInternalFrame.setTitle(WindowManager.SECURE_SPLIT_WINDOW_TITLE);
        baseInternalFrame.setFrameIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/images/arrow-split.png")));
        WINDOW_MANAGER.addIFrame(baseInternalFrame);
    }//GEN-LAST:event_secureSplitMenuItemActionPerformed

    private void secureJoinMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secureJoinMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secureJoinMenuItemActionPerformed

    private void flatJoinMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flatJoinMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flatJoinMenuItemActionPerformed

    private void textSplitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSplitMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSplitMenuItemActionPerformed

    private void textJoinMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJoinMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJoinMenuItemActionPerformed

    private void openMdatMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMdatMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMdatMenuItemActionPerformed

    private void minimize2trayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize2trayMenuItemActionPerformed
        WindowUtil.minimizeToTray(this, new javax.swing.ImageIcon(getClass()
				.getResource("/images/file-splitter_24x24.png")).getImage());
    }//GEN-LAST:event_minimize2trayMenuItemActionPerformed

    private void showToolbarChkbxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showToolbarChkbxMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showToolbarChkbxMenuItemActionPerformed

    private void showStatusbarChkbxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStatusbarChkbxMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showStatusbarChkbxMenuItemActionPerformed

    private void showLogMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLogMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showLogMenuItemActionPerformed

    private void openLogFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLogFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openLogFileMenuItemActionPerformed

    private void exploreLogFolderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreLogFolderMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exploreLogFolderMenuItemActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void windowManagerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_windowManagerLabelMouseClicked

    private void windowManagerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseEntered
        windowManagerLabel.setForeground(SplitterConstants.LINK_FG_COLOR);
        windowManagerLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_windowManagerLabelMouseEntered

    private void windowManagerLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseExited
        windowManagerLabel.setForeground(Color.BLACK);
        windowManagerLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_windowManagerLabelMouseExited

    private void windowManagerLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMousePressed
        if(MouseEvent.BUTTON1 == evt.getButton() && windowManagerLabel.isEnabled()){
           windowManagerPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY()); 
        }
    }//GEN-LAST:event_windowManagerLabelMousePressed

    private void windowManagerLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseReleased
        if(MouseEvent.BUTTON1 == evt.getButton() && windowManagerLabel.isEnabled()){
           windowManagerPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY()); 
        }
    }//GEN-LAST:event_windowManagerLabelMouseReleased

    private void showAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showAllMenuItemActionPerformed

    private void minimizeAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeAllMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeAllMenuItemActionPerformed

    private void maximizeAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizeAllMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maximizeAllMenuItemActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane baseDesktopPane;
    private javax.swing.JPopupMenu baseDesktopPopupMenu;
    private javax.swing.JMenuBar baseMenuBar;
    private javax.swing.JToolBar baseStatusBar;
    private javax.swing.JToolBar baseToolBar;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exploreLogFolderMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem flatJoinMenuItem;
    private javax.swing.JMenuItem flatMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem maximizeAllMenuItem;
    private javax.swing.JMenuItem minimize2trayMenuItem;
    private javax.swing.JMenuItem minimizeAllMenuItem;
    private javax.swing.JMenuItem openLogFileMenuItem;
    private javax.swing.JMenuItem openMdatMenuItem;
    private javax.swing.JMenuItem secureJoinMenuItem;
    private javax.swing.JMenuItem secureSplitMenuItem;
    private javax.swing.JMenuItem settingsMenuItem;
    private javax.swing.JMenuItem showAllMenuItem;
    private javax.swing.JMenuItem showLogMenuItem;
    private javax.swing.JCheckBoxMenuItem showStatusbarChkbxMenuItem;
    private javax.swing.JCheckBoxMenuItem showToolbarChkbxMenuItem;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JMenuItem textJoinMenuItem;
    private javax.swing.JMenuItem textSplitMenuItem;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JLabel windowManagerLabel;
    private javax.swing.JPopupMenu windowManagerPopupMenu;
    // End of variables declaration//GEN-END:variables
}
