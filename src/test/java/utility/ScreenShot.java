package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static String captureScreenShot(WebDriver driver, String filename) throws IOException {
		TakesScreenshot scrshot = (TakesScreenshot) driver;

		File source = scrshot.getScreenshotAs(OutputType.FILE);

//		File destination = new File("E:\\desktop\\Katraj\\Oct Batch\\Selenium\\Screenshots\\"+filename+".png");

		String path = System.getProperty("user.dir") + "\\CapturedScreenShot\\" + filename + ".png";

		File destination = new File(path);
		FileHandler.copy(source, destination);
		
		return path;
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\desktop\\Katraj\\Oct Batch\\Selenium\\Chromedrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		TakesScreenshot scrshot = (TakesScreenshot) driver;

		File source = scrshot.getScreenshotAs(OutputType.FILE);

		File destination = new File("E:\\desktop\\Katraj\\Oct Batch\\Selenium\\Screenshots\\faccebook.png");

		FileHandler.copy(source, destination);

	}

}
