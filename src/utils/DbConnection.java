package utils;

import java.sql.Connection;
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
        	JOptionPane.showMessageDialog(null,"Error in the database connection, please check your settings.","Error",JOptionPane.ERROR_MESSAGE);
        }
        return null;
	}
    
    private static Connection connectToDatabase() throws ClassNotFoundException, SQLException {
    	Class.forName("org.mariadb.jdbc.Driver");
		//Class.forName("com.mysql.cj.jdbc.Driver");
    	String urlCon="jdbc:mariadb://";
        //con=DriverManager.getConnection(urlCon, Configuration.db_user, Configuration.db_password);         
        return con;
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
}
