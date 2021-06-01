package Maven_Practice.Maven_Java;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class mobile_prepay_Test {
	
	@BeforeTest
	public void MobileTopupTest() {
		
		System.out.println("mobile_topup");
	}
	
	@AfterTest
	public void MobileAddonTest() {
		
		System.out.println("mobile_addon");
	}

}
