package Maven_Practice.Maven_Java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrepayTest {
	
	
	@Test
	public void PrepayTopupTest() {
		
		System.out.println("prepay_topup");
	}
	
	@BeforeMethod
	public void Prepaybalancecheck() {
		
		System.out.println("Prepaybalancecheck");
	}
	@AfterMethod
	public void PrepayAddonTest() {
		
		System.out.println("prepay_addon");
	}
	
	

	
	@BeforeClass
	public void PrepayBundleTest() {
		
		System.out.println("prepay_bundle");
	}
	
	@AfterClass
	public void Prepayrecurring() {
		
		System.out.println("recurring_addon");
	}
	
	

}
