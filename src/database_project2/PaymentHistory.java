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

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PaymentHistory extends javax.swing.JFrame {

    /**
     * Creates new form PaymentHistory
     */
    String AdminId;
    int modIndex = 0;
    int currentLength;
    ArrayList<PaymentInfo> arr = new ArrayList();
    public PaymentHistory() {
        initComponents();
    }
    public PaymentHistory(String AdminId) {
        this.AdminId = AdminId;
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) searchByDate.getDateEditor();editor.setEnabled(false);
        arr = new ConnectMSSQL().getPaymentInfo("ORDER BY PaymentId desc");
        jTable1.setDefaultEditor(Object.class, null);
        clearTable(jTable1);
        
        if((modIndex+1)*16>=arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        
        for(int i=0;i<currentLength;i++)
        {
           
            jTable1.getModel().setValueAt(arr.get(i).getPaymentId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getName(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getDateAndTime(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getAmount(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getAdminId(),i, 5);
            jTable1.getModel().setValueAt("Delete", i,6);
            
            
             
        }
        
        jTable1.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        jTable1.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),jTable1));
        
        prevButton.setVisible(false);
        if(arr.size()<16)
            nextButton.setVisible(false);
        int dailyPayment = 0,monthlyPayment = 0;
        String curDate,curMonth;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        String f = formatter.format(date);
        curMonth =  f.substring(0, 7);
        curDate =  f;
        for(int i=0;i<arr.size();i++)
        {
            f = arr.get(i).getDateAndTime();
            if(curDate.equals(f.substring(0, 10)))
            {
                dailyPayment+= arr.get(i).getAmount();
            }
            if(curMonth.equals(f.substring(0, 7)))
            {
                monthlyPayment+= arr.get(i).getAmount();
            }
        }
        totalPaymentToday.setText(Integer.toString(dailyPayment));
        totalMonthlyPayment.setText(Integer.toString(monthlyPayment));
    }
    public static void clearTable(final JTable table) 
    {
        for (int i = 0; i < table.getRowCount(); i++) 
        {
            for(int j = 0; j < table.getColumnCount(); j++) 
            {
                table.setValueAt("", i, j);
            }   
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalMonthlyPayment = new javax.swing.JTextField();
        totalPaymentToday = new javax.swing.JTextField();
        searchByMemberId = new javax.swing.JTextField();
        searchByDate = new com.toedter.calendar.JDateChooser();
        searchButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        searchById = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        setPreferredSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment History");

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
                .addGap(22, 22, 22)
                .addComponent(backButton)
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Payment ID", "Member ID", "Name", "Date and Time", "Amount", "Admin ID", "Action"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 980, 280));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total Monthly Payment:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total Payment Today:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        totalMonthlyPayment.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        totalMonthlyPayment.setEnabled(false);
        getContentPane().add(totalMonthlyPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 200, 30));

        totalPaymentToday.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        totalPaymentToday.setEnabled(false);
        totalPaymentToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPaymentTodayActionPerformed(evt);
            }
        });
        getContentPane().add(totalPaymentToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 200, 30));

        searchByMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByMemberIdActionPerformed(evt);
            }
        });
        searchByMemberId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchByMemberIdKeyTyped(evt);
            }
        });
        getContentPane().add(searchByMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 160, 30));
        getContentPane().add(searchByDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, 30));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, 30));

        jLabel4.setText("Search by Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 100, -1));

        searchById.setText("Search by Member ID");
        getContentPane().add(searchById, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, -1));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        getContentPane().add(prevButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchByMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByMemberIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByMemberIdActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       new Payment(this.AdminId).setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String query = "";
        if(searchByMemberId.getText().length()!=0 )
        {
            query+= " where MemberId = '"+searchByMemberId.getText()+"'";
        }
        if(((JTextField)searchByDate.getDateEditor().getUiComponent()).getText().length()!=0)
        {
            if(query.length()==0)
            {
                query+= " where ";
            }
            else
            {
                query+= " and ";
            }
            query+= "DateAndTime LIKE '"+new SimpleDateFormat("yyyy/MM/dd").format(searchByDate.getDate()).toString()+"%'";
        }
        arr = new ConnectMSSQL().getPaymentInfo(query);
        System.out.println(query);
        clearTable(jTable1);
        modIndex = 0;
        if((modIndex+1)*16>=arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        
        for(int i=0;i<currentLength;i++)
        {
           
            jTable1.getModel().setValueAt(arr.get(i).getPaymentId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getName(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getDateAndTime(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getAmount(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getAdminId(),i, 5);
            jTable1.getModel().setValueAt("Delete", i,6);
            
            
             
        }
        
        
        prevButton.setVisible(false);
        if(arr.size()<16)
            nextButton.setVisible(false);
        else nextButton.setVisible(true);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchByMemberIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByMemberIdKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_searchByMemberIdKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        if(col==6 && row<currentLength)
        {
            int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            if(x==0)
            {
                try
                {
                    new ConnectMSSQL().delete("Payment"," where PaymentId = '"+jTable1.getValueAt(row, 0)+"'");
                    JOptionPane.showMessageDialog(this, "Payment Status deleted Succesfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    new PaymentHistory(this.AdminId).setVisible(true);
                    this.setVisible(false);
                
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Error Occured", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        modIndex--;
        if(modIndex==0)
            prevButton.setVisible(false);
        nextButton.setVisible(true);
        clearTable(jTable1);
        if((modIndex+1)*16>=arr.size())
            currentLength = arr.size()%16;
        else currentLength = 16;
        for(int i=0;i<currentLength;i++)
        {
           
            jTable1.getModel().setValueAt(arr.get(i).getPaymentId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getName(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getDateAndTime(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getAmount(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getAdminId(),i, 5);
            jTable1.getModel().setValueAt("Delete", i,6);
            
            
             
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        modIndex++;
        prevButton.setVisible(true);
        if((modIndex+1)*16>=arr.size())
        nextButton.setVisible(false);
        clearTable(jTable1);
        if((modIndex+1)*16>=arr.size())
        currentLength = arr.size()%16;
        else currentLength = 16;
       for(int i=0;i<currentLength;i++)
        {
           
            jTable1.getModel().setValueAt(arr.get(i).getPaymentId(),i, 0);
            jTable1.getModel().setValueAt(arr.get(i).getMemberId(),i, 1);
            jTable1.getModel().setValueAt(arr.get(i).getName(),i, 2);
            jTable1.getModel().setValueAt(arr.get(i).getDateAndTime(),i, 3);
            jTable1.getModel().setValueAt(arr.get(i).getAmount(),i, 4);
            jTable1.getModel().setValueAt(arr.get(i).getAdminId(),i, 5);
            jTable1.getModel().setValueAt("Delete", i,6);
            
            
             
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void totalPaymentTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPaymentTodayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPaymentTodayActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton searchButton;
    private com.toedter.calendar.JDateChooser searchByDate;
    private javax.swing.JLabel searchById;
    private javax.swing.JTextField searchByMemberId;
    private javax.swing.JTextField totalMonthlyPayment;
    private javax.swing.JTextField totalPaymentToday;
    // End of variables declaration//GEN-END:variables
}
