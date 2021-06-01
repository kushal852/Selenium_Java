package testNG_Tutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNG_4 {
	
	@BeforeSuite
	@Test
	public void reucurring_topup() {
		
		
		
		System.out.println("reucurring_topup");
		
		
	}
	
	@Test
	public void reucurring_addon() {
		
		
	
		System.out.println("reucurring_addon");
		
		
	}
	
	@Test(groups = {"regression"})
	public void reucurring_bundle() {
		
		
		
		System.out.println("reucurring_bundle");
		
		
	}

}
