package TestCases;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC006_VerifyAppTitle extends BaseTest{
	
	@Test(groups = "Verification")
	public void checkAppTitle() {
		
		
		String appurl = driver.getCurrentUrl();
		
		
		//try {
			
		if(appurl.equals("https://www.saucedemooo.com/")) {

			Assert.assertTrue(true);
			System.out.println("TC006 : Pass : Title matched");
			
		}else {
		
				TakesScreenshot screen = (TakesScreenshot)driver;
				File source = screen.getScreenshotAs(OutputType.FILE );
				File target = new File(System.getProperty("user.dir")+"//screenshots//fullpage.png");
				source.renameTo(target);
				
				System.out.println("TC006 : Fail : Title NOT matched");
				Assert.assertTrue(false);
				
		}
		 
	}

}
