
import java.io.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justi
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */ 
    
    private String filenaam = null;
    private String filePath = null;
    
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpGeheel = new javax.swing.JTabbedPane();
        jpMain = new javax.swing.JPanel();
        MainLabelWelkom = new java.awt.Label();
        btnExitMain = new javax.swing.JButton();
        jpIntake = new javax.swing.JPanel();
        btnImportExcel = new javax.swing.JButton();
        btnZoekExcel = new javax.swing.JButton();
        lblPath = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnExitIntake = new javax.swing.JButton();
        jpProductie = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jpUitgift = new javax.swing.JPanel();
        btnExitUitgitfte = new javax.swing.JButton();
        jpClient = new javax.swing.JPanel();
        btnExitClient = new javax.swing.JButton();
        jpManage = new javax.swing.JPanel();
        btnExitManage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database app Voedselbank");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);

        MainLabelWelkom.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MainLabelWelkom.setText("Welkom bij de Voedselbank applicatie.");

        btnExitMain.setText("Exit");
        btnExitMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(MainLabelWelkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExitMain)
                .addGap(42, 42, 42))
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainLabelWelkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 602, Short.MAX_VALUE)
                .addComponent(btnExitMain)
                .addContainerGap())
        );

        jtpGeheel.addTab("Main menu", jpMain);

        btnImportExcel.setText("Importeer Excelsheet");
        btnImportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportExcelActionPerformed(evt);
            }
        });

        btnZoekExcel.setText("Zoek Excelsheet");
        btnZoekExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoekExcelActionPerformed(evt);
            }
        });

        lblPath.setText("Kies een nieuw bestand");
        lblPath.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnExitIntake.setText("Exit");
        btnExitIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitIntakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIntakeLayout = new javax.swing.GroupLayout(jpIntake);
        jpIntake.setLayout(jpIntakeLayout);
        jpIntakeLayout.setHorizontalGroup(
            jpIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIntakeLayout.createSequentialGroup()
                .addGroup(jpIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIntakeLayout.createSequentialGroup()
                        .addGroup(jpIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpIntakeLayout.createSequentialGroup()
                                .addGap(0, 148, Short.MAX_VALUE)
                                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImportExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZoekExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIntakeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExitIntake)))
                .addContainerGap())
        );
        jpIntakeLayout.setVerticalGroup(
            jpIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIntakeLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jpIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZoekExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(btnExitIntake)
                .addContainerGap())
        );

        jtpGeheel.addTab("Toevoegen Intakelijst", jpIntake);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpProductieLayout = new javax.swing.GroupLayout(jpProductie);
        jpProductie.setLayout(jpProductieLayout);
        jpProductieLayout.setHorizontalGroup(
            jpProductieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductieLayout.createSequentialGroup()
                .addContainerGap(604, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jpProductieLayout.setVerticalGroup(
            jpProductieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductieLayout.createSequentialGroup()
                .addContainerGap(632, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jtpGeheel.addTab("Productielijst", jpProductie);

        btnExitUitgitfte.setText("Exit");
        btnExitUitgitfte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitUitgitfteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpUitgiftLayout = new javax.swing.GroupLayout(jpUitgift);
        jpUitgift.setLayout(jpUitgiftLayout);
        jpUitgiftLayout.setHorizontalGroup(
            jpUitgiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUitgiftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExitUitgitfte)
                .addContainerGap())
        );
        jpUitgiftLayout.setVerticalGroup(
            jpUitgiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUitgiftLayout.createSequentialGroup()
                .addContainerGap(632, Short.MAX_VALUE)
                .addComponent(btnExitUitgitfte)
                .addContainerGap())
        );

        jtpGeheel.addTab("Uitgiftpunten", jpUitgift);

        btnExitClient.setText("Exit");
        btnExitClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpClientLayout = new javax.swing.GroupLayout(jpClient);
        jpClient.setLayout(jpClientLayout);
        jpClientLayout.setHorizontalGroup(
            jpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpClientLayout.createSequentialGroup()
                .addContainerGap(630, Short.MAX_VALUE)
                .addComponent(btnExitClient)
                .addContainerGap())
        );
        jpClientLayout.setVerticalGroup(
            jpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpClientLayout.createSequentialGroup()
                .addContainerGap(632, Short.MAX_VALUE)
                .addComponent(btnExitClient)
                .addContainerGap())
        );

        jtpGeheel.addTab("Cliënt overzicht", jpClient);

        btnExitManage.setText("Exit");
        btnExitManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpManageLayout = new javax.swing.GroupLayout(jpManage);
        jpManage.setLayout(jpManageLayout);
        jpManageLayout.setHorizontalGroup(
            jpManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpManageLayout.createSequentialGroup()
                .addContainerGap(630, Short.MAX_VALUE)
                .addComponent(btnExitManage)
                .addContainerGap())
        );
        jpManageLayout.setVerticalGroup(
            jpManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpManageLayout.createSequentialGroup()
                .addContainerGap(632, Short.MAX_VALUE)
                .addComponent(btnExitManage)
                .addContainerGap())
        );

        jtpGeheel.addTab("Management informatie", jpManage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpGeheel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpGeheel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZoekExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoekExcelActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filenaam = f.getName();
        String filePath = f.getAbsolutePath();
        this.filenaam = filenaam;
        this.filePath = filePath;
        
        lblPath.setText(filenaam);
    }//GEN-LAST:event_btnZoekExcelActionPerformed

    private void btnImportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportExcelActionPerformed
        ImporteerExcelsheet importExcel = new ImporteerExcelsheet();
        importExcel.importeerExcelsheet(this.filenaam,this.filePath);
        lblMessage.setText("ExcelSheet is geimporteerd.");
    }//GEN-LAST:event_btnImportExcelActionPerformed

    private void btnExitMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitMainActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitMainActionPerformed

    private void btnExitIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitIntakeActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitIntakeActionPerformed

    private void btnExitUitgitfteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitUitgitfteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitUitgitfteActionPerformed

    private void btnExitClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitClientActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitClientActionPerformed

    private void btnExitManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitManageActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitManageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label MainLabelWelkom;
    private javax.swing.JButton btnExitClient;
    private javax.swing.JButton btnExitIntake;
    private javax.swing.JButton btnExitMain;
    private javax.swing.JButton btnExitManage;
    private javax.swing.JButton btnExitUitgitfte;
    private javax.swing.JButton btnImportExcel;
    private javax.swing.JButton btnZoekExcel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jpClient;
    private javax.swing.JPanel jpIntake;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpManage;
    private javax.swing.JPanel jpProductie;
    private javax.swing.JPanel jpUitgift;
    private javax.swing.JTabbedPane jtpGeheel;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPath;
    // End of variables declaration//GEN-END:variables
}
