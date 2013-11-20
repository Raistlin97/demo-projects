/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gs.tools.doc.extractor.app.view;

import com.gs.tools.doc.extractor.core.WebDocumentExtractor;
import com.gs.tools.doc.extractor.core.html.HTMLDocumentExtractor;
import com.gs.utils.enums.DisplayTypeEnum;
import com.gs.utils.swing.display.DisplayUtils;
import com.gs.utils.swing.file.FileBrowserUtil;
import com.gs.utils.swing.window.WindowUtil;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author SG1736
 */
public class DocumentExtractorFrame extends javax.swing.JFrame {

    private final WebDocumentExtractor documentExtractor = new HTMLDocumentExtractor();
    private File selectedFolder;

    /**
     * Creates new form DocumentExtractorFrame
     */
    public DocumentExtractorFrame() {
        initComponents();
        startButton.setEnabled(false);
        openTargetFolderButton.setEnabled(false);
        extractionProgressBar.setVisible(false);
        extractionProgressBar.setIndeterminate(true);
        logTextArea.setTabSize(4);

        DocumentListener extractorDocumentListener = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButtonVisibility();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButtonVisibility();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButtonVisibility();
            }

            private void updateButtonVisibility() {
                if (null != sourceUrlTextField.getText()
                        && !"".equals(sourceUrlTextField.getText())
                        && null != folderNameTextField.getText()
                        && !"".equals(folderNameTextField.getText())) {
                    startButton.setEnabled(true);
                    openTargetFolderButton.setEnabled(true);
                } else {
                    startButton.setEnabled(false);
                    openTargetFolderButton.setEnabled(false);
                }
            }
        };

        sourceUrlTextField.getDocument().addDocumentListener(extractorDocumentListener);
        folderNameTextField.getDocument().addDocumentListener(extractorDocumentListener);

        WindowUtil.bringToCenter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseContainerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sourceUrlTextField = new javax.swing.JTextField();
        folderNameTextField = new javax.swing.JTextField();
        browseTargetFolderButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        extractionProgressBar = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        clearLogButton = new javax.swing.JButton();
        openTargetFolderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEB Document Extractor");
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(640, 380));
        setPreferredSize(new java.awt.Dimension(640, 380));

        jLabel1.setText("Source");

        jLabel2.setText("Target");

        sourceUrlTextField.setForeground(new java.awt.Color(0, 0, 204));
        sourceUrlTextField.setText("http://docs.spring.io/spring/docs/3.2.4.RELEASE/spring-framework-reference/html/");

        folderNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                folderNameTextFieldFocusLost(evt);
            }
        });

        browseTargetFolderButton.setText("Browse");
        browseTargetFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseTargetFolderButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Log");

        logTextArea.setEditable(false);
        logTextArea.setBackground(new java.awt.Color(240, 240, 240));
        logTextArea.setColumns(20);
        logTextArea.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        logTextArea.setRows(5);
        logTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(logTextArea);

        clearLogButton.setText("Clear Log");
        clearLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLogButtonActionPerformed(evt);
            }
        });

        openTargetFolderButton.setText("Open Target Location");
        openTargetFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTargetFolderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout baseContainerPanelLayout = new javax.swing.GroupLayout(baseContainerPanel);
        baseContainerPanel.setLayout(baseContainerPanelLayout);
        baseContainerPanelLayout.setHorizontalGroup(
            baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(baseContainerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sourceUrlTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                    .addGroup(baseContainerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extractionProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(folderNameTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(browseTargetFolderButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(baseContainerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseContainerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(openTargetFolderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearLogButton)))
                .addContainerGap())
        );

        baseContainerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {browseTargetFolderButton, startButton});

        baseContainerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        baseContainerPanelLayout.setVerticalGroup(
            baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sourceUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(folderNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseTargetFolderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(extractionProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseContainerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(baseContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearLogButton)
                    .addComponent(openTargetFolderButton))
                .addContainerGap())
        );

        getContentPane().add(baseContainerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseTargetFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseTargetFolderButtonActionPerformed
        File folder = FileBrowserUtil.openSingleFile(this, null, true,
                (null != selectedFolder ? selectedFolder.getAbsolutePath() : "."));
        if (null != folder) {
            if (!folder.exists()) {
                int option = DisplayUtils.confirmOkCancel(this,
                        "The selected folder does not exist!!!\n"
                        + "Do you want to create it?", DisplayTypeEnum.INFO);
                if (JOptionPane.OK_OPTION == option) {
                    folder.mkdirs();
                } else {
                    return;
                }
            }
            selectedFolder = folder;
            folderNameTextField.setText(folder.getAbsolutePath());
        }
    }//GEN-LAST:event_browseTargetFolderButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (!selectedFolder.exists()) {
            int option = DisplayUtils.confirmOkCancel(this,
                    "The selected folder does not exist!!!\n"
                    + "Do you want to create it?", DisplayTypeEnum.INFO);
            if (JOptionPane.OK_OPTION == option) {
                selectedFolder.mkdirs();
            } else {
                return;
            }
        }
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void openTargetFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTargetFolderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openTargetFolderButtonActionPerformed

    private void clearLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLogButtonActionPerformed
        logTextArea.setText("");
    }//GEN-LAST:event_clearLogButtonActionPerformed

    private void folderNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_folderNameTextFieldFocusLost
        if (null != folderNameTextField.getText()
                && !"".equals(folderNameTextField.getText())) {
            selectedFolder = new File(folderNameTextField.getText());
        }
    }//GEN-LAST:event_folderNameTextFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baseContainerPanel;
    private javax.swing.JButton browseTargetFolderButton;
    private javax.swing.JButton clearLogButton;
    private javax.swing.JProgressBar extractionProgressBar;
    private javax.swing.JTextField folderNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JButton openTargetFolderButton;
    private javax.swing.JTextField sourceUrlTextField;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
