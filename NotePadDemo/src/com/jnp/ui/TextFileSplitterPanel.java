/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TextFileSplitterPanel.java
 *
 * Created on Jun 18, 2009, 2:31:08 PM
 */

package com.jnp.ui;

import com.jnp.JnpConstants;
import com.jnp.core.TextSplitterProperties;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author Green Moon
 */
public class TextFileSplitterPanel extends javax.swing.JPanel {
    

    private Long lineStartFrom = 0L;
    private Long lineEndTo = 0L;
    private JTextArea textArea;
    private Long totalCount = 0L;
    private File selectedFile;
    private File selectedOutputDir;

    private double fileSizeInBytes;


    /** Creates new form TextFileSplitterPanel */
    public TextFileSplitterPanel() {
        initComponents();
        loadFileProgressBar.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        inputFileTextField = new javax.swing.JTextField();
        inputFileButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fileSizeTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        opLabel = new javax.swing.JLabel();
        outputDirTextField = new javax.swing.JTextField();
        browseOPDirButton = new javax.swing.JButton();
        fileSizeLabel = new javax.swing.JLabel();
        noOfPartsRadioButton = new javax.swing.JRadioButton();
        maxSizePartRadioButton = new javax.swing.JRadioButton();
        noOfLinesRadioButton = new javax.swing.JRadioButton();
        noOfPartsTextField = new javax.swing.JTextField();
        maxSizePartTextField = new javax.swing.JTextField();
        noOfLinesTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalLinesTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        opSizeComboBox = new javax.swing.JComboBox();
        loadFileProgressBar = new javax.swing.JProgressBar();

        jLabel1.setText("Input File");

        inputFileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFileTextFieldActionPerformed(evt);
            }
        });
        inputFileTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputFileTextFieldPropertyChange(evt);
            }
        });
        inputFileTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputFileTextFieldKeyTyped(evt);
            }
        });

        inputFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder_open_file.png"))); // NOI18N
        inputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFileButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Size");

        fileSizeTextField.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fileSizeTextField.setForeground(new java.awt.Color(0, 0, 204));
        fileSizeTextField.setAutoscrolls(false);
        fileSizeTextField.setEnabled(false);

        opLabel.setText("Output Directory");
        opLabel.setEnabled(false);

        outputDirTextField.setAutoscrolls(false);
        outputDirTextField.setEnabled(false);

        browseOPDirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder_open_file.png"))); // NOI18N
        browseOPDirButton.setEnabled(false);
        browseOPDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseOPDirButtonActionPerformed(evt);
            }
        });

        fileSizeLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fileSizeLabel.setForeground(new java.awt.Color(0, 0, 204));

        buttonGroup1.add(noOfPartsRadioButton);
        noOfPartsRadioButton.setText("No. of Parts");
        noOfPartsRadioButton.setEnabled(false);
        noOfPartsRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                noOfPartsRadioButtonStateChanged(evt);
            }
        });
        noOfPartsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfPartsRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(maxSizePartRadioButton);
        maxSizePartRadioButton.setText("Maximum Size per Part");
        maxSizePartRadioButton.setEnabled(false);
        maxSizePartRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maxSizePartRadioButtonStateChanged(evt);
            }
        });
        maxSizePartRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSizePartRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(noOfLinesRadioButton);
        noOfLinesRadioButton.setText("No. of Lines per Part");
        noOfLinesRadioButton.setEnabled(false);
        noOfLinesRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                noOfLinesRadioButtonStateChanged(evt);
            }
        });
        noOfLinesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfLinesRadioButtonActionPerformed(evt);
            }
        });

        noOfPartsTextField.setAutoscrolls(false);
        noOfPartsTextField.setEnabled(false);

        maxSizePartTextField.setAutoscrolls(false);
        maxSizePartTextField.setEnabled(false);

        noOfLinesTextField.setAutoscrolls(false);
        noOfLinesTextField.setEnabled(false);

        jLabel5.setText("Total Lines");

        totalLinesTextField.setFont(new java.awt.Font("Verdana", 1, 12));
        totalLinesTextField.setForeground(new java.awt.Color(0, 0, 204));
        totalLinesTextField.setAutoscrolls(false);
        totalLinesTextField.setEnabled(false);

        jLabel3.setText("<=");

        jLabel4.setText("<=");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, fileSizeTextField, org.jdesktop.beansbinding.ELProperty.create("${text}"), jLabel6, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel7.setToolTipText(jLabel7.getText());

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, totalLinesTextField, org.jdesktop.beansbinding.ELProperty.create("${text}"), jLabel7, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, fileSizeLabel, org.jdesktop.beansbinding.ELProperty.create("${text}"), jLabel8, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        opSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Byte", "KB", "MB", "GB" }));
        opSizeComboBox.setEnabled(false);

        loadFileProgressBar.setIndeterminate(true);
        loadFileProgressBar.setString("Loading File");
        loadFileProgressBar.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(inputFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputFileButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalLinesTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(fileSizeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fileSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(loadFileProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputDirTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(noOfLinesRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(noOfLinesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(maxSizePartRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maxSizePartTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(noOfPartsRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(noOfPartsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(browseOPDirButton))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(454, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, opLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {maxSizePartRadioButton, noOfLinesRadioButton, noOfPartsRadioButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(inputFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(fileSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fileSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(totalLinesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loadFileProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opLabel)
                            .addComponent(outputDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(noOfPartsRadioButton)
                            .addComponent(noOfPartsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxSizePartRadioButton)
                            .addComponent(maxSizePartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noOfLinesRadioButton)
                            .addComponent(noOfLinesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(browseOPDirButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel6, jLabel8});

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFileTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_inputFileTextFieldActionPerformed

    private void inputFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFileButtonActionPerformed
        JFileChooser chooser = new JFileChooser(".");
        chooser.setMultiSelectionEnabled(false);

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opt = chooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            final File f = chooser.getSelectedFile();
            selectedFile = f;
            inputFileTextField.setText(f.getAbsolutePath());
            Runnable tr = new Runnable(){
                public void run() {
                    loadFileProgressBar.setVisible(true);
                    loadValuesFromFile(f);
                    loadFileProgressBar.setVisible(false);
                    opLabel.setEnabled(true);
                    outputDirTextField.setEnabled(true);
                    browseOPDirButton.setEnabled(true);
                }
            };
            new Thread(tr).start();
        }
    }//GEN-LAST:event_inputFileButtonActionPerformed

    private void inputFileTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFileTextFieldKeyTyped

    }//GEN-LAST:event_inputFileTextFieldKeyTyped

    private void inputFileTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputFileTextFieldPropertyChange
        
    }//GEN-LAST:event_inputFileTextFieldPropertyChange

    private void browseOPDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOPDirButtonActionPerformed
        JFileChooser chooser = new JFileChooser(".");
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opt = chooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            selectedOutputDir = f;
            outputDirTextField.setText(f.getAbsolutePath());
            noOfPartsRadioButton.setEnabled(true);
            noOfLinesRadioButton.setEnabled(true);
            maxSizePartRadioButton.setEnabled(true);
        }
    }//GEN-LAST:event_browseOPDirButtonActionPerformed

    private void noOfPartsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfPartsRadioButtonActionPerformed
        


    }//GEN-LAST:event_noOfPartsRadioButtonActionPerformed

    private void maxSizePartRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSizePartRadioButtonActionPerformed
        
    }//GEN-LAST:event_maxSizePartRadioButtonActionPerformed

    private void noOfLinesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfLinesRadioButtonActionPerformed
        
    }//GEN-LAST:event_noOfLinesRadioButtonActionPerformed

    private void noOfPartsRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_noOfPartsRadioButtonStateChanged
        noOfPartsTextField.setEnabled(noOfPartsRadioButton.isSelected());
    }//GEN-LAST:event_noOfPartsRadioButtonStateChanged

    private void maxSizePartRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maxSizePartRadioButtonStateChanged
        maxSizePartTextField.setEnabled(maxSizePartRadioButton.isSelected());
        opSizeComboBox.setEnabled(maxSizePartRadioButton.isSelected());
    }//GEN-LAST:event_maxSizePartRadioButtonStateChanged

    private void noOfLinesRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_noOfLinesRadioButtonStateChanged
        noOfLinesTextField.setEnabled(noOfLinesRadioButton.isSelected());
    }//GEN-LAST:event_noOfLinesRadioButtonStateChanged

    private void loadValuesFromFile(File file){
        Long size = file.length();
        fileSizeInBytes = size;
        DecimalFormat format = new DecimalFormat(JnpConstants.DECIMAL_FORMAT_STRING);
        if(size < JnpConstants.KB){
            fileSizeLabel.setText(JnpConstants.BYTE_TEXT);
            fileSizeTextField.setText(size.toString());
        }else if(size >= JnpConstants.KB && size < JnpConstants.MB){
            fileSizeLabel.setText(JnpConstants.KB_TEXT);
            Double d = size.doubleValue() / JnpConstants.KB.doubleValue();
            fileSizeTextField.setText(format.format(d));
        }else if(size >= JnpConstants.MB && size < JnpConstants.GB){
            fileSizeLabel.setText(JnpConstants.MB_TEXT);
            Double d = size.doubleValue() / JnpConstants.MB.doubleValue();
            fileSizeTextField.setText(format.format(d));
        }else{
            fileSizeLabel.setText(JnpConstants.GB_TEXT);
            Double d = size.doubleValue() / JnpConstants.GB.doubleValue();
            fileSizeTextField.setText(format.format(d));
        }
        Long count = countLines(file);
        totalLinesTextField.setText(""+count.toString());
    }

    private Long countLines(File file){
        Long c = 0L;
        BufferedReader br = null;
        try{
            br = new BufferedReader(
                    new FileReader(file));
            while(br.readLine() != null){
                ++c;
            }
            System.gc();
        }catch(Exception e){
            c = 0L;
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(NumberOfLineDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            totalCount = c;
        }
        return c;
    }

    public void readLines(File file, Long start, Long end) throws FileNotFoundException{
        Long c = 1L;
        BufferedReader br = null;
        try{
            br = new BufferedReader(
                    new FileReader(file));
            while(c < start){
                br.readLine();
                ++c;
                System.gc();
            }
            textArea.append("Staring Line Number :\t"+ start.toString() +"\n");
            while(c <= end){
                textArea.append(br.readLine()+"\n");
                ++c;
            }
            textArea.append("\nEnding Line Number :\t"+ end.toString() +"\n");
        }catch(Exception e){
            textArea.setText(e.getMessage());

        }finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(NumberOfLineDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //System.out.println(textArea.getText());
        }
    }

    public TextSplitterProperties getTextSplitterProperties(){
        TextSplitterProperties properties = new TextSplitterProperties();
        String input = inputFileTextField.getText();
        if(input != null){
            String ps = System.getProperty("file.separator");
            properties.setInputFileName(input.substring(
                    input.lastIndexOf(ps)+1));
            properties.setInputFilePath(input.substring(
                    0, input.lastIndexOf(ps)));
        }
        //TODO: need to take care of exceptions
        properties.setFileSizeInBytes(fileSizeInBytes);
        properties.setFileSize(Double.parseDouble(fileSizeTextField.getText()));
        properties.setTotoalLines(Long.parseLong(totalLinesTextField.getText()));

        if(outputDirTextField.getText() != null){
            properties.setOutputDirName(outputDirTextField.getText());
        }
        if(noOfPartsRadioButton.isSelected()){
            properties.setTotalNumberOfParts(Integer.parseInt(noOfPartsTextField.getText()));
        }
        else if(noOfLinesRadioButton.isSelected()){
            properties.setMaximumLinesPerPart(Integer.parseInt(noOfLinesTextField.getText()));
        }
        else if(maxSizePartRadioButton.isSelected()){
            properties.setMaximumSizePerPart(Integer.parseInt(maxSizePartTextField.getText()));
            properties.setMaximumSizeUnit(opSizeComboBox.getSelectedItem().toString());
        }
        return properties;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseOPDirButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fileSizeLabel;
    private javax.swing.JTextField fileSizeTextField;
    private javax.swing.JButton inputFileButton;
    private javax.swing.JTextField inputFileTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JProgressBar loadFileProgressBar;
    private javax.swing.JRadioButton maxSizePartRadioButton;
    private javax.swing.JTextField maxSizePartTextField;
    private javax.swing.JRadioButton noOfLinesRadioButton;
    private javax.swing.JTextField noOfLinesTextField;
    private javax.swing.JRadioButton noOfPartsRadioButton;
    private javax.swing.JTextField noOfPartsTextField;
    private javax.swing.JLabel opLabel;
    private javax.swing.JComboBox opSizeComboBox;
    private javax.swing.JTextField outputDirTextField;
    private javax.swing.JTextField totalLinesTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}