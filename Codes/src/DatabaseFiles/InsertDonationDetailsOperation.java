/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseFiles;

import JavaFiles.DonationDetails;
import JavaFiles.DonorInfo;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class InsertDonationDetailsOperation {
    
    
    private DBConnect dbc;
    private ResultSet rs; 
    
    //public void Operation() throws SQLException
    public void InsertDonationDetailsOperation()
    {
                      
    }
    
    public void saveInvoice(DonationDetails emp) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
        
        
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO DonationDetails(BagNumber , Hospital , CollectionDate , GivingDate , GivenAmount)"
                                            + " VALUES('"+emp.getBagNumber()+"','"+emp.getHospital()+"','"+emp.getCollectionDate()
                                                   +"','"+emp.getGivingDate()+"','"+emp. getGivenAmount()+"')");
                              
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
