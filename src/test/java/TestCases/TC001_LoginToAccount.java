package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TC001_LoginToAccount extends BaseTest{
	
	
	@Test(groups="Sanity" )
	public void loginToAccountAssertion( ) throws IOException, InterruptedException {
		
		loginToAccount();
		logger.info("Logged in to account");
		String loggedInUrl = "https://www.saucedemo.com/inventory.html";
		String url= driver.getCurrentUrl();
		
		
		if(loggedInUrl.equals(url)) {
			Assert.assertTrue(true);
			System.out.println("TC001 : Pass : Login To Account Success");
		}else {
			Assert.assertTrue(false);
			System.out.println("TC001 : Fail : Login To Account Failed");
		}
		
		
	}
		
	 

}
