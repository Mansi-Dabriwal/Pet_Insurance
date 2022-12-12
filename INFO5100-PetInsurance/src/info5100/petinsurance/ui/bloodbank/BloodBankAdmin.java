/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package info5100.petinsurance.ui.bloodbank;

import info5100.petinsurance.model.hospital.bloodbank.Bloodbank;
import info5100.petinsurance.model.support.BloodCollectionRequestModel;
import info5100.petinsurance.ui.SignUp;
import info5100.petinsurance.ui.WelcomeFrame;
import info5100.petinsurance.utilities.Constants;
import info5100.petinsurance.utilities.DatabaseConnection;
import info5100.petinsurance.utilities.WorkFlowStatus;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashit
 */
public class BloodBankAdmin extends javax.swing.JFrame {

    /**
     * Creates new form BloodBankAdmin
     */
    public BloodBankAdmin() {
        initComponents();

        populatePendingRequestsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        viewRequestButton = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        availabilityTextField = new javax.swing.JTextField();
        setButton = new javax.swing.JButton();
        viewPendingRequestPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingRequestsTable = new javax.swing.JTable();
        approveButton = new javax.swing.JButton();
        rejectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Blood Bank Admin");

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Update Blood Availabilty");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewRequestButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewRequestButton.setText("View Pending Request");
        viewRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewRequestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(viewRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parentPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info5100/petinsurance/ui/bloodbank/Blood_bank.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        parentPanel.add(homePanel, "card4");

        updatePanel.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Blood Type");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Set Availability (Units)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "O Positive", "O Negative", "A Positive", "A Negative", "B Positive", "B Negative", "AB Positive", "AB Negative" }));

        availabilityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                availabilityTextFieldKeyTyped(evt);
            }
        });

        setButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        setButton.setText("Update Availability");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(availabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(setButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(setButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        parentPanel.add(updatePanel, "card3");

        viewPendingRequestPanel.setBackground(new java.awt.Color(153, 204, 255));

        pendingRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Animal Id", "Animal Type", "Blood Type", "Units Required"
            }
        ));
        jScrollPane1.setViewportView(pendingRequestsTable);

        approveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        rejectButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewPendingRequestPanelLayout = new javax.swing.GroupLayout(viewPendingRequestPanel);
        viewPendingRequestPanel.setLayout(viewPendingRequestPanelLayout);
        viewPendingRequestPanelLayout.setHorizontalGroup(
            viewPendingRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPendingRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(viewPendingRequestPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(approveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewPendingRequestPanelLayout.setVerticalGroup(
            viewPendingRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPendingRequestPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(viewPendingRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(approveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(rejectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 127, Short.MAX_VALUE))
        );

        parentPanel.add(viewPendingRequestPanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(updatePanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestButtonActionPerformed
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(viewPendingRequestPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        populatePendingRequestsTable();
    }//GEN-LAST:event_viewRequestButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new WelcomeFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = pendingRequestsTable.getSelectedRow();
        String select = Constants.GETBLOODCOLLECTIONREQUESTSID + pendingRequestsTable.getValueAt(selectedRow, 0);
        try {

            ResultSet rs = DatabaseConnection.getData(select, false);
            while (rs.next()) {
                BloodCollectionRequestModel bcr = new BloodCollectionRequestModel(
                rs.getInt("AnimalID"),
                        rs.getString("animalType"),
                        rs.getString("bloodType"),
                        rs.getInt("NumberofUnits"),
                        rs.getDate("RequiredByDate"),
                        rs.getInt("SupportPersonID"),
                        rs.getString("SupportPersonName"),
                        WorkFlowStatus.COMPLETED,
                        rs.getString("OwnerEmail")
                ) ;
                bcr.setId(Integer.valueOf(pendingRequestsTable.getValueAt(selectedRow, 0).toString()));
                DatabaseConnection.updateBloodCollectionRequestStatus(bcr);

            }
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Blood collection request approved");
        } catch (SQLException e) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);

        }
        populatePendingRequestsTable();
    }//GEN-LAST:event_approveButtonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        // TODO add your handling code here:
       int selectedRow = pendingRequestsTable.getSelectedRow();
        String select = Constants.GETBLOODCOLLECTIONREQUESTSID + pendingRequestsTable.getValueAt(selectedRow, 0);

        try {

            ResultSet rs = DatabaseConnection.getData(select, false);
            while (rs.next()) {
                BloodCollectionRequestModel bcr = new BloodCollectionRequestModel(
                rs.getInt("AnimalID"),
                        rs.getString("animalType"),
                        rs.getString("bloodType"),
                        rs.getInt("NumberofUnits"),
                        rs.getDate("RequiredByDate"),
                        rs.getInt("SupportPersonID"),
                        rs.getString("SupportPersonName"),
                        WorkFlowStatus.CANCELLED,
                        rs.getString("OwnerEmail")
                ) ;
                bcr.setId(Integer.valueOf(pendingRequestsTable.getValueAt(selectedRow, 0).toString()));
                DatabaseConnection.updateBloodCollectionRequestStatus(bcr);

            }
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Blood collection request denied");
        } catch (SQLException e) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);

        }
        populatePendingRequestsTable();
    }//GEN-LAST:event_rejectButtonActionPerformed

    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        // TODO add your handling code here:
        ResultSet rs = null;

        boolean existingBloodType = false;
        Bloodbank bb = new Bloodbank(jComboBox1.getSelectedItem().toString(), Integer.valueOf(availabilityTextField.getText()));
        if (jComboBox1.getSelectedItem().equals("")) {
           JFrame jFrame = new JFrame();
           JOptionPane.showMessageDialog(jFrame, "Please select a blood type!");
        } else if(availabilityTextField.getText().trim().isEmpty()){
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Please enter availability!");
        } else{
        try {
            rs = DatabaseConnection.getData(Constants.GETBLOODBANKINFO + jComboBox1.getSelectedItem().toString() + "'", false);
            while (rs.next()) {
                existingBloodType = true;
            }

            if (existingBloodType) {
                DatabaseConnection.updateAvailability(bb);
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Availability Updated!!");
            } else {
                DatabaseConnection.storeBloodAvailability(bb);
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Availability Updated!!");
            }
        } catch (SQLException e) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);

        }

        }
    }//GEN-LAST:event_setButtonActionPerformed

    private void availabilityTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availabilityTextFieldKeyTyped
        // TODO add your handling code here:
        char TestChar = evt.getKeyChar();
        if (!(Character.isDigit(TestChar)))
            evt.consume();
    }//GEN-LAST:event_availabilityTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(BloodBankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BloodBankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BloodBankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BloodBankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BloodBankAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JTextField availabilityTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JTable pendingRequestsTable;
    private javax.swing.JButton rejectButton;
    private javax.swing.JButton setButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JPanel viewPendingRequestPanel;
    private javax.swing.JButton viewRequestButton;
    // End of variables declaration//GEN-END:variables

    private void populatePendingRequestsTable() {
        DefaultTableModel model = (DefaultTableModel) pendingRequestsTable.getModel();
        model.setRowCount(0);

        try {
            ResultSet rs = null;
          
            rs = DatabaseConnection.getData(Constants.GETBLOODCOLLECTIONREQUESTS, false);
            while (rs.next()) {
                Object[] row = {rs.getInt("ID"), rs.getInt("AnimalID"), rs.getString("AnimalType"), rs.getString("BloodType"), rs.getString("NumberofUnits")};
                model.addRow(row);
            }

        } catch (SQLException e) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);

        }
    }
}
