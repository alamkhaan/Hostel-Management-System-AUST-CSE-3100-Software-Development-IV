/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanjim
 */

package database_project2;

import com.github.lgooddatepicker.components.DateTimePicker;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddNewVisitor extends javax.swing.JFrame {

    /**
     * Creates new form AddNewVisitor
     */
    String AdminId;
    public AddNewVisitor() {
        initComponents();
        
    }
    public AddNewVisitor(String AdminId) {
        initComponents();
        this.AdminId = AdminId;
        timeIn.datePicker.getSettings().setAllowKeyboardEditing(false);
        timeOut.datePicker.getSettings().setAllowKeyboardEditing(false);
        timeIn.timePicker.getSettings().setAllowKeyboardEditing(false);
        timeOut.timePicker.getSettings().setAllowKeyboardEditing(false);
       
        
        
    }
    
    boolean validationTime()
    {
        //System.out.println(timeIn.getDatePicker().toString()+" "+timeOut.getDatePicker().toString());
        //System.out.println(timeIn.getTimePicker().toString()+" "+timeOut.getTimePicker().toString());
        String time1 = timeIn.getDatePicker().toString();
        String time2 = timeOut.getDatePicker().toString();
        String time3 = timeIn.getTimePicker().toString();
        String time4 = timeOut.getTimePicker().toString();
        //System.out.println(time1+" "+time2+" "+time3+" "+time4);
        if(time1.equals(time2))
        {
            return time4.compareTo(time3)>0 ? true : false;
        }
        else
        {
            return time2.compareTo(time1)>0 ? true : false;
        }
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        memberId = new javax.swing.JTextField();
        visitorsName = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        timeOut = new com.github.lgooddatepicker.components.DateTimePicker();
        timeIn = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel1.setText("Add New Visitor");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

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
                .addGap(39, 39, 39)
                .addComponent(backButton)
                .addGap(307, 307, 307)
                .addComponent(jLabel1)
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Time In:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Member's ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Time Out:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Visitor's Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 30));

        memberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                memberIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                memberIdKeyTyped(evt);
            }
        });
        getContentPane().add(memberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 310, 40));
        getContentPane().add(visitorsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 310, 40));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 120, 40));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 120, 40));
        getContentPane().add(timeOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 310, 40));
        getContentPane().add(timeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 310, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(visitorsName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Visitors Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(memberId.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Member Id is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(timeIn.getDatePicker().toString().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Time In date is not set","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(timeIn.getTimePicker().toString().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Time In time is not set","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(timeOut.getDatePicker().toString().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Time Out date is not set","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(timeOut.getTimePicker().toString().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Time Out time is not set","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!validationTime())
        {
            JOptionPane.showMessageDialog(this, "Time Out should be gretaer than Time In","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            ArrayList<MemberInfo> arr=new ArrayList();
            try{
                 arr = new ConnectMSSQL().getMemberInfo("where MemberId = "+memberId.getText());
                 
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error Occured,Unsuccessful","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(arr.size()==0){
                
                JOptionPane.showMessageDialog(this, "Member Id is not valid","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                VisitorInfo visitor =   new VisitorInfo();
                String str =  new ConnectMSSQL().getSerial("VisitorSerial");
                visitor.setVisitorsName(visitorsName.getText());
                visitor.setMemberId(memberId.getText());
                visitor.setVisitorId(str+memberId.getText());
                visitor.setTimeIn(timeIn.datePicker.getText().toString()+" "+timeIn.timePicker.getText().toString());
                visitor.setTimeOut(timeOut.datePicker.getText().toString()+" "+timeOut.timePicker.getText().toString());
                try
                {
                    new ConnectMSSQL().addVisitor(visitor);
                    new ConnectMSSQL().update("SerialNo", "VisitorSerial = VisitorSerial+1");
                    resetButtonActionPerformed(evt);
                    JOptionPane.showMessageDialog(this, "Insert Successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Error Occured.\nUnSuccesful\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Visitor(this.AdminId).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        visitorsName.setText("");
        memberId.setText("");
        timeIn.datePicker.clear();
        timeIn.timePicker.clear();
        timeOut.datePicker.clear();
        timeOut.timePicker.clear();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void memberIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberIdKeyPressed

    private void memberIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberIdKeyTyped
        char ch = evt.getKeyChar();
        if(!((ch>='0' && ch<='9')|| ch==KeyEvent.VK_BACK_SPACE ))
        {
            evt.consume();
        }
    }//GEN-LAST:event_memberIdKeyTyped

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
            java.util.logging.Logger.getLogger(AddNewVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewVisitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField memberId;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private com.github.lgooddatepicker.components.DateTimePicker timeIn;
    private com.github.lgooddatepicker.components.DateTimePicker timeOut;
    private javax.swing.JTextField visitorsName;
    // End of variables declaration//GEN-END:variables
}
