/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.mart;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Obaid
 */
public class frmdashboard extends javax.swing.JFrame {
    /**
     * Creates new form frmdashboard
     */
    public frmdashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.white);
        lbluser.setText(frmLogin.user);
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
        btninventory = new javax.swing.JButton();
        btncompany = new javax.swing.JButton();
        btnexpense = new javax.swing.JButton();
        btnsales = new javax.swing.JButton();
        btnpurchase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POS MART");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 265, 54));

        btninventory.setBackground(new java.awt.Color(54, 33, 89));
        btninventory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btninventory.setForeground(new java.awt.Color(255, 255, 255));
        btninventory.setText("Inventory");
        btninventory.setBorder(null);
        btninventory.setContentAreaFilled(false);
        btninventory.setOpaque(true);
        btninventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btninventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btninventoryMouseExited(evt);
            }
        });
        btninventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninventoryActionPerformed(evt);
            }
        });
        jPanel1.add(btninventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 255, 30));

        btncompany.setBackground(new java.awt.Color(54, 33, 89));
        btncompany.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btncompany.setForeground(new java.awt.Color(255, 255, 255));
        btncompany.setText("Company");
        btncompany.setBorder(null);
        btncompany.setContentAreaFilled(false);
        btncompany.setOpaque(true);
        btncompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncompanyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncompanyMouseExited(evt);
            }
        });
        btncompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompanyActionPerformed(evt);
            }
        });
        jPanel1.add(btncompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 255, 30));

        btnexpense.setBackground(new java.awt.Color(54, 33, 89));
        btnexpense.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnexpense.setForeground(new java.awt.Color(255, 255, 255));
        btnexpense.setText("Expense");
        btnexpense.setBorder(null);
        btnexpense.setContentAreaFilled(false);
        btnexpense.setOpaque(true);
        btnexpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnexpenseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnexpenseMouseExited(evt);
            }
        });
        btnexpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexpenseActionPerformed(evt);
            }
        });
        jPanel1.add(btnexpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 255, 30));

        btnsales.setBackground(new java.awt.Color(54, 33, 89));
        btnsales.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnsales.setForeground(new java.awt.Color(255, 255, 255));
        btnsales.setText("Sales");
        btnsales.setBorder(null);
        btnsales.setContentAreaFilled(false);
        btnsales.setOpaque(true);
        btnsales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalesMouseExited(evt);
            }
        });
        btnsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalesActionPerformed(evt);
            }
        });
        jPanel1.add(btnsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 255, 30));

        btnpurchase.setBackground(new java.awt.Color(54, 33, 89));
        btnpurchase.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnpurchase.setForeground(new java.awt.Color(255, 255, 255));
        btnpurchase.setText("Purchase");
        btnpurchase.setBorder(null);
        btnpurchase.setContentAreaFilled(false);
        btnpurchase.setOpaque(true);
        btnpurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpurchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpurchaseMouseExited(evt);
            }
        });
        btnpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpurchaseActionPerformed(evt);
            }
        });
        jPanel1.add(btnpurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 255, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Logged in:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbluser.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
       
    
    private void btninventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninventoryMouseEntered
        btninventory.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_btninventoryMouseEntered

    private void btninventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninventoryMouseExited
        btninventory.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btninventoryMouseExited

    private void btncompanyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncompanyMouseEntered
        btncompany.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_btncompanyMouseEntered

    private void btncompanyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncompanyMouseExited
        btncompany.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btncompanyMouseExited

    private void btncompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompanyActionPerformed
        try {
            frmcompany company=new frmcompany();
            company.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(frmdashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncompanyActionPerformed

    private void btninventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninventoryActionPerformed
        try {
            frminventory inventory=new frminventory();
            inventory.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(frmdashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btninventoryActionPerformed

    private void btnexpenseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexpenseMouseEntered
        btnexpense.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_btnexpenseMouseEntered

    private void btnexpenseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexpenseMouseExited
        btnexpense.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btnexpenseMouseExited

    private void btnexpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexpenseActionPerformed
       try {
            frmexpense inventory=new frmexpense();
            inventory.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(frmdashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnexpenseActionPerformed

    private void btnsalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalesMouseEntered
        btnsales.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_btnsalesMouseEntered

    private void btnsalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalesMouseExited
        btnsales.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btnsalesMouseExited

    private void btnsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalesActionPerformed
        try {
            frmsales inventory=new frmsales();
            inventory.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(frmdashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsalesActionPerformed

    private void btnpurchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpurchaseMouseEntered
        btnpurchase.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_btnpurchaseMouseEntered

    private void btnpurchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpurchaseMouseExited
        btnpurchase.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_btnpurchaseMouseExited

    private void btnpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpurchaseActionPerformed
        try {
            frmpurchase inventory=new frmpurchase();
            inventory.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(frmdashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpurchaseActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmdashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncompany;
    private javax.swing.JButton btnexpense;
    private javax.swing.JButton btninventory;
    private javax.swing.JButton btnpurchase;
    private javax.swing.JButton btnsales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbluser;
    // End of variables declaration//GEN-END:variables
}
