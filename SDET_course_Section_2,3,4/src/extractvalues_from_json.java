import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class extractvalues_from_json {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		// scenario : extracting values from json using objectmapper
		ObjectMapper om = new ObjectMapper();
		customer_details_pojo_appium c= om.readValue(new File("C:\\Users\\91999\\Selenium_Java\\SDET_course\\customerInfo0.json"), customer_details_pojo_appium.class);
	
	     System.out.println(c.getStudentName());
	     
	     // this extraction can be done using other methods also
	     
	}

}
