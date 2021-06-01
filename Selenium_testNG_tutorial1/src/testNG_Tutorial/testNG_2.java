package testNG_Tutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG_2 {
	
	@Parameters({"global_URL","Test_URL"}) // this parameter is applicable to this method only.
	
	@Test
	public void address_change(String urlname, String test_url) {
		
		
		
		System.out.println("Address_change");
		System.out.println(urlname);
		System.out.println(test_url);
	}
	
	@Test(groups= {"regression"})
	public void name_change() {
		
		
		
		System.out.println("Name_change");
		
	}
	
	@Parameters({"Test_URL"}) 
	@Test
	public void personal_details_email_change(String urlname) {
		
		
		
		System.out.println("personal_details_email_change");
		System.out.println(urlname);
		
	}
	
	
	@Test(dataProvider = "get_data") // since get_data method is having 3 combination of data this test case method will execute 3 times.
	public void personal_details_number_change(String country_name, String phone_number) {
		
		
		
		System.out.println("personal_details_number_change");
		System.out.println(country_name);
		System.out.println(phone_number);
		System.out.println("\n");
		
	}
	
	@Test
	public void personal_details_DOB_change() {
		
		
		
		System.out.println("personal_details_DOB_change");
		
	}
	/*
	 * Annonations scope will be only test folder if the suite is executed in suite level then this will execute last but normally the scope is for only for test folder
	 * */
	@AfterTest
	   public void after() {
		
			System.out.println("this is will execute after the all test cases in test case folder");
			
			
		}
	 
	@AfterSuite
	@Test
	public void after_suite() {
		
		
		
		System.out.println("clear cookies or browser closing");
		
	}
	
	@DataProvider
	
   public Object[][] get_data() {
		
		//no. of combinations will be rows
		//no. of values in each combination will be values
		/* for example if we want to change phone number we are testing 3 combinations and values are(country,phonenumber)
		 * 
		 * 
		 * */
		
		Object[][] data = new Object[3][2];
		
		// 1st combination
		data[0][0] = "india";
		data[0][1] = "9994356366";
		// 2nd combination
		data[1][0] = "europe";
		data[1][1] = "9095049904";
		//3rd combination
		data[2][0] = "USA";
		data[2][1] = "8328115845";
		
		return data;
		
	}

}
