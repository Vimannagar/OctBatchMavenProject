package pomtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompage.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void loginToApp()
	{		
		lp.intialLogin();
		lp.finalLogin();
		
	}
	
	
	@Test(priority = 2)
	public void verifyUrl()
	{
		Boolean valuereturned = lp.getUrl();
		
		Assert.assertTrue(valuereturned, "Test case failed");
	}

}
