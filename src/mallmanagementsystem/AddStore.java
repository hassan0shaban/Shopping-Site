package mallmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddStore extends javax.swing.JFrame {

    private Connection con = null;

    public AddStore() {
        con = MyConnection.con();
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jArea = new javax.swing.JTextField();
        jAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jcancel = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(249, 202, 36));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Store");

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

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Store Area:");

        jArea.setBackground(new java.awt.Color(108, 122, 137));
        jArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jArea.setForeground(new java.awt.Color(228, 241, 254));
        jArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jAreaKeyTyped(evt);
            }
        });

        jAdd.setBackground(new java.awt.Color(34, 167, 240));
        jAdd.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jAdd.setForeground(new java.awt.Color(255, 255, 255));
        jAdd.setText("Add");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Store Name:");

        jName.setBackground(new java.awt.Color(108, 122, 137));
        jName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jName.setForeground(new java.awt.Color(228, 241, 254));
        jName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNameKeyTyped(evt);
            }
        });

        jcancel.setBackground(new java.awt.Color(242, 38, 19));
        jcancel.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jcancel.setForeground(new java.awt.Color(255, 255, 255));
        jcancel.setText("Back");
        jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jName)
                    .addComponent(jArea, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAdd)
                    .addComponent(jcancel))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        String name = jName.getText();
        String area = jArea.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a store name");
        } else if (area.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a store area");
        } else {
            PreparedStatement ps;
            String query = "insert into shop(sname,sarea) VALUES (?,?);";
            try {
                ps = con.prepareStatement(query);
                ps.setString(1, name);
                ps.setInt(2, Integer.parseInt(area));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "New store was added");
            } catch (SQLException ex) {
                Logger.getLogger(AddStore.class.getName()).log(Level.SEVERE, null, ex);
            }
            new AddStore().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jAddActionPerformed

    private void jcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelActionPerformed
        new AdminStoreList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jcancelActionPerformed

    private void jAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAreaKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jArea.setEditable(true);
        } else {
            jArea.setEditable(false);
        }
    }//GEN-LAST:event_jAreaKeyPressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAreaKeyTyped

        
    }//GEN-LAST:event_jAreaKeyTyped

    private void jNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JTextField jArea;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jcancel;
    // End of variables declaration//GEN-END:variables

    private boolean checkUsername(String uname) {
        PreparedStatement ps;
        String query = "select uname from user where uname=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            if (ps.executeQuery().next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddStore.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
