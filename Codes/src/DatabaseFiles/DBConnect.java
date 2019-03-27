
package DatabaseFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBConnect {
    private  Statement stmt = null;
    private  Connection connection ;   
    
    public DBConnect(){  }

    public Connection connectToDB() throws SQLException, ClassNotFoundException{
        try {
          
            System.out.println("awwwwwwwwwwwwwwwwwwwwwwwwwwwwww...");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
            "databaseName=BloodBank;";
            
            connection = DriverManager.getConnection(connectionUrl);
            
            System.out.println("Connected database successfully...");
            java.sql.Statement stmt=connection.createStatement();
            
        } catch(SQLException se){System.out.println(se.getMessage());}
         return connection; 
     }

    
    public void disconnectFromDB(){

    try{
       // if (rs != null){rs.close();}
        if (stmt != null){stmt.close();}
        if (connection != null){connection.close();}
    }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to close connection");
        }
    }

    public boolean insertDataToDB(String query)
     {
        try
        {
            java.sql.Statement stmt=connection.createStatement();
            stmt.executeUpdate(query);
            return true;
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to Insert Data");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
     }
}
