package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testcases.BaseTest;
import utility.ScreenShot;

public class Listeners extends BaseTest implements ITestListener {
	ExtentReports extent = ExtentReportGen.extentReportGenerator();
public	static ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case :"+result.getName());
	 test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed :"+result.getName());
		test.log(Status.PASS, "Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed :"+result.getName());
		
		test.fail(result.getThrowable());
		
		try {
			test.addScreenCaptureFromPath(ScreenShot.captureScreenShot(driver, result.getName()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution started :"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution finished :"+context.getName());
		extent.flush();
	}
	
	

}
