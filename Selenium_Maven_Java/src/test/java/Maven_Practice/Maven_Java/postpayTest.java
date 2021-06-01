package Maven_Practice.Maven_Java;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class postpayTest {
	
	@BeforeSuite
	public void PostpayTopupTest() {
		
		System.out.println("postpay_topup");
	}
	
	@AfterSuite
	public void PostpayAddonTest() {
		
		System.out.println("postpay_addon");
	}


}
