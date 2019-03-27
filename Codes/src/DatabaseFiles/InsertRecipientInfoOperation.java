/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseFiles;

import JavaFiles.BloodInfo;
import JavaFiles.RecipientInfo;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class InsertRecipientInfoOperation {
    
    private DBConnect dbc;
    private ResultSet rs; 
    
    //public void Operation() throws SQLException
    public void InsertRecipientInfoOperation()
    {
                      
    }
    
    public void saveInvoice(RecipientInfo emp) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
         
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Recipient(RecipientName,RecipientAge,RecipientGender ,  RecipientBloodGroup,"
                 + "                                     RecipientAddress , RecipientArea , RecipientPhoneNumber , DonationNumber )"
                                            + " VALUES('"+emp.getRecipientName()+"','"+emp.getRecipientAge()+"','"+emp.getRecipientGender()+"','"+emp.getRecipientBloodGroup()+"','"+emp.getRecipientAddress()+"','"+emp.getRecipientArea()+"','"
                                                     +emp.getRecipientPhoneNumber()+"','"+emp.getDonationNumber()+"')");
                              
         System.out.println("save or not "+ dataSaved);
         dbc.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();}

    } 
    
 private void closeDB()
{
    try{
        if (rs != null){rs.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}
}

    
}
