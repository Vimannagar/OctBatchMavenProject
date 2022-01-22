package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.DashBoardPage;
import pompage.LoginPage;

public class BaseTest {
	static WebDriver driver;
	LoginPage lp;
	DashBoardPage db;
	@BeforeSuite
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\desktop\\Katraj\\Oct Batch\\Selenium\\Chromedrivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
	}
	
	@BeforeClass
	public void createObject()
	{
		 lp = new LoginPage(driver);
		 db = new DashBoardPage(driver);
		 
	}
	
	

}
