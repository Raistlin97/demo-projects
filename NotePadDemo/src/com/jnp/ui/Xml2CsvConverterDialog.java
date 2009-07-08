/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Xml2CsvConverterDialog.java
 *
 * Created on Jun 22, 2009, 9:46:27 AM
 */

package com.jnp.ui;

import com.conversion.xml.Xml2CsvConverter;
import com.jnp.JnpConstants;
import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

/**
 *
 * @author Green Moon
 */
public class Xml2CsvConverterDialog extends javax.swing.JDialog {

    private String inputXmlFileFullName = "";
    private String inputXslFileFullName = "";
    private String outputCsvFileFullName = "";
    private String defaultCsvFileName;

    /** Creates new form Xml2CsvConverterDialog */
    public Xml2CsvConverterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bringToCenter();
        converterProgressBar.setVisible(false);
        exploreButton.setVisible(false);
        openInNpButton.setVisible(false);
        if(JnpConstants.CURRENT_OS_NAME.toLowerCase().contains(JnpConstants.OS_WINDOWS)){
            exploreButton.setVisible(true);
        }
    }

    private void bringToCenter() {
        Dimension pd = getParent().getSize();
        Dimension sz = this.getSize();
        setLocation(new Point(
                getParent().getLocation().x + (pd.width/2 - sz.width/2),
                getParent().getLocation().y + (pd.height/2 - sz.height/2)
            ));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputXmlFileTextField = new javax.swing.JTextField();
        inputXmlFileButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputXsltFileTextField = new javax.swing.JTextField();
        inputXsltFileButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        storeInSameRadioButton = new javax.swing.JRadioButton();
        storeInRadioButton = new javax.swing.JRadioButton();
        outputDirTextField = new javax.swing.JTextField();
        outputDirButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        keepDefaultNameRadioButton = new javax.swing.JRadioButton();
        renameToRadioButton = new javax.swing.JRadioButton();
        defaultNameLabel = new javax.swing.JLabel();
        newOutFileNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        converterProgressBar = new javax.swing.JProgressBar();
        startButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        openInNpButton = new javax.swing.JButton();
        exploreButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("XML 2 CSV");

        jLabel1.setText("Input XML File");

        inputXmlFileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputXmlFileTextFieldActionPerformed(evt);
            }
        });
        inputXmlFileTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputXmlFileTextFieldPropertyChange(evt);
            }
        });
        inputXmlFileTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputXmlFileTextFieldKeyTyped(evt);
            }
        });

        inputXmlFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder_open_file.png"))); // NOI18N
        inputXmlFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputXmlFileButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Input XSLT File");

        inputXsltFileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputXsltFileTextFieldActionPerformed(evt);
            }
        });
        inputXsltFileTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputXsltFileTextFieldPropertyChange(evt);
            }
        });
        inputXsltFileTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputXsltFileTextFieldKeyTyped(evt);
            }
        });

        inputXsltFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder_open_file.png"))); // NOI18N
        inputXsltFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputXsltFileButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Output Location");

        buttonGroup1.add(storeInSameRadioButton);
        storeInSameRadioButton.setSelected(true);
        storeInSameRadioButton.setText("Store in the same location as the input xml file.");
        storeInSameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeInSameRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(storeInRadioButton);
        storeInRadioButton.setText("Store in");
        storeInRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeInRadioButtonActionPerformed(evt);
            }
        });

        outputDirTextField.setEnabled(false);
        outputDirTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDirTextFieldActionPerformed(evt);
            }
        });
        outputDirTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                outputDirTextFieldPropertyChange(evt);
            }
        });
        outputDirTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outputDirTextFieldKeyTyped(evt);
            }
        });

        outputDirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder_open_file.png"))); // NOI18N
        outputDirButton.setEnabled(false);
        outputDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDirButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Output File Name");

        buttonGroup2.add(keepDefaultNameRadioButton);
        keepDefaultNameRadioButton.setSelected(true);
        keepDefaultNameRadioButton.setText("Keep default Name");
        keepDefaultNameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keepDefaultNameRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(renameToRadioButton);
        renameToRadioButton.setText("Rename to");
        renameToRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameToRadioButtonActionPerformed(evt);
            }
        });

        newOutFileNameTextField.setEnabled(false);

        jLabel6.setText(".csv");

        converterProgressBar.setIndeterminate(true);
        converterProgressBar.setString("Please wait...");
        converterProgressBar.setStringPainted(true);

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");

        openInNpButton.setText("Open in Notepad");

        exploreButton.setText("View In Explorer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputXsltFileTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(inputXmlFileTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputXmlFileButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputXsltFileButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(storeInRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outputDirTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputDirButton))
                    .addComponent(storeInSameRadioButton))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keepDefaultNameRadioButton)
                    .addComponent(renameToRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newOutFileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(defaultNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap(53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(exploreButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openInNpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(converterProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(startButton)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(inputXmlFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputXmlFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(inputXsltFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputXsltFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(storeInSameRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(storeInRadioButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(outputDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(outputDirButton)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(keepDefaultNameRadioButton)
                    .addComponent(defaultNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renameToRadioButton)
                    .addComponent(newOutFileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(converterProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openInNpButton)
                    .addComponent(exploreButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputXmlFileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputXmlFileTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_inputXmlFileTextFieldActionPerformed

    private void inputXmlFileTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputXmlFileTextFieldPropertyChange

}//GEN-LAST:event_inputXmlFileTextFieldPropertyChange

    private void inputXmlFileTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputXmlFileTextFieldKeyTyped

}//GEN-LAST:event_inputXmlFileTextFieldKeyTyped

    private void inputXmlFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputXmlFileButtonActionPerformed
        JFileChooser chooser = new JFileChooser(".");
        chooser.setMultiSelectionEnabled(false);
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                String name = f.getName();
                if(name.toLowerCase().endsWith(".xml")){
                    return true;
                }
                return false;
            }
            @Override
            public String getDescription() {
                return "XML Files only (*.xml)";
            }
        };
        chooser.setFileFilter(filter);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opt = chooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            final File f = chooser.getSelectedFile();
            //selectedFile = f;
            inputXmlFileTextField.setText(f.getAbsolutePath());
            inputXmlFileFullName = f.getAbsolutePath();
            defaultNameLabel.setText(f.getName() + ".csv");
            defaultCsvFileName = f.getName() + ".csv";
        }
}//GEN-LAST:event_inputXmlFileButtonActionPerformed

    private void inputXsltFileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputXsltFileTextFieldActionPerformed
        
}//GEN-LAST:event_inputXsltFileTextFieldActionPerformed

    private void inputXsltFileTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputXsltFileTextFieldPropertyChange
        // TODO add your handling code here:
}//GEN-LAST:event_inputXsltFileTextFieldPropertyChange

    private void inputXsltFileTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputXsltFileTextFieldKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_inputXsltFileTextFieldKeyTyped

    private void inputXsltFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputXsltFileButtonActionPerformed
        JFileChooser chooser = new JFileChooser(".");
        chooser.setMultiSelectionEnabled(false);
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                String name = f.getName();
                if(name.toLowerCase().endsWith(".xsl")){
                    return true;
                }
                return false;
            }
            @Override
            public String getDescription() {
                return "XML Stylesheets only (*.xsl)";
            }
        };
        chooser.setFileFilter(filter);
        //chooser.setFileView(new JnpFileView());
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opt = chooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            final File f = chooser.getSelectedFile();
            //selectedFile = f;
            inputXsltFileTextField.setText(f.getAbsolutePath());
            inputXslFileFullName = f.getAbsolutePath();
        }
}//GEN-LAST:event_inputXsltFileButtonActionPerformed

    private void outputDirTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDirTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_outputDirTextFieldActionPerformed

    private void outputDirTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_outputDirTextFieldPropertyChange
        // TODO add your handling code here:
}//GEN-LAST:event_outputDirTextFieldPropertyChange

    private void outputDirTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outputDirTextFieldKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_outputDirTextFieldKeyTyped

    private void outputDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDirButtonActionPerformed
        JFileChooser chooser = new JFileChooser(".");
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opt = chooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            final File f = chooser.getSelectedFile();
            //selectedFile = f;
            outputDirTextField.setText(f.getAbsolutePath());
            outputCsvFileFullName = f.getAbsolutePath();
            if(keepDefaultNameRadioButton.isSelected()){
                outputCsvFileFullName += f.separator + defaultCsvFileName;
            }else{
                outputCsvFileFullName += f.separator + newOutFileNameTextField.getText();
            }
        }
}//GEN-LAST:event_outputDirButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        openInNpButton.setVisible(true);
        Runnable r = new Runnable(){
            public void run() {
                converterProgressBar.setVisible(true);
                inputXmlFileFullName = inputXmlFileTextField.getText();
                inputXslFileFullName = inputXsltFileTextField.getText();
                String outputDir = "";
                if(storeInSameRadioButton.isSelected()){
                    outputCsvFileFullName = inputXmlFileFullName.substring(
                            inputXmlFileFullName.lastIndexOf(
                            System.getProperty("file.separator")));

                }else{
                    outputDir = outputDirTextField.getText();
                }

                if(keepDefaultNameRadioButton.isSelected()){
                    outputDir += System.getProperty("file.separator") + defaultCsvFileName;
                }else{
                    outputDir += System.getProperty("file.separator") + newOutFileNameTextField.getText();
                }
                Xml2CsvConverter.convertXml2Csv(inputXmlFileFullName, inputXslFileFullName, outputDir);
                converterProgressBar.setVisible(false);
            }
        };
        new Thread(r).start();
    }//GEN-LAST:event_startButtonActionPerformed

    private void storeInSameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeInSameRadioButtonActionPerformed
        if(!storeInSameRadioButton.isSelected()){
            outputDirTextField.setEnabled(true);
            outputDirButton.setEnabled(true);
        }else{
            outputDirTextField.setEnabled(false);
            outputDirButton.setEnabled(false);
        }
    }//GEN-LAST:event_storeInSameRadioButtonActionPerformed

    private void storeInRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeInRadioButtonActionPerformed
        if(storeInRadioButton.isSelected()){
            outputDirTextField.setEnabled(true);
            outputDirButton.setEnabled(true);
        }else{
            outputDirTextField.setEnabled(false);
            outputDirButton.setEnabled(false);
        }
    }//GEN-LAST:event_storeInRadioButtonActionPerformed

    private void keepDefaultNameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keepDefaultNameRadioButtonActionPerformed
        if(keepDefaultNameRadioButton.isSelected()){
            defaultNameLabel.setText(defaultCsvFileName);
            newOutFileNameTextField.setEnabled(false);
        }else{
            defaultNameLabel.setText("");
            newOutFileNameTextField.setEnabled(true);
        }
    }//GEN-LAST:event_keepDefaultNameRadioButtonActionPerformed

    private void renameToRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameToRadioButtonActionPerformed
        if(!renameToRadioButton.isSelected()){
            defaultNameLabel.setText(defaultCsvFileName);
            newOutFileNameTextField.setEnabled(false);
        }else{
            defaultNameLabel.setText("");
            newOutFileNameTextField.setEnabled(true);
        }
    }//GEN-LAST:event_renameToRadioButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Xml2CsvConverterDialog dialog = new Xml2CsvConverterDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JProgressBar converterProgressBar;
    private javax.swing.JLabel defaultNameLabel;
    private javax.swing.JButton exploreButton;
    private javax.swing.JButton inputXmlFileButton;
    private javax.swing.JTextField inputXmlFileTextField;
    private javax.swing.JButton inputXsltFileButton;
    private javax.swing.JTextField inputXsltFileTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton keepDefaultNameRadioButton;
    private javax.swing.JTextField newOutFileNameTextField;
    private javax.swing.JButton openInNpButton;
    private javax.swing.JButton outputDirButton;
    private javax.swing.JTextField outputDirTextField;
    private javax.swing.JRadioButton renameToRadioButton;
    private javax.swing.JButton startButton;
    private javax.swing.JRadioButton storeInRadioButton;
    private javax.swing.JRadioButton storeInSameRadioButton;
    // End of variables declaration//GEN-END:variables

}
