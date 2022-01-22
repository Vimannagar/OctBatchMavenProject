package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	static ExtentReports extent ;
	
	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"//reports//zerodhareport.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setReportName("ZerodhaTestReport");
		
		reporter.config().setTheme(Theme.STANDARD);
		
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("OS", "Windows");
		
		extent.setSystemInfo("Organization name", "Velocity");
		
		extent.setSystemInfo("Executed by", "Oct Batch");
		
		
		return extent;
		
		
	}

}
