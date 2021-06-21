import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JDBC_records_to_java_object_to__json {

	public static void main(String[] args) throws SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		// Scenario : getting the data from DB and converting them to JSON and hitting the server with json file
		String host = "localhost";
		String port = "3306";
		String db = "/business";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + db, "root", "Akhil@852");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * from CustomerInfo where Location = 'Asia' and PurchasedDate = curdate()");
		
		
		ArrayList<Object> a = new ArrayList<Object>();
		while(rs.next()) {
			
			customer_deatils_pojo cdp = new customer_deatils_pojo();
			
			cdp.setCourseName(rs.getString("CourseName"));
			cdp.setPurchasedDate(rs.getString("PurchasedDate"));
			cdp.setAmount(rs.getInt("Amount"));
			cdp.setLocation(rs.getString("Location"));
		
		
			a.add(cdp);

	}
		// making all the json files in one json file
		Map<String, ArrayList<Object>> detailsContent = new HashMap<>();
		detailsContent.put("data", a);
		ObjectMapper om = new ObjectMapper();
		om.writeValue(new File("C:\\Users\\91999\\Selenium_Java\\SDET_course\\customerInfo.json"), detailsContent);
		
		
		// making all the json files in one json file _ other_way
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("data", a);
		om.writeValue(new File("C:\\Users\\91999\\Selenium_Java\\SDET_course\\customerInfo_other_way.json"), jsonObject);
		
		
		// creating json files depending upon the records generated in the DB.
		for(int i=0;i<a.size();i++) {
			
			
			om.writeValue(new File("C:\\Users\\91999\\Selenium_Java\\SDET_course\\customerInfo"+i+".json"), a.get(i));
		}
		
		con.close();

}
}
	
