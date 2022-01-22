package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;



public class DashBoardTest extends Listeners {
	
	
	
	@Test(priority = 3)
	public void search()
	{
		db.searchShares();
		test.info("Shares searched");
	}

}
