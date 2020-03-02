package mallmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class RentRequestsForm extends javax.swing.JFrame {

    private Connection con;
    private ResultSet res;

    public RentRequestsForm() {
        con = MyConnection.con();
        initComponents();
        getAllRequests();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        requestId = new javax.swing.JTextField();
        jAcceot = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jRefuse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(249, 202, 36));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rent Requests");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(19, 15, 64));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Request ID:");

        requestId.setBackground(new java.awt.Color(108, 122, 137));
        requestId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestId.setForeground(new java.awt.Color(228, 241, 254));
        requestId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestIdActionPerformed(evt);
            }
        });
        requestId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                requestIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                requestIdKeyReleased(evt);
            }
        });

        jAcceot.setBackground(new java.awt.Color(34, 167, 240));
        jAcceot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAcceot.setForeground(new java.awt.Color(255, 255, 255));
        jAcceot.setText("Accept Request");
        jAcceot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcceotActionPerformed(evt);
            }
        });

        jBack.setBackground(new java.awt.Color(242, 38, 19));
        jBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jRefuse.setBackground(new java.awt.Color(34, 167, 240));
        jRefuse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRefuse.setForeground(new java.awt.Color(255, 255, 255));
        jRefuse.setText("Refuse Request");
        jRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefuseActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(requestId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRefuse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAcceot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(requestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jAcceot)
                .addGap(18, 18, 18)
                .addComponent(jRefuse)
                .addGap(18, 18, 18)
                .addComponent(jBack)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefuseActionPerformed

        PreparedStatement ps;
        String rid = requestId.getText();

        if (rid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Request ID");
        } else if (checkRequestID(rid) == false) {
            JOptionPane.showMessageDialog(null, "this Request is not Found");
        } else {
            try {
                String query = "delete from shoprequest where rid = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(rid));
                ps.executeUpdate();
            } catch (SQLException | NumberFormatException ex) {
                Logger.getLogger(RentRequestsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jRefuseActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed

        this.dispose();
        new AdminProfileForm().setVisible(true);
    }//GEN-LAST:event_jBackActionPerformed

    private void jAcceotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcceotActionPerformed

        PreparedStatement ps;
        String rid = requestId.getText();

        if (rid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Request ID");
        } else if (checkRequestID(rid) == false) {
            JOptionPane.showMessageDialog(null, "this Request is not Found");
        } else {
            double budget = 0;
            try {
                String query = "select offerbudget from shoprequest where rid = " + rid;
                ps = con.prepareStatement(query);
                if (ps.executeQuery().next()) {
                    budget = ps.getResultSet().getDouble("budget");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RentRequestsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            //removeRequest(rid);
            try {
                String query = "delete from shoprequest where rid = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(rid));
                ps.executeUpdate();
            } catch (SQLException | NumberFormatException ex) {
                Logger.getLogger(RentRequestsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            //updateShop(rid);
            try {
                int sid = 0, oid = 0;
                try {
                    String query = "select sid from shoprequest where rid = " + rid;
                    ps = con.prepareStatement(query);
                    if (ps.executeQuery().next()) {
                        sid = ps.getResultSet().getInt("sid");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RentRequestsForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    String query = "select oid from shoprequest where rid = " + rid;
                    ps = con.prepareStatement(query);
                    if (ps.executeQuery().next()) {
                        oid = ps.getResultSet().getInt("sid");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RentRequestsForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                String query = "update shop set oid = ? , budget = ? where sid = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, oid);
                ps.setDouble(2, budget);
                ps.setInt(3, (sid));
                if (ps.executeQuery().next()) {
                    if (ps.getResultSet().getBoolean("isowner")) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(RentRequestsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jAcceotActionPerformed

    private void requestIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestIdActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void requestIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_requestIdKeyPressed

        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            requestId.setEditable(true);
        } else {
            requestId.setEditable(false);
        }
    }//GEN-LAST:event_requestIdKeyPressed

    private void requestIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_requestIdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_requestIdKeyReleased
    private boolean checkRequestID(String rid) {

        PreparedStatement ps;
        String query = "select rid from shoprequest where rid=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(rid));
            if (ps.executeQuery().next()) {
                return true;
            }
            return false;
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(RentRequestsForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAcceot;
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRefuse;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField requestId;
    // End of variables declaration//GEN-END:variables

    private void getAllRequests() {

        PreparedStatement ps;
        String query = "SELECT O.rid, O.sid , O.date , I.sarea , P.uname , P.oname , O.offerbudget FROM shoprequest O JOIN shop I ON O.sid = I.sid JOIN owner P ON P.oid = O.oid order by O.date;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Request ID", "Shop ID", "Request Date", "Shop Area", "Company Username", "Company Name", "Offer Budget"};
            jTable1.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));

        } catch (SQLException ex) {
            Logger.getLogger(RentRequestsForm.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable1);

    }

}