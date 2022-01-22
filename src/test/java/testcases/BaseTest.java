package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoardPage;
import pages.LoginPage;



public class BaseTest {
public	static WebDriver driver;
public	LoginPage lp;
public	DashBoardPage db;
	@BeforeSuite
	public void initBrowser() {
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\desktop\\Katraj\\Oct Batch\\Selenium\\Chromedrivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
//		options.addArguments("--disable-notifications");
//		
//		options.addArguments("--start-maximized");
//		
//		options.addArguments("--incognito");
		
		options.addArguments("--headless");

		driver = new ChromeDriver(options);

//		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
	}
	
	@BeforeClass
	public void createObject() throws IOException
	{
		 lp = new LoginPage(driver);
		 db = new DashBoardPage(driver);
		 
	}
	
	

}
