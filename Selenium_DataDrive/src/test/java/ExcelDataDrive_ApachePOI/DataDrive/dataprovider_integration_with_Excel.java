package ExcelDataDrive_ApachePOI.DataDrive;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_integration_with_Excel {
	
	@Test(dataProvider = "xl_data_retrieve")
	public void data_retrieve(String testcasename,String name,String lastname,String age) {
		
		System.out.println(name);
		System.out.println(lastname);
		System.out.println(age);
	}
	
	@DataProvider(name = "xl_data_retrieve")
	//@Test
	public Object[][] data_from_xl_print() throws IOException {
		
		excel_data_drive_using_array data = new excel_data_drive_using_array();
		
		String a[] = {"test2","test4"};
		
		
		//ArrayList d =  data.get_data(a[0],"test","C:\\Users\\91999\\OneDrive\\Desktop\\Test_Data.xlsx");
		
		Object[][] temp = new Object[a.length][4];
		
		
		for (int j =0;j<a.length;j++) {
		
			
			ArrayList d =  data.get_data(a[j],"test","C:\\Users\\91999\\OneDrive\\Desktop\\Test_Data.xlsx");
		
			
			//temp = new Object[a.length][d.size()];
			
		//	for (int i=0;i<d.size();i++) {
		    	 
		    	// System.out.println(d.get(i));
			int i = 0;
			while(i<d.size()) {
				
					temp[j][i] = d.get(i);
					i++;
			}
				
		    	
		   // }
			
			
			
		}
		
		return temp;
		 
		
		
		
	
		
	}
	
	

}
