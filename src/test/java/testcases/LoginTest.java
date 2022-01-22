package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;



public class LoginTest extends Listeners {
	
	@Test(priority = 1)
	public void loginToApp()
	{		
		lp.intialLogin();
		test.info("Credentials entered");
		lp.finalLogin();
		
		test.info("Pin Entered");
		
	}
	
	
	@Test(priority = 2)
	public void verifyUrl()
	{
		Boolean valuereturned = lp.getUrl();
		
		Assert.assertTrue(valuereturned, "Test case failed");
	}

}
