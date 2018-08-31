package SimpleTest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Test1 {
	
	ExtentHtmlReporter testreporter;
	ExtentReports extent;
	ExtentTest test1;
	
	@BeforeSuite
	public void setup() {
		testreporter=new ExtentHtmlReporter("extent.html");
		extent=new ExtentReports();
		extent.attachReporter(testreporter);
  
	}
	
	@Test
	public void Test1() {
		test1 = extent.createTest("First test case: login successful");
		Assert.assertTrue(true);
	}
	
	@Test
	public void Test2() {
		test1 = extent.createTest("First test case: login test");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			test1.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
			test1.fail(result.getThrowable());
		} else if (result.getStatus()==ITestResult.SUCCESS) {
			test1.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
			 
		} else {
			test1.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.YELLOW));
		}
  
	}
	

	@AfterSuite
	public void teardown() {
		extent.flush();
  
	}
	
}
