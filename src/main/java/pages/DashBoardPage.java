package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseClass {
	WebDriver driver;
	@FindBy(xpath = "//*[@type='button']") 
	private WebElement getstartedbutton;
	
	@FindBy(xpath = "(//*[@type='text'])[2]") 
	private WebElement searchfield;
	
	public DashBoardPage(WebDriver driver) throws IOException
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchShares()
	{
//		WebElement getstartedbutton = driver.findElement(By.xpath("//*[@type='button']"));
		
		getstartedbutton.click();
		
//		WebElement searchfield = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		
		searchfield.sendKeys(prop.getProperty("sharename"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(searchfield, Keys.ENTER).perform();
	}

}
