package testNG_Tutorial;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// 

public class testNG_Basic {
	
	@Test
	public void test1() {
		
		System.out.println("this is first test");
		Assert.assertTrue(false);
		
	}
	
	@Test
    public void test2() {
		
		System.out.println("this is second test");
		
		
	}
	
	@BeforeTest
	   public void Prerequsite() {
		
			System.out.println("this is Prerequsite test which will run before all the test cases in the test case folder instead of following the sequence");
			
			
		}
	
	@BeforeSuite
	
	   public void After_suite() {
		
				System.out.println("Deleting cookies and launching browser");
				
				
			}
	

}
