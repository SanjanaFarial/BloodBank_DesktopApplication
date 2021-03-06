package JForms.ListsAndUpdates;

import JForms.Pages.recipientPage;
import JForms.Pages.recipientPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnawa_000
 */
public class recipientList extends javax.swing.JFrame {

    /**
     * Creates new form recipientList
     */
    public recipientList() {
        initComponents();
        try {  
           //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
           //  Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab10;integratedSecurity=true");  
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
            "databaseName=BloodBank;");
            
   
               Statement statement = connection.createStatement();  
               
             ResultSet rs = statement.executeQuery("SELECT RecipientID , RecipientName ,RecipientAge ,RecipientGender ,RecipientBloodGroup ,RecipientAddress , RecipientArea , RecipientPhoneNumber , DonationNumber  from Recipient");  
             ResultSetMetaData  rsmetadata = rs.getMetaData(); 
              int  columns = rsmetadata.getColumnCount();   
              DefaultTableModel dtm = new DefaultTableModel(); 
              Vector columns_name=new Vector();
              Vector data_rows=new Vector();
              for(int  i= 1; i < columns+1; i++)  
                {             
                        columns_name.addElement (rsmetadata.getColumnLabel(i));  
                }                 
              
              dtm.setColumnIdentifiers(columns_name);
                   while (rs.next())  
           {  
               data_rows = new Vector(); 
               for (int j = 1; j <columns+1; j++)  
               {  
                   data_rows.addElement(rs.getString(j)) ;
               }  
               dtm.addRow(data_rows);  
               
       }   
          rcpTable.setModel(dtm); 
             
         } catch (Exception e) {  
             e.printStackTrace();  
         }
    }
    
    
    public recipientList(String value) {
         initComponents();
        try {  
           //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
           //  Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=lab10;integratedSecurity=true");  
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
            "databaseName=BloodBank;");
            
   
               Statement statement = connection.createStatement();  
         
             ResultSet rs = statement.executeQuery("SELECT  * from Recipient where RecipientBloodGroup = '"+value+"'"+"or RecipientName = '"+value+"'"+"or RecipientArea = '"+value+"'"
                                                    +"or DonationNumber = '"+value.toString()+"'");  
             ResultSetMetaData  rsmetadata = rs.getMetaData(); 
              int  columns = rsmetadata.getColumnCount();   
              DefaultTableModel dtm = new DefaultTableModel(); 
              Vector columns_name=new Vector();
              Vector data_rows=new Vector();
              for(int  i= 1; i < columns+1; i++)  
                {             
                        columns_name.addElement (rsmetadata.getColumnLabel(i));  
                }                 
              
              dtm.setColumnIdentifiers(columns_name);
                   while (rs.next())  
           {  
               data_rows = new Vector(); 
               for (int j = 1; j <columns+1; j++)  
               {  
                   data_rows.addElement(rs.getString(j)) ;
               }  
               dtm.addRow(data_rows);  
               
       }   
          rcpTable.setModel(dtm); 
             
         } catch (Exception e) {  
             e.printStackTrace();  
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
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rcpTable = new javax.swing.JTable();
        btn_BACK = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RECIPIENTS LIST");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 40, 253, 29);

        rcpTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rcpTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rcpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Blood Group", "Address", "Area", "Phone No.", "Donation No."
            }
        ));
        jScrollPane1.setViewportView(rcpTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 988, 402);

        btn_BACK.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btn_BACK.setText("BACK");
        btn_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BACKActionPerformed(evt);
            }
        });
        jPanel1.add(btn_BACK);
        btn_BACK.setBounds(35, 31, 67, 27);

        btn_delete.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete);
        btn_delete.setBounds(870, 40, 124, 31);

        btn_update.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(680, 40, 125, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1090, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BACKActionPerformed
        recipientPage window;
        window = new recipientPage();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BACKActionPerformed
    UpdateRecipientList jtRowData = new UpdateRecipientList();
    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        
        
        int index = rcpTable.getSelectedRow();
        TableModel model = rcpTable.getModel();
        String RecipientID = model.getValueAt(index, 0).toString();
        String RecipientName = model.getValueAt(index, 1).toString();
        String RecipientAge = model.getValueAt(index, 2).toString();
        String RecipientGender = model.getValueAt(index, 3).toString();
        String RecipientBloodGroup = model.getValueAt(index, 4).toString();
        String RecipientAddress = model.getValueAt(index, 5).toString();
         String RecipientArea = model.getValueAt(index, 6).toString();
          String  RecipientPhoneNumber = model.getValueAt(index, 7).toString();
           String DonationNumber = model.getValueAt(index,8).toString();
           
        jtRowData.setVisible(true);
        jtRowData.pack();
        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(false);

        jtRowData.txt_id.setText(RecipientID);
        jtRowData.txt_name.setText(RecipientName);
        jtRowData.txt_area.setText(RecipientArea);
        jtRowData.txt_address.setText(RecipientAddress); 
        jtRowData.txt_gender.setText(RecipientGender);
        jtRowData.txt_blood.setText(RecipientBloodGroup);
        jtRowData.txt_phone.setText(RecipientPhoneNumber);
         jtRowData.txt_age.setText(RecipientAge);
           jtRowData.txt_Dno.setText(DonationNumber);

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int row = rcpTable.getSelectedRow();
        int col = 0;
        Object id = rcpTable.getValueAt( row, col );
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
                "databaseName=BloodBank;");

            Statement statement = connection.createStatement();
            String query="delete from donor where DonorId="+id;
            statement.execute(query);
            JOptionPane.showMessageDialog(null, "Delete Successful!");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recipientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recipientList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BACK;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rcpTable;
    // End of variables declaration//GEN-END:variables
}
