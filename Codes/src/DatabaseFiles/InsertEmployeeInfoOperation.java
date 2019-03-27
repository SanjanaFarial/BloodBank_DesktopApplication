/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseFiles;

import JavaFiles.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertEmployeeInfoOperation {
   
    private DBConnect dbc;
    private ResultSet rs; 
    
    //public void Operation() throws SQLException
    public void InsertEmployeeInfoOperation()
    {
                      
    }
    
    public void saveInvoice(Employee emp) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
        
         
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO EMPLOYEE(EmployeeName , EmployeeAddress , EmployeeSalary , EmployeeDesignation , EmployeePhoneNumber)"
                                            + " VALUES('"+emp.getempName()+"','"+emp.getempAddress()+"','"+emp.getempSalary()+"','"+emp.getempDesignation()+"','"+emp.getempPhone()+"')");
                              
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
