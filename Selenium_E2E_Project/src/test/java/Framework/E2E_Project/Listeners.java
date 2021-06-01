package Framework.E2E_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Baseclass;
import resources.Extentreportutility;



public class Listeners extends Baseclass implements ITestListener {

	ExtentTest Test;
	Extentreportutility a = new Extentreportutility();
	ExtentReports extent= a.config();
	ThreadLocal<ExtentTest> test_local = new ThreadLocal<ExtentTest>();// this threadlocal is responsible for the test object while parallel execution
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		Test = extent.createTest(result.getMethod().getMethodName());
		test_local.set(Test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test_local.get().log(Status.PASS,"Test Passed");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		test_local.get().fail(result.getThrowable());
		WebDriver driver = null;
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e) {
			
		}
		
		String failed_method = result.getMethod().getMethodName();
		try {
			test_local.get().addScreenCaptureFromPath(get_screenshot(failed_method,driver), failed_method);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		extent.flush();
		
	}

	
}
