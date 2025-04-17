package TestCases;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		
				TakesScreenshot screen = (TakesScreenshot)driver;
				File source = screen.getScreenshotAs(OutputType.FILE );
				File target = new File(System.getProperty("user.dir")+"//screenshots//fullpage.png");
				source.renameTo(target);
				
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
