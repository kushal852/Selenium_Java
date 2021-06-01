package resources;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportutility {
	
	ExtentReports extent;

	public ExtentReports config()

	{

	String path=System.getProperty("user.dir")+"\\reports\\index.html";

	ExtentSparkReporter reporter=new ExtentSparkReporter(path);

	reporter.config().setReportName("We Automation Result");

	reporter.config().setDocumentTitle("Test Results");

	extent=new ExtentReports();

	extent.attachReporter(reporter);

	extent.setSystemInfo("Tester", "Kushal");
	
	return extent;

	}

}
