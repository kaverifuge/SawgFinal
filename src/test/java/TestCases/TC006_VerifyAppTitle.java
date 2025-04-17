package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC006_VerifyAppTitle extends BaseTest{
	
	@Test
	public void checkAppTitle() throws InterruptedException {
		
		
		String appurl = driver.getCurrentUrl();
		
		sa = new SoftAssert();
		try {
		if(appurl.equals("https://www.saucedemoo.com/")) {
			sa.assertTrue(true);
			System.out.println("Title matched");
			
		}else {
			
			
				sa.assertTrue(false);
				System.out.println("Title NOT matched");

		}
		    sa.assertAll();
		}catch(AssertionError e){
			
			System.out.println("Assertion caught : "+e.getMessage());
			
		}
		    System.out.println("SoftAssert>>>>>>>>>");
		
	}

}
