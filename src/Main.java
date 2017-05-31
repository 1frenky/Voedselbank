
<<<<<<< HEAD
import Database.Database;
import java.awt.Color;
=======
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
    Database database;
    private static Statement statement;
    private static ResultSet rs;

    private String filenaam = null;
    private String filePath = null;
    
    public Main() {
        initComponents();

    }

    String query = "SELECT * from u";

    // function to get the connection
    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/voedselbank", "root", "root");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    // function return an arraylist of users

    public ArrayList<uitgiftepunt> ListUitgifte(String query) {
        uitgiftepunt nieuw;
        ArrayList<uitgiftepunt> usersList = new ArrayList<uitgiftepunt>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                nieuw = new uitgiftepunt(
                        rs.getString("uitgifteNaam"),
                        rs.getString("adres"),
                        rs.getString("plaats"),
                        rs.getInt("aantalMensen"),
                        rs.getInt("maxCapaciteit")
                );
                usersList.add(nieuw);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return usersList;

    }

    public void showUitgifteTable(String orderQuery) {
        ArrayList<uitgiftepunt> uitgiftes = ListUitgifte(orderQuery);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "uitgifteNaam", "adres", "plaats", "aantalMensen", "maxCapaciteit"});
        Object[] row = new Object[5];
        for (int i = 0; i < uitgiftes.size(); i++) {
            row[0] = uitgiftes.get(i).getUitgifteNaam();
            row[1] = uitgiftes.get(i).getAdres();
            row[2] = uitgiftes.get(i).getPlaats();
            row[3] = uitgiftes.get(i).getAantalMensen();
            row[4] = uitgiftes.get(i).getMaxCapaciteit();
            model.addRow(row);
        }

        jTable1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneGeheel = new javax.swing.JTabbedPane();
        jPanelMain = new javax.swing.JPanel();
        MainLabelWelkom = new java.awt.Label();
        btnExitMain = new javax.swing.JButton();
        jPanelIntake = new javax.swing.JPanel();
        btnImportExcel = new javax.swing.JButton();
        btnZoekExcel = new javax.swing.JButton();
        lblPath = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnExitIntake = new javax.swing.JButton();
        jPanelUitgift = new javax.swing.JPanel();
        btnExitUitgitfte = new javax.swing.JButton();
        jPanelClient = new javax.swing.JPanel();
        btnExitClient = new javax.swing.JButton();
        jPanelManage = new javax.swing.JPanel();
<<<<<<< HEAD
        ManageExitKnop = new java.awt.Button();
        jPanelIntake = new javax.swing.JPanel();
        IntakeExitKnop = new java.awt.Button();
        btnImporteerExcel = new javax.swing.JButton();
        btnZoekExcel = new javax.swing.JButton();
        lblPath = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_inVolgorde = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
=======
        btnExitManage = new javax.swing.JButton();
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23

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

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addContainerGap(635, Short.MAX_VALUE)
                        .addComponent(MainExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(MainLabelWelkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
=======
                .addGap(233, 233, 233)
                .addComponent(MainLabelWelkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExitMain)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainLabelWelkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 793, Short.MAX_VALUE)
                .addComponent(MainExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 799, Short.MAX_VALUE)
                .addComponent(btnExitMain)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Main menu", jPanelMain);

<<<<<<< HEAD

        IntakeExitKnop.setLabel("Exit");
        IntakeExitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntakeExitKnopActionPerformed(evt);
            }
        });

=======
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
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

