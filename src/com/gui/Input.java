package com.gui;

import com.pdf.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Candy
 */
public class Input extends javax.swing.JFrame {

    String fileName=null;
    String filePath=null;
    String sectionType=null;
    PDF pdf=null;

    public Input(PDF pdf) {
        initComponents();
        this.pdf=pdf;
    }


    @SuppressWarnings("unchecked")
       private void initComponents() {

        from = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectFile = new javax.swing.JButton();
        analyze = new javax.swing.JButton();
        fileDisplay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalRadio = new javax.swing.JRadioButton();
        onlineRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        innovationRadio = new javax.swing.JRadioButton();
        mainRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        from.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });

        to.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("From Page");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("To Page");

        selectFile.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        selectFile.setText("Select File");
        selectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileActionPerformed(evt);
            }
        });

        analyze.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        analyze.setText("Analyze");
        analyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					analyzeActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        fileDisplay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setText("STATS PDF Checker");

        totalRadio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        totalRadio.setText("Total");
        totalRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalRadioActionPerformed(evt);
            }
        });

        onlineRadio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        onlineRadio.setText("Online");
        onlineRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineRadioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Select Section");

        innovationRadio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        innovationRadio.setText("Innovation");
        innovationRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innovationRadioActionPerformed(evt);
            }
        });

        mainRadio.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mainRadio.setText("Main");
        mainRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(selectFile))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(to)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(totalRadio)
                                        .addComponent(onlineRadio))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mainRadio)
                                        .addComponent(innovationRadio))
                                    .addGap(37, 37, 37))
                                .addComponent(fileDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(analyze)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(selectFile)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalRadio)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(onlineRadio)
                            .addComponent(innovationRadio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(mainRadio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fileDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(from, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62)
                .addComponent(analyze)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Pdf file(.pdf)", "pdf");
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION) 
        {
            fileName=chooser.getSelectedFile().getName();
            filePath=chooser.getSelectedFile().getPath();
        }
        
        fileDisplay.setText(" Analyze File: "+fileName);

    }//GEN-LAST:event_selectFileActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toActionPerformed

    private void analyzeActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ParseException {
    	
    	int fromPage=Integer.valueOf(from.getText());
    	int toPage=Integer.valueOf(to.getText());
    	
    	HashMap< String, Integer> sectionTotals=pdf.scanPDF(sectionType, filePath, fromPage, toPage);
    	super.dispose();
    	Output output=new Output(sectionTotals,pdf);
    	output.setVisible(true);
    	
    }//GEN-LAST:event_analyzeActionPerformed

    private void totalRadioActionPerformed(java.awt.event.ActionEvent evt) {
	    	if(totalRadio.isSelected())
	    	{
	    		sectionType="total";
	    		onlineRadio.setEnabled(false);
	    		mainRadio.setEnabled(false);
	    		innovationRadio.setEnabled(false);
	    	}
	    	else if(!totalRadio.isSelected())
	    	{
	    		onlineRadio.setEnabled(true);
	    		mainRadio.setEnabled(true);
	    		innovationRadio.setEnabled(true);
	    	}
    	
    }//GEN-LAST:event_totalRadioActionPerformed

    private void onlineRadioActionPerformed(java.awt.event.ActionEvent evt) {
     	if(onlineRadio.isSelected())
	    	{
     		sectionType="online";
	    		totalRadio.setEnabled(false);
	    		mainRadio.setEnabled(false);
	    		innovationRadio.setEnabled(false);
	    	}
     	else if(!onlineRadio.isSelected())
	    	{
	    		totalRadio.setEnabled(true);
	    		mainRadio.setEnabled(true);
	    		innovationRadio.setEnabled(true);
	    	}
     	
    }//GEN-LAST:event_onlineRadioActionPerformed

    private void mainRadioActionPerformed(java.awt.event.ActionEvent evt) {
	    	if(mainRadio.isSelected())
	    	{
	    		sectionType="main";
	    		totalRadio.setEnabled(false);
	    		onlineRadio.setEnabled(false);
	    		innovationRadio.setEnabled(false);
	    	}
	    	else if(!mainRadio.isSelected())
	    	{
	    		totalRadio.setEnabled(true);
	    		onlineRadio.setEnabled(true);
	    		innovationRadio.setEnabled(true);
	    	}
	   
    	
    }//GEN-LAST:event_mainRadioActionPerformed

    private void innovationRadioActionPerformed(java.awt.event.ActionEvent evt) {
    	
	    	if(innovationRadio.isSelected())
	    	{
	    		sectionType="innovation";
	    		totalRadio.setEnabled(false);
	    		mainRadio.setEnabled(false);
	    		onlineRadio.setEnabled(false);
	    	}
	    	else if(!innovationRadio.isSelected())
	    	{
	    		totalRadio.setEnabled(true);
	    		mainRadio.setEnabled(true);
	    		onlineRadio.setEnabled(true);
	    	}
    }

   
    private javax.swing.JButton analyze;
    private javax.swing.JLabel fileDisplay;
    private javax.swing.JTextField from;
    private javax.swing.JRadioButton innovationRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton mainRadio;
    private javax.swing.JRadioButton onlineRadio;
    private javax.swing.JButton selectFile;
    private javax.swing.JTextField to;
    private javax.swing.JRadioButton totalRadio;
    // End of variables declaration//GEN-END:variables
}
