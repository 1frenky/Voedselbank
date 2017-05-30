
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
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneGeheel = new javax.swing.JTabbedPane();
        jPanelMain = new javax.swing.JPanel();
        MainExitKnop = new java.awt.Button();
        MainLabelWelkom = new java.awt.Label();
        jPanelIntake = new javax.swing.JPanel();
        IntakeExitKnop = new java.awt.Button();
        button1 = new java.awt.Button();
        textFieldIntakeFile = new java.awt.TextField();
        jPanelProd = new javax.swing.JPanel();
        ProdExitKnop = new java.awt.Button();
        jPanelUitgift = new javax.swing.JPanel();
        UitgifteExitKnop = new java.awt.Button();
        jPanelClient = new javax.swing.JPanel();
        ClientExitKnop = new java.awt.Button();
        jPanelManage = new javax.swing.JPanel();
        ManageExitKnop = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database app Voedselbank");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);

        MainExitKnop.setLabel("Exit");
        MainExitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainExitKnopActionPerformed(evt);
            }
        });

        MainLabelWelkom.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MainLabelWelkom.setText("Welkom bij de Voedselbank applicatie.");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addContainerGap(627, Short.MAX_VALUE)
                        .addComponent(MainExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(MainLabelWelkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainLabelWelkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                .addComponent(MainExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Main menu", jPanelMain);

        IntakeExitKnop.setLabel("Exit");
        IntakeExitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntakeExitKnopActionPerformed(evt);
            }
        });

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        textFieldIntakeFile.setText("textField1");

        javax.swing.GroupLayout jPanelIntakeLayout = new javax.swing.GroupLayout(jPanelIntake);
        jPanelIntake.setLayout(jPanelIntakeLayout);
        jPanelIntakeLayout.setHorizontalGroup(
            jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntakeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(IntakeExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntakeLayout.createSequentialGroup()
                        .addComponent(textFieldIntakeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelIntakeLayout.setVerticalGroup(
            jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntakeLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIntakeLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(textFieldIntakeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(IntakeExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Toevoegen Intakelijst", jPanelIntake);

        ProdExitKnop.setLabel("Exit");
        ProdExitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdExitKnopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProdLayout = new javax.swing.GroupLayout(jPanelProd);
        jPanelProd.setLayout(jPanelProdLayout);
        jPanelProdLayout.setHorizontalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProdLayout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addComponent(ProdExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelProdLayout.setVerticalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProdLayout.createSequentialGroup()
                .addContainerGap(625, Short.MAX_VALUE)
                .addComponent(ProdExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Productielijst", jPanelProd);

        UitgifteExitKnop.setLabel("Exit");

        javax.swing.GroupLayout jPanelUitgiftLayout = new javax.swing.GroupLayout(jPanelUitgift);
        jPanelUitgift.setLayout(jPanelUitgiftLayout);
        jPanelUitgiftLayout.setHorizontalGroup(
            jPanelUitgiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUitgiftLayout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addComponent(UitgifteExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelUitgiftLayout.setVerticalGroup(
            jPanelUitgiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUitgiftLayout.createSequentialGroup()
                .addContainerGap(625, Short.MAX_VALUE)
                .addComponent(UitgifteExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Uitgiftpunten", jPanelUitgift);

        ClientExitKnop.setLabel("Exit");
        ClientExitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientExitKnopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClientLayout = new javax.swing.GroupLayout(jPanelClient);
        jPanelClient.setLayout(jPanelClientLayout);
        jPanelClientLayout.setHorizontalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientLayout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addComponent(ClientExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelClientLayout.setVerticalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientLayout.createSequentialGroup()
                .addContainerGap(625, Short.MAX_VALUE)
                .addComponent(ClientExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Cliënt overzicht", jPanelClient);

        ManageExitKnop.setLabel("Exit");
        ManageExitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageExitKnopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageLayout = new javax.swing.GroupLayout(jPanelManage);
        jPanelManage.setLayout(jPanelManageLayout);
        jPanelManageLayout.setHorizontalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageLayout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addComponent(ManageExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelManageLayout.setVerticalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageLayout.createSequentialGroup()
                .addContainerGap(625, Short.MAX_VALUE)
                .addComponent(ManageExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Management informatie", jPanelManage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneGeheel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneGeheel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainExitKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainExitKnopActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MainExitKnopActionPerformed

    private void ProdExitKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdExitKnopActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ProdExitKnopActionPerformed

    private void IntakeExitKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntakeExitKnopActionPerformed
        System.exit(0);
    }//GEN-LAST:event_IntakeExitKnopActionPerformed

    private void ClientExitKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientExitKnopActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ClientExitKnopActionPerformed

    private void ManageExitKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageExitKnopActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ManageExitKnopActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filenaam = f.getAbsolutePath();
        textFieldIntakeFile.setText(filenaam);
    }//GEN-LAST:event_button1ActionPerformed

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
    private java.awt.Button ClientExitKnop;
    private java.awt.Button IntakeExitKnop;
    private java.awt.Button MainExitKnop;
    private java.awt.Label MainLabelWelkom;
    private java.awt.Button ManageExitKnop;
    private java.awt.Button ProdExitKnop;
    private java.awt.Button UitgifteExitKnop;
    private java.awt.Button button1;
    private javax.swing.JPanel jPanelClient;
    private javax.swing.JPanel jPanelIntake;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelManage;
    private javax.swing.JPanel jPanelProd;
    private javax.swing.JPanel jPanelUitgift;
    private javax.swing.JTabbedPane jTabbedPaneGeheel;
    private java.awt.TextField textFieldIntakeFile;
    // End of variables declaration//GEN-END:variables
}