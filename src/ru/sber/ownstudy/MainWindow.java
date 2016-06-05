/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.sber.ownstudy;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {    
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGetFile = new javax.swing.JButton();
        btnGetImage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        choice1 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WebPics");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(740, 580));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Enter URL here...");
        jTextArea1.setToolTipText("Enter URL here...");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 490, 210));

        btnGetFile.setText("Get file");
        btnGetFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetFileActionPerformed(evt);
            }
        });
        jPanel1.add(btnGetFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 30, 80, -1));

        btnGetImage.setText("Get image");
        btnGetImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetImageActionPerformed(evt);
            }
        });
        btnGetImage.addActionListener(e -> System.out.println(1));
        jPanel1.add(btnGetImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTabbedPane2.addTab("Вкладка 1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 50, 50));
        choice1.add("png");
        choice1.add("jpg");

        jLabel1.setText("Формат:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 50, 20));

        jButton3.setText("View");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTabbedPane2.addTab("Вкладка 2", jPanel2);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 350));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Get File
    private void btnGetFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetFileActionPerformed
                
    }//GEN-LAST:event_btnGetFileActionPerformed

    
    // Get image
    private void btnGetImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetImageActionPerformed
        System.out.println("2");
    }//GEN-LAST:event_btnGetImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetFile;
    private javax.swing.JButton btnGetImage;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
