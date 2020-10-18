import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class ConnectionFactory {

	private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME="ORACLE";
	private static final String PASSWORD="HP";
	
	public static  Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 return DriverManager.getConnection(URL, USERNAME, PASSWORD );
		 
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionFactory.getConnection();
		System.out.println("connection created");
	}
	
	
	}

