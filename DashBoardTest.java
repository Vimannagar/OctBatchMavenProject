package pomtest;

import org.testng.annotations.Test;



public class DashBoardTest extends BaseTest {
	
	
	
	@Test(priority = 3)
	public void search()
	{
		db.searchShares();
	}

}
