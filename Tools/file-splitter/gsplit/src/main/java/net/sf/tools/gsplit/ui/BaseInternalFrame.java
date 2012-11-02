/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.tools.gsplit.ui;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author SG1736
 */
public class BaseInternalFrame extends javax.swing.JInternalFrame {

    private JPanel workerPanel;
    
    /**
     * Creates new form BaseInternalFrame
     */
    public BaseInternalFrame() {
        initComponents();
        addInternalFrameListener(WindowManager.getManager());
    }

    public BaseInternalFrame(JPanel workerPanel) {
        this.workerPanel = workerPanel;
        initComponents();
        addInternalFrameListener(WindowManager.getManager());
        if(null != workerPanel)
            containerPanel.add(workerPanel, BorderLayout.CENTER);
        containerPanel.updateUI();
    }

    public void setWorkerPanel(JPanel workerPanel) {
        this.workerPanel = workerPanel;
        if(null != workerPanel)
            containerPanel.add(workerPanel, BorderLayout.CENTER);
        containerPanel.updateUI();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Base");
        setMinimumSize(new java.awt.Dimension(680, 350));
        setPreferredSize(new java.awt.Dimension(680, 350));

        containerPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(containerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    // End of variables declaration//GEN-END:variables
}
