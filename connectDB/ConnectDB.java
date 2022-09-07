package connectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance = new ConnectDB();	
	public static ConnectDB getInstance() {
		return instance;
	}
	public void connect() throws SQLException {		
		try {
//			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNVien";
			String url = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QLNVien";
			String user = "sa";
			String password = "123456789";
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNVien", "sa", "123");		
//			con = DriverManager.getConnection(url, user, password);		
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
	}	
	public void disconnect() {
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {	e.printStackTrace();			}
	}
	
	public static Connection getConnection() {
		return con;
	}
	public static void main(String[] args) {
	
			try {
				ConnectDB.getInstance().connect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				ConnectDB.getInstance().disconnect();;
			}
			
	}
	public static void main(String[] args) {
		
	}
}
