package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TC001_LoginToAccount extends BaseTest{
	
	
	@Test
	public void loginToAccountAssertion() throws IOException, InterruptedException {
		
		loginToAccount();
		String loggedInUrl = "https://www.saucedemo.com/inventory.html";
		String url= driver.getCurrentUrl();
		
		System.out.println(url);
		
		sa = new SoftAssert();
		
		if(loggedInUrl.equals(url)) {
			sa.assertTrue(true);
			System.out.println("Login To Account Success!!!!");
		}else {
			sa.assertTrue(false);
			System.out.println("Login To Account Failed");
		}
		
		
	}
		
	 

}
