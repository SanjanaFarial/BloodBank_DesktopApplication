/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseFiles;

import java.sql.ResultSet;
import java.sql.SQLException;

import JavaFiles.BloodInfo;
import JavaFiles.Employee;

/**
 *
 * @author ASUS
 */
public class insertBloodInfoOperation {
    
    
     private DBConnect dbc;
    private ResultSet rs; 
    
    //public void Operation() throws SQLException
    public void insertBloodInfoOperation()
    {
                      
    }
    
    public void saveInvoice(BloodInfo emp) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
        
         
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO BloodInventory(DonorID,QuantityAvailable ,  Plasma , Platelets , RedBloodCells, WhiteBloodCells ,Heamoglobin )"
                                            + " VALUES('"+emp.getDonarID()+"','"+emp.getQuantityAvailabe()+"','"+emp.getPlasma()+"','"+emp.getPlatelets()+"','"+emp.getRedBloodCells()+"','"
                                                     +emp.getWhiteBloodCells()+"','"+emp.getHeamoglobin()+"')");
                              
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