<<<<<<< HEAD
        javax.swing.GroupLayout jPanelProdLayout = new javax.swing.GroupLayout(jPanelProd);
        jPanelProd.setLayout(jPanelProdLayout);
        jPanelProdLayout.setHorizontalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProdLayout.createSequentialGroup()
                .addContainerGap(635, Short.MAX_VALUE)
                .addComponent(ProdExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelProdLayout.setVerticalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProdLayout.createSequentialGroup()
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(ProdExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Productielijst", jPanelProd);

        UitgifteExitKnop.setLabel("Exit");
=======
        btnExitIntake.setText("Exit");
        btnExitIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitIntakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntakeLayout = new javax.swing.GroupLayout(jPanelIntake);
        jPanelIntake.setLayout(jPanelIntakeLayout);
        jPanelIntakeLayout.setHorizontalGroup(
            jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntakeLayout.createSequentialGroup()
                        .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                                .addGap(0, 176, Short.MAX_VALUE)
                                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImportExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZoekExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIntakeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExitIntake)))
                .addContainerGap())
        );
        jPanelIntakeLayout.setVerticalGroup(
            jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZoekExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                .addComponent(btnExitIntake)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Toevoegen Intakelijst", jPanelIntake);

        btnExitUitgitfte.setText("Exit");
        btnExitUitgitfte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitUitgitfteActionPerformed(evt);
            }
        });
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23

        javax.swing.GroupLayout jPanelUitgiftLayout = new javax.swing.GroupLayout(jPanelUitgift);
        jPanelUitgift.setLayout(jPanelUitgiftLayout);
        jPanelUitgiftLayout.setHorizontalGroup(
            jPanelUitgiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUitgiftLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(635, Short.MAX_VALUE)
                .addComponent(UitgifteExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(btnExitUitgitfte)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );
        jPanelUitgiftLayout.setVerticalGroup(
            jPanelUitgiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUitgiftLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(UitgifteExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addContainerGap(829, Short.MAX_VALUE)
                .addComponent(btnExitUitgitfte)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Uitgiftpunten", jPanelUitgift);

        btnExitClient.setText("Exit");
        btnExitClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClientLayout = new javax.swing.GroupLayout(jPanelClient);
        jPanelClient.setLayout(jPanelClientLayout);
        jPanelClientLayout.setHorizontalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(635, Short.MAX_VALUE)
                .addComponent(ClientExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(btnExitClient)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );
        jPanelClientLayout.setVerticalGroup(
            jPanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(ClientExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addContainerGap(829, Short.MAX_VALUE)
                .addComponent(btnExitClient)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Cliënt overzicht", jPanelClient);

        btnExitManage.setText("Exit");
        btnExitManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageLayout = new javax.swing.GroupLayout(jPanelManage);
        jPanelManage.setLayout(jPanelManageLayout);
        jPanelManageLayout.setHorizontalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(635, Short.MAX_VALUE)
                .addComponent(ManageExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(btnExitManage)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );
        jPanelManageLayout.setVerticalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(823, Short.MAX_VALUE)
                .addComponent(ManageExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addContainerGap(829, Short.MAX_VALUE)
                .addComponent(btnExitManage)
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Management informatie", jPanelManage);

        IntakeExitKnop.setLabel("Exit");
        IntakeExitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntakeExitKnopActionPerformed(evt);
            }
        });

        btnImporteerExcel.setText("Importeer Excelsheet");
        btnImporteerExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporteerExcelActionPerformed(evt);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uitgiftenaam", "adres", "plaats", "aantalMensen ", "maxCapaciteit"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_inVolgorde.setText("in volgorde");
        btn_inVolgorde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inVolgordeActionPerformed(evt);
            }
        });

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntakeLayout = new javax.swing.GroupLayout(jPanelIntake);
        jPanelIntake.setLayout(jPanelIntakeLayout);
        jPanelIntakeLayout.setHorizontalGroup(
            jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelIntakeLayout.createSequentialGroup()
                        .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImporteerExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZoekExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelIntakeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(IntakeExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_inVolgorde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelIntakeLayout.setVerticalGroup(
            jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntakeLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZoekExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelIntakeLayout.createSequentialGroup()
                        .addComponent(btnImporteerExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelIntakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_inVolgorde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(IntakeExitKnop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneGeheel.addTab("Toevoegen Intakelijst", jPanelIntake);

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

<<<<<<< HEAD
    private void IntakeExitKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntakeExitKnopActionPerformed
        System.exit(0);
    }//GEN-LAST:event_IntakeExitKnopActionPerformed
    uitgiftepunt nieuw;
    private void btnImporteerExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporteerExcelActionPerformed


    }//GEN-LAST:event_btnImporteerExcelActionPerformed

    private void btn_inVolgordeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inVolgordeActionPerformed
        String query = "SELECT * FROM u ORDER BY uitgifteNaam asc";
        showUitgifteTable(query);
    }//GEN-LAST:event_btn_inVolgordeActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            String query = "DELETE FROM u where uitgifteNaam ='";
        
       
            int SelectedRowItem = jTable1.getSelectedRow();
            model.removeRow(SelectedRowItem);
             showUitgifteTable(query);
        } catch (Exception e) {
            System.out.println("geen data");
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int i = jTable1.getSelectedRow();
         TableModel model = jTable1.getModel();
    }//GEN-LAST:event_jTable1MouseClicked

=======
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
<<<<<<< HEAD
    private java.awt.Button ManageExitKnop;
    private java.awt.Button ProdExitKnop;
    private java.awt.Button UitgifteExitKnop;
    private javax.swing.JButton btnImporteerExcel;
=======
    private javax.swing.JButton btnExitClient;
    private javax.swing.JButton btnExitIntake;
    private javax.swing.JButton btnExitMain;
    private javax.swing.JButton btnExitManage;
    private javax.swing.JButton btnExitUitgitfte;
    private javax.swing.JButton btnImportExcel;
>>>>>>> 0bad043cbdc65a6fd81dcbdccae32ca547444b23
    private javax.swing.JButton btnZoekExcel;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_inVolgorde;
    private javax.swing.JButton btnImportExcel;
    private javax.swing.JPanel jPanelClient;
    private javax.swing.JPanel jPanelIntake;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelManage;
    private javax.swing.JPanel jPanelUitgift;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneGeheel;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPath;
    // End of variables declaration//GEN-END:variables
}
