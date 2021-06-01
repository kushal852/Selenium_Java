import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnection {

	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";
		String db = "/kushal";
		
	
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + db, "root", "Akhil@852");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from employeeinfo where name = 'kushalgupta'");
		while(rs.next()) {
			
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("id"));
			
		}

	}

}
