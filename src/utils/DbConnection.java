package utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DbConnection {
	private static Connection con;

	public static Connection connect(){        
        try
        {
        	connectToDatabase();        	
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "The JDBC library was not found");
        } catch (SQLException ex) {
        	ex.printStackTrace();
        	JOptionPane.showMessageDialog(null,"Error in the database connection, please check your settings.","Error",JOptionPane.ERROR_MESSAGE);
        }
        return null;
	}
    
    private static Connection connectToDatabase() throws ClassNotFoundException, SQLException {
    	//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	//String dbUrl = "jdbc:sqlserver://localhost\\sqlexpress;user=sa;password=secret";
    	//String dbUrl = "jdbc:sqlserver://localhost;integratedSecurity=true";
    	//con = DriverManager.getConnection(dbUrl);        
        return con;
    }
    
    public static void showConnectionDetails() {
    	if (con != null) {
    		try {
    			DatabaseMetaData dm = (DatabaseMetaData) con.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
			} catch (Exception e) {
				print("Error showing details");
			}
            
        }
    }
    public static Connection getConnection(){
    	return con != null ? con : null;
    }
    
    public static void setToNull(){
    	con = null;
    }
    
    public static void closeConnection() {
    	try {
			con.close();
		} catch (SQLException e) {
			 JOptionPane.showMessageDialog(null, "Error closing the connection");
		}
    }
    
    private static void print(String msg) {
    	System.out.println(msg);
    }
}
