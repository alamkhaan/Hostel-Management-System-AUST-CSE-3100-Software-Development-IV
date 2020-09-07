/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

import java.awt.event.KeyEvent;
import javafx.util.Pair;
import javax.swing.JOptionPane;


public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    String AdminId;
    public Settings() {
        initComponents();
    }
    
    public Settings(String AdminId) {
        this.AdminId = AdminId;
        initComponents();
        
        Pair<String,String> pair = new ConnectMSSQL().getAdminInfo(AdminId);
        userName.setText(pair.getKey());
        password.setText(pair.getValue());
        confirmPassword.setText(pair.getValue());
        
        
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
        jLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        confirmPassword = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Settings");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backButton)
                .addGap(360, 360, 360)
                .addComponent(jLabel4)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(backButton))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Confirm Password:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Update Info");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 180, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Password:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 140, 30));

        userName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        userName.setPreferredSize(new java.awt.Dimension(59, 27));
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameKeyTyped(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 190, 30));

        password.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        password.setPreferredSize(new java.awt.Dimension(59, 27));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 190, 30));

        confirmPassword.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        confirmPassword.setPreferredSize(new java.awt.Dimension(59, 27));
        confirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 190, 30));

        logoutButton.setBackground(new java.awt.Color(255, 0, 0));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 80, 30));

        submitButton.setBackground(new java.awt.Color(15, 19, 52));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 80, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("User Name:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 140, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new HomePage(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(userName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "UserName is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(password.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Password is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(confirmPassword.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Confirm Password is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(userName.getText().length()<6)
        {
            JOptionPane.showMessageDialog(this, "UserName should be at least 6 characters long","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(password.getText().length()<6)
        {
            JOptionPane.showMessageDialog(this, "Password should be at least 6 characters long","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(password.getText().equals(confirmPassword.getText())==false)
        {
            JOptionPane.showMessageDialog(this, "Password and Confirm Password Does not match","Error",JOptionPane.ERROR_MESSAGE);
        
        }
        else
        {
            new ConnectMSSQL().update("Admin","username = '"+userName.getText()+"', password = '"+password.getText()+"' where EmployeeID='"+this.AdminId+"'");
            JOptionPane.showMessageDialog(this, "Updated Successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        char c = evt.getKeyChar();
        if (!(((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'z')) ||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_passwordKeyTyped

    private void confirmPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordKeyTyped
        char c = evt.getKeyChar();
        if (!(((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'z')) ||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_confirmPasswordKeyTyped

    private void userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyTyped
        char c = evt.getKeyChar();
        if (!(((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'z')) ||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_userNameKeyTyped

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField confirmPassword;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField password;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
