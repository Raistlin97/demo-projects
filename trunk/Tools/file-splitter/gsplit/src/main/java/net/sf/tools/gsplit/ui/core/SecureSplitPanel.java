/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.tools.gsplit.ui.core;

/**
 *
 * @author SG1736
 */
public class SecureSplitPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecureSplitPanel
     */
    public SecureSplitPanel() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        splitterPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        splitterSourceTextField = new javax.swing.JTextField();
        browseSplitterSourceButton = new javax.swing.JButton();
        fileSizeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        splitterTargetTextField = new javax.swing.JTextField();
        browseSplitterTargetButton = new javax.swing.JButton();
        splitterProgressBar = new javax.swing.JProgressBar();
        splitterStopButton = new javax.swing.JButton();
        splitterStartButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        splitterPartSizeTextField = new javax.swing.JTextField();
        byteComboBox = new javax.swing.JComboBox();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel3.setPreferredSize(new java.awt.Dimension(454, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Secure Splitter");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-split.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        splitterPanel.setMinimumSize(new java.awt.Dimension(384, 137));
        splitterPanel.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Source File");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterSourceTextField, gridBagConstraints);

        browseSplitterSourceButton.setText("Browse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(browseSplitterSourceButton, gridBagConstraints);

        fileSizeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fileSizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(fileSizeLabel, gridBagConstraints);

        jLabel5.setText("Target Folder");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterTargetTextField, gridBagConstraints);

        browseSplitterTargetButton.setText("Browse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(browseSplitterTargetButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterProgressBar, gridBagConstraints);

        splitterStopButton.setText("Stop");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterStopButton, gridBagConstraints);

        splitterStartButton.setText("Start");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterStartButton, gridBagConstraints);

        jLabel13.setText("Max Part File Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(jLabel13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(splitterPartSizeTextField, gridBagConstraints);

        byteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BYTE", "KB", "MB", "GB" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        splitterPanel.add(byteComboBox, gridBagConstraints);

        add(splitterPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseSplitterSourceButton;
    private javax.swing.JButton browseSplitterTargetButton;
    private javax.swing.JComboBox byteComboBox;
    private javax.swing.JLabel fileSizeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel splitterPanel;
    private javax.swing.JTextField splitterPartSizeTextField;
    private javax.swing.JProgressBar splitterProgressBar;
    private javax.swing.JTextField splitterSourceTextField;
    private javax.swing.JButton splitterStartButton;
    private javax.swing.JButton splitterStopButton;
    private javax.swing.JTextField splitterTargetTextField;
    // End of variables declaration//GEN-END:variables
}
