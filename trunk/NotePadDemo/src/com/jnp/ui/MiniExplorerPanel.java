/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MiniExplorerPanel.java
 *
 * Created on Jun 29, 2009, 11:28:33 AM
 */

package com.jnp.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author sabuj.das
 */
public class MiniExplorerPanel extends javax.swing.JPanel 
        implements ActionListener, TreeExpansionListener,
        TreeSelectionListener, MouseListener{
    public static final String COLLAPSE_PATH_ACTION = "COLLAPSE_PATH_ACTION";
    public static final String EXPAND_PATH_ACTION = "EXPAND_PATH_ACTION";
    public static final String OPEN_IN_EDITOR = "OPEN_IN_EDITOR";
    public static final String CREATE_NEW_FOLDER = "CREATE_NEW_FOLDER";
    public static final String DELETE_SELECTED_FILE = "DELETE_SELECTED_FILE";
    public static final String RENAME_SELECTED_FILE = "RENAME_SELECTED_FILE";
    public static final String REFRESH_DIRECTORY_TREE = "REFRESH_DIRECTORY_TREE";

    private JNPMainFrame parentAppFrame;
    protected TreePath m_clickedPath;
    DirectoryTree directoryTree = new DirectoryTree();
    String[] fsRootNames;

    protected JPopupMenu m_popup;
    protected Action m_action;

    /** Creates new form MiniExplorerPanel */
    public MiniExplorerPanel(final JNPMainFrame parentAppFrame) {
        this.parentAppFrame = parentAppFrame;
        File[] roots = File.listRoots();
        fsRootNames = new String[roots.length+1];
        fsRootNames[0] = "Select";
        for (int i = 0; i < roots.length; i++) {
          fsRootNames[i+1] = roots[i].getPath();
        }
        initComponents();
        directoryTree.addTreeExpansionListener(this);
        directoryTree.addTreeSelectionListener(this);
        directoryTree.addMouseListener(this);
        
        m_popup = new JPopupMenu();
        m_action = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (m_clickedPath == null) {
                    return;
                }
                if (directoryTree.isExpanded(m_clickedPath)) {
                    directoryTree.collapsePath(m_clickedPath);
                } else {
                    directoryTree.expandPath(m_clickedPath);
                }
            }
        };
        
        m_popup.add(m_action);
        m_popup.addSeparator();

        Action a1 = new AbstractAction("Delete") {

            public void actionPerformed(ActionEvent e) {
                directoryTree.repaint();
                JOptionPane.showMessageDialog(parentAppFrame,
                        "Delete option is not implemented",
                        "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        };
        m_popup.add(a1);

        Action a2 = new AbstractAction("Rename") {

            public void actionPerformed(ActionEvent e) {
                directoryTree.repaint();
                JOptionPane.showMessageDialog(parentAppFrame,
                        "Rename option is not implemented",
                        "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        };
        m_popup.add(a2);
        directoryTree.add(directoryTreePopup);


        JScrollPane s = new JScrollPane();
        s.getViewport().add(directoryTree);
        dirInfoPanel.add(s, BorderLayout.CENTER);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        directoryTreePopup = new javax.swing.JPopupMenu();
        expColMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        openFileMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        addDirMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        renameMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        refreshMenuItem = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        refreshButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        addDirButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        renameButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        rootComboBox = new javax.swing.JComboBox();
        dirInfoPanel = new javax.swing.JPanel();

        directoryTreePopup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                directoryTreePopupPopupMenuWillBecomeVisible(evt);
            }
        });
        directoryTreePopup.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                directoryTreePopupComponentShown(evt);
            }
        });

        expColMenuItem.addActionListener(this);
        expColMenuItem.setText("Expand");
        directoryTreePopup.add(expColMenuItem);
        directoryTreePopup.add(jSeparator5);

        openFileMenuItem.setActionCommand(OPEN_IN_EDITOR);
        openFileMenuItem.addActionListener(this);
        openFileMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open.gif"))); // NOI18N
        openFileMenuItem.setText("Open in Editor");
        directoryTreePopup.add(openFileMenuItem);
        directoryTreePopup.add(jSeparator3);

        addDirMenuItem.addActionListener(this);
        addDirMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newfolder_wiz.gif"))); // NOI18N
        addDirMenuItem.setActionCommand(CREATE_NEW_FOLDER);
        addDirMenuItem.setText("Add Folder");
        directoryTreePopup.add(addDirMenuItem);

        deleteMenuItem.addActionListener(this);
        deleteMenuItem.setActionCommand(DELETE_SELECTED_FILE);
        deleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_close.png"))); // NOI18N
        deleteMenuItem.setText("Delete");
        directoryTreePopup.add(deleteMenuItem);

        renameMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rename.gif"))); // NOI18N
        renameMenuItem.setText("Rename");
        directoryTreePopup.add(renameMenuItem);
        directoryTreePopup.add(jSeparator4);

        refreshMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reload_green.png"))); // NOI18N
        refreshMenuItem.setText("Refresh");
        directoryTreePopup.add(refreshMenuItem);

        setLayout(new java.awt.GridBagLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reload_green.png"))); // NOI18N
        refreshButton.setToolTipText("Refresh");
        refreshButton.setFocusable(false);
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(refreshButton);
        jToolBar1.add(jSeparator1);

        addDirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newfolder_wiz.gif"))); // NOI18N
        addDirButton.setToolTipText("Add Directory");
        addDirButton.setEnabled(false);
        addDirButton.setFocusable(false);
        addDirButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addDirButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(addDirButton);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_close.png"))); // NOI18N
        deleteButton.setToolTipText("Delete Directory");
        deleteButton.setEnabled(false);
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(deleteButton);

        renameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rename.gif"))); // NOI18N
        renameButton.setToolTipText("Rename");
        renameButton.setEnabled(false);
        renameButton.setFocusable(false);
        renameButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        renameButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(renameButton);
        jToolBar1.add(jSeparator2);

        jLabel1.setText("ROOT :  ");
        jToolBar1.add(jLabel1);

        rootComboBox.setModel(new javax.swing.DefaultComboBoxModel(fsRootNames));
        jToolBar1.add(rootComboBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jToolBar1, gridBagConstraints);

        dirInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        dirInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        dirInfoPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(dirInfoPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void directoryTreePopupPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_directoryTreePopupPopupMenuWillBecomeVisible
        if(evt.getSource().equals(directoryTree)){
            TreePath p = directoryTree.getSelectionPath();
            if(p==null)
                return;
            DefaultMutableTreeNode node = directoryTree.getTreeNode(p);
            if(node == null)
                return;
            FileNode fnode = directoryTree.getFileNode(node);
            if (fnode == null) {
                return;
            }
            
        }
    }//GEN-LAST:event_directoryTreePopupPopupMenuWillBecomeVisible

    private void directoryTreePopupComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_directoryTreePopupComponentShown
        if(evt.getSource().equals(directoryTree)){
            TreePath p = directoryTree.getSelectionPath();
            if(p==null)
                return;
            DefaultMutableTreeNode node = directoryTree.getTreeNode(p);
            if(node == null)
                return;
            FileNode fnode = directoryTree.getFileNode(node);
            if (fnode == null) {
                return;
            }

        }
    }//GEN-LAST:event_directoryTreePopupComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDirButton;
    private javax.swing.JMenuItem addDirMenuItem;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JPanel dirInfoPanel;
    private javax.swing.JPopupMenu directoryTreePopup;
    private javax.swing.JMenuItem expColMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem openFileMenuItem;
    private javax.swing.JButton refreshButton;
    private javax.swing.JMenuItem refreshMenuItem;
    private javax.swing.JButton renameButton;
    private javax.swing.JMenuItem renameMenuItem;
    private javax.swing.JComboBox rootComboBox;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(EXPAND_PATH_ACTION.equals(cmd)){
            if (m_clickedPath == null) {
                return;
            }
            if (!directoryTree.isExpanded(m_clickedPath)) {
                directoryTree.expandPath(m_clickedPath);
            }
        }else if(COLLAPSE_PATH_ACTION.equals(cmd)){
            if (m_clickedPath == null) {
                return;
            }
            if (directoryTree.isExpanded(m_clickedPath)) {
                directoryTree.collapsePath(m_clickedPath);
            }
        } else if(OPEN_IN_EDITOR.equals(cmd)){
            TreePath p = m_clickedPath;
            if(p==null)
                return;
            DefaultMutableTreeNode node = directoryTree.getTreeNode(p);
            if(node == null)
                return;
            FileNode fnode = directoryTree.getFileNode(node);
            if (fnode == null) {
                return;
            }
            if(fnode.m_file.isFile()){
                parentAppFrame.openFile(fnode.m_file.getAbsolutePath());
            }
        } else if(CREATE_NEW_FOLDER.equals(cmd)){
            TreePath p = m_clickedPath;
            if(p==null)
                return;
            DefaultMutableTreeNode node = directoryTree.getTreeNode(p);
            if(node == null)
                return;
            FileNode fnode = directoryTree.getFileNode(node);
            if (fnode == null) {
                return;
            }
            if(fnode.m_file.isDirectory()){
                String dirName = JOptionPane.showInputDialog(parentAppFrame,
                        "New Folder", "New Folder Name : ");
                if(null != dirName){
                    File dir = new File(fnode.m_file, dirName);
                    dir.mkdir();
                    //directoryTree.getTreeModel().reload();
                    FileNode newNode = new FileNode(dir);
                    
                    IconData idata = new IconData(
                            directoryTree.getICON_FOLDER_CLOSED(),
                            directoryTree.getICON_FOLDER_OPENED(),
                            newNode);

                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(idata);
                    node.add(n);
                    directoryTree.getTreeModel().reload();
                    directoryTree.expandPath(m_clickedPath);
                }
            }
        } else if(DELETE_SELECTED_FILE.equals(cmd)){
            TreePath p = m_clickedPath;
            if(p==null)
                return;
            DefaultMutableTreeNode node = directoryTree.getTreeNode(p);
            if(node == null)
                return;
            FileNode fnode = directoryTree.getFileNode(node);
            if (fnode == null) {
                return;
            }
            if(fnode.m_file.isDirectory()){
                int opt = JOptionPane.showConfirmDialog(parentAppFrame,
                        fnode.m_file.getName() + " will be deleted permanently.\n" +
                        "Do you want to continue?",
                        "Delete !!!", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if(JOptionPane.YES_OPTION == opt){
                    DefaultMutableTreeNode pN = (DefaultMutableTreeNode) node.getParent();
                    pN.remove(node);
                    fnode.m_file.delete();
                    directoryTree.getTreeModel().reload();
                }
            }
        } else if(RENAME_SELECTED_FILE.equals(cmd)){

        } else if(REFRESH_DIRECTORY_TREE.equals(cmd)){

        }
    }

    public void treeExpanded(TreeExpansionEvent event) {
        if(event.getSource().equals(directoryTree)){
            final DefaultMutableTreeNode node =
                    directoryTree.getTreeNode(event.getPath());
			final FileNode fnode = directoryTree.getFileNode(node);
			if (fnode != null && fnode.expand(node)) {
                directoryTree.getTreeModel().reload(node);
			}
        }
    }

    public void treeCollapsed(TreeExpansionEvent event) {
        
    }

    public void valueChanged(TreeSelectionEvent event) {
        DefaultMutableTreeNode node = directoryTree.getTreeNode(event.getPath());
        FileNode fnode = directoryTree.getFileNode(node);
        if (fnode != null) {
            if(fnode.m_file.isDirectory()){
                addDirButton.setEnabled(true);
                deleteButton.setEnabled(true);
                renameButton.setEnabled(true);
            }else if(fnode.m_file.isFile()){
                addDirButton.setEnabled(false);
                deleteButton.setEnabled(true);
                renameButton.setEnabled(true);
            }
        } else {
            addDirButton.setEnabled(false);
            deleteButton.setEnabled(false);
            renameButton.setEnabled(false);
        }
    }

    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(directoryTree)){
            TreePath p = directoryTree.getSelectionPath();
            if(p==null)
                return;
            DefaultMutableTreeNode node = directoryTree.getTreeNode(p);
            if(node == null)
                return;
            FileNode fnode = directoryTree.getFileNode(node);
            if (fnode == null) {
                return;
            }
            if(MouseEvent.BUTTON1 == e.getButton()){
                if(fnode.m_file.isFile()){
                    if(e.getClickCount() == 2){
                        parentAppFrame.openFile(fnode.m_file.getAbsolutePath());
                    }
                }
            }
        }
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            int x = e.getX();
            int y = e.getY();
            TreePath path = directoryTree.getPathForLocation(x, y);
            if(path == null)
                return;
            m_clickedPath = path;
            DefaultMutableTreeNode node = directoryTree.getTreeNode(path);
            if(node == null)
                return;
            FileNode fnode = directoryTree.getFileNode(node);
            if (fnode == null) {
                return;
            }else{
                if(fnode.m_file.isFile()){
                    openFileMenuItem.setEnabled(true);
                    expColMenuItem.setEnabled(false);
                    addDirMenuItem.setEnabled(false);
                    deleteMenuItem.setEnabled(true);
                    renameButton.setEnabled(true);
                }else{
                    openFileMenuItem.setEnabled(false);
                    expColMenuItem.setEnabled(true);
                    addDirMenuItem.setEnabled(true);
                    deleteMenuItem.setEnabled(true);
                    renameButton.setEnabled(true);
                    if (directoryTree.isExpanded(path)) {
                        expColMenuItem.setText("Collapse");
                        expColMenuItem.setActionCommand(COLLAPSE_PATH_ACTION);
                    } else {
                        expColMenuItem.setText("Expand");
                        expColMenuItem.setActionCommand(EXPAND_PATH_ACTION);
                    }
                }
            }
            directoryTreePopup.show(directoryTree, x, y);
        }
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }

    class PopupTrigger extends MouseAdapter {

        public void mouseReleased(MouseEvent e) {
            if (e.isPopupTrigger()) {
                int x = e.getX();
                int y = e.getY();
                TreePath path = directoryTree.getPathForLocation(x, y);
                if (path != null) {
                    if (directoryTree.isExpanded(path)) {
                        //m_action.putValue(Action.NAME, "Collapse");
                    } else {
                        //m_action.putValue(Action.NAME, "Expand");
                    }
                    //m_popup.show(m_tree, x, y);
                    //m_clickedPath = path;
                }
            }
        }
    }
}