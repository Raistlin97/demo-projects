/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.tools.zipsys.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import net.sf.tools.zipsys.ZipSysConstants;
import net.sf.utils.gui.ResourceBundleManager;
import net.sf.utils.gui.WindowUtil;

/**
 *
 * @author SG1736
 */
public class ZipsysFrame extends javax.swing.JFrame {
    private static final WindowManager WINDOW_MANAGER = WindowManager.getManager();
    private static ResourceBundle bundle
            = ResourceBundleManager.getBundleManager().getResourceBundle();
    /**
     * Creates new form ZipsysFrame
     */
    public ZipsysFrame() {
        setTitle(bundle.getString("app.title")
                + " " + bundle.getString("app.version"));
        setSize(800, 540);
        setMinimumSize(getSize());
        setIconImage((new ImageIcon(getClass()
                .getResource("/images/zipsys-24x24.png"))).getImage());
        WindowUtil.bringToCenter(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
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

        windowManagerPopupMenu = new javax.swing.JPopupMenu();
        showAllMenuItem = new javax.swing.JMenuItem();
        baseDesktopPopupMenu = new javax.swing.JPopupMenu();
        minimizeAllMenuItem = new javax.swing.JMenuItem();
        maximizeAllMenuItem = new javax.swing.JMenuItem();
        baseToolBar = new javax.swing.JToolBar();
        baseStatusBar = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        windowManagerLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        baseDesktopPane = new javax.swing.JDesktopPane();
        desktopImageLabel = new javax.swing.JLabel();
        appMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newZipFileMenuItem = new javax.swing.JMenuItem();
        openZipMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        minimize2trayMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        settingsMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        showToolbarChkbxMenuItem = new javax.swing.JCheckBoxMenuItem();
        showStatusbarChkbxMenuItem = new javax.swing.JCheckBoxMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        windowsMenu = new javax.swing.JMenu();
        windowsTilesMenuItem = new javax.swing.JMenuItem();
        windowsCascadeMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        showAllMenuItem.setText(bundle.getString("window.manager.popup.show.all.text")); // NOI18N
        showAllMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllMenuItemActionPerformed(evt);
            }
        });
        windowManagerPopupMenu.add(showAllMenuItem);

        minimizeAllMenuItem.setText(bundle.getString("desktop.popup.minimize.all.text")); // NOI18N
        minimizeAllMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeAllMenuItemActionPerformed(evt);
            }
        });
        baseDesktopPopupMenu.add(minimizeAllMenuItem);

        maximizeAllMenuItem.setText(bundle.getString("desktop.popup.maximize.all.text")); // NOI18N
        maximizeAllMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximizeAllMenuItemActionPerformed(evt);
            }
        });
        baseDesktopPopupMenu.add(maximizeAllMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(bundle.getString("app.title")); // NOI18N
        getContentPane().setLayout(new java.awt.BorderLayout());

        baseToolBar.setRollover(true);
        getContentPane().add(baseToolBar, java.awt.BorderLayout.PAGE_START);

        baseStatusBar.setFloatable(false);
        baseStatusBar.setRollover(true);
        baseStatusBar.setMaximumSize(new java.awt.Dimension(36, 25));
        baseStatusBar.setMinimumSize(new java.awt.Dimension(47, 23));
        baseStatusBar.setPreferredSize(new java.awt.Dimension(100, 23));

        jLabel1.setText(" ");
        baseStatusBar.add(jLabel1);

        windowManagerLabel.setText(bundle.getString("Window.Manager.Text")); // NOI18N
        windowManagerLabel.setEnabled(false);
        windowManagerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                windowManagerLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                windowManagerLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                windowManagerLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                windowManagerLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                windowManagerLabelMouseReleased(evt);
            }
        });
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

        getContentPane().add(baseStatusBar, java.awt.BorderLayout.PAGE_END);

        baseDesktopPane.setDoubleBuffered(true);
        baseDesktopPane.setMinimumSize(new java.awt.Dimension(500, 300));
        baseDesktopPane.setPreferredSize(new java.awt.Dimension(640, 350));
        baseDesktopPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                baseDesktopPaneComponentResized(evt);
            }
        });

        desktopImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder_zip-256x256.png"))); // NOI18N
        desktopImageLabel.setMaximumSize(new java.awt.Dimension(2640, 264));
        desktopImageLabel.setMinimumSize(new java.awt.Dimension(260, 260));
        desktopImageLabel.setPreferredSize(new java.awt.Dimension(2640, 264));
        baseDesktopPane.add(desktopImageLabel);
        desktopImageLabel.setBounds(364, 114, 260, 240);

        getContentPane().add(baseDesktopPane, java.awt.BorderLayout.CENTER);

        fileMenu.setText(bundle.getString("fileMenu.text")); // NOI18N

        newZipFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newZipFileMenuItem.setText(bundle.getString("newZipFileMenuItem.text")); // NOI18N
        newZipFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newZipFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newZipFileMenuItem);

        openZipMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openZipMenuItem.setText(bundle.getString("openZipMenuItem.text")); // NOI18N
        fileMenu.add(openZipMenuItem);
        fileMenu.add(jSeparator1);

        minimize2trayMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        minimize2trayMenuItem.setText(bundle.getString("minimize2trayMenuItem.text")); // NOI18N
        minimize2trayMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimize2trayMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(minimize2trayMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setText(bundle.getString("exitMenuItem.text")); // NOI18N
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        appMenuBar.add(fileMenu);

        editMenu.setText(bundle.getString("editMenu.text")); // NOI18N
        editMenu.setActionCommand("");

        settingsMenuItem.setText(bundle.getString("settingsMenuItem.text")); // NOI18N
        settingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(settingsMenuItem);

        appMenuBar.add(editMenu);

        viewMenu.setText(bundle.getString("viewMenu.text")); // NOI18N
        viewMenu.setActionCommand("");

        showToolbarChkbxMenuItem.setSelected(true);
        showToolbarChkbxMenuItem.setText(bundle.getString("showToolbarChkbxMenuItem.text")); // NOI18N
        showToolbarChkbxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showToolbarChkbxMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(showToolbarChkbxMenuItem);

        showStatusbarChkbxMenuItem.setSelected(true);
        showStatusbarChkbxMenuItem.setText(bundle.getString("showStatusbarChkbxMenuItem.text")); // NOI18N
        showStatusbarChkbxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStatusbarChkbxMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(showStatusbarChkbxMenuItem);
        viewMenu.add(jSeparator9);

        windowsMenu.setText(bundle.getString("windowsMenu.text")); // NOI18N

        windowsTilesMenuItem.setText(bundle.getString("windowsTilesMenuItem.text")); // NOI18N
        windowsTilesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowsTilesMenuItemActionPerformed(evt);
            }
        });
        windowsMenu.add(windowsTilesMenuItem);

        windowsCascadeMenuItem.setText(bundle.getString("windowsCascadeMenuItem.text")); // NOI18N
        windowsCascadeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowsCascadeMenuItemActionPerformed(evt);
            }
        });
        windowsMenu.add(windowsCascadeMenuItem);

        viewMenu.add(windowsMenu);

        appMenuBar.add(viewMenu);

        helpMenu.setText(bundle.getString("helpMenu.text")); // NOI18N
        helpMenu.setActionCommand("");

        helpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        helpMenuItem.setText(bundle.getString("helpMenuItem.text")); // NOI18N
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(helpMenuItem);

        aboutMenuItem.setText(bundle.getString("aboutMenuItem.text")); // NOI18N
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        appMenuBar.add(helpMenu);

        setJMenuBar(appMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimize2trayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize2trayMenuItemActionPerformed
        ActionListener exitListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        WindowUtil.minimizeToTray(this, new javax.swing.ImageIcon(getClass()
            .getResource("/images/zipsys-24x24.png")).getImage(),
        exitListener);
    }//GEN-LAST:event_minimize2trayMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void showToolbarChkbxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showToolbarChkbxMenuItemActionPerformed
        if (!showToolbarChkbxMenuItem.isSelected()) {
            baseToolBar.setVisible(false);
        } else {
            baseToolBar.setVisible(true);
        }
    }//GEN-LAST:event_showToolbarChkbxMenuItemActionPerformed

    private void showStatusbarChkbxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStatusbarChkbxMenuItemActionPerformed
        if (!showStatusbarChkbxMenuItem.isSelected()) {
            baseStatusBar.setVisible(false);
        } else {
            baseStatusBar.setVisible(true);
        }
    }//GEN-LAST:event_showStatusbarChkbxMenuItemActionPerformed

    private void windowsTilesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowsTilesMenuItemActionPerformed
        WINDOW_MANAGER.tileWindows(baseDesktopPane);
    }//GEN-LAST:event_windowsTilesMenuItemActionPerformed

    private void windowsCascadeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowsCascadeMenuItemActionPerformed
        WINDOW_MANAGER.cascadeWindows(baseDesktopPane);
    }//GEN-LAST:event_windowsCascadeMenuItemActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed

    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed

    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void settingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsMenuItemActionPerformed

    }//GEN-LAST:event_settingsMenuItemActionPerformed

    private void windowManagerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_windowManagerLabelMouseClicked

    private void windowManagerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseEntered
        windowManagerLabel.setForeground(ZipSysConstants.LINK_FG_COLOR);
        windowManagerLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_windowManagerLabelMouseEntered

    private void windowManagerLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseExited
        windowManagerLabel.setForeground(Color.BLACK);
        windowManagerLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_windowManagerLabelMouseExited

    private void windowManagerLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMousePressed
        if (MouseEvent.BUTTON1 == evt.getButton() && windowManagerLabel.isEnabled()) {
            windowManagerPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_windowManagerLabelMousePressed

    private void windowManagerLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowManagerLabelMouseReleased
        if (MouseEvent.BUTTON1 == evt.getButton() && windowManagerLabel.isEnabled()) {
            windowManagerPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_windowManagerLabelMouseReleased

    private void showAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllMenuItemActionPerformed
        WINDOW_MANAGER.showAllFrames();
    }//GEN-LAST:event_showAllMenuItemActionPerformed

    private void minimizeAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeAllMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeAllMenuItemActionPerformed

    private void maximizeAllMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizeAllMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maximizeAllMenuItemActionPerformed

    private void baseDesktopPaneComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_baseDesktopPaneComponentResized
        Dimension d = baseDesktopPane.getSize();
        int x = d.width - 264;
        int y = d.height - 264;
        desktopImageLabel.setBounds(x, y, 260, 260);
    }//GEN-LAST:event_baseDesktopPaneComponentResized

    private void newZipFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newZipFileMenuItemActionPerformed
        
    }//GEN-LAST:event_newZipFileMenuItemActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuBar appMenuBar;
    private javax.swing.JDesktopPane baseDesktopPane;
    private javax.swing.JPopupMenu baseDesktopPopupMenu;
    private javax.swing.JToolBar baseStatusBar;
    private javax.swing.JToolBar baseToolBar;
    private javax.swing.JLabel desktopImageLabel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem maximizeAllMenuItem;
    private javax.swing.JMenuItem minimize2trayMenuItem;
    private javax.swing.JMenuItem minimizeAllMenuItem;
    private javax.swing.JMenuItem newZipFileMenuItem;
    private javax.swing.JMenuItem openZipMenuItem;
    private javax.swing.JMenuItem settingsMenuItem;
    private javax.swing.JMenuItem showAllMenuItem;
    private javax.swing.JCheckBoxMenuItem showStatusbarChkbxMenuItem;
    private javax.swing.JCheckBoxMenuItem showToolbarChkbxMenuItem;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JLabel windowManagerLabel;
    private javax.swing.JPopupMenu windowManagerPopupMenu;
    private javax.swing.JMenuItem windowsCascadeMenuItem;
    private javax.swing.JMenu windowsMenu;
    private javax.swing.JMenuItem windowsTilesMenuItem;
    // End of variables declaration//GEN-END:variables
}
