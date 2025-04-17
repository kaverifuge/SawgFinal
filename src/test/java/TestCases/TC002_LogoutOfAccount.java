package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.DrawerOption;

public class TC002_LogoutOfAccount extends BaseTest{
	
	
	public DrawerOption drawer;
	
	@Test
	public void logOutOfAccount() throws IOException, InterruptedException {
		
		drawer = new DrawerOption(driver);
		loginToAccount();
		//driver.switchTo().alert().accept();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		drawer.clickDrawerOption();
		drawer.clickLogot();
		
		sa = new SoftAssert();
		try {
		if(driver.getTitle().equals("Swag Labs")) {
		
		    sa.assertTrue(true);
		    System.out.println("Logout Success !!!!!");
		}else {
			
			sa.assertTrue(false);
		    System.out.println("Logout Failed ");
			
		}
		sa.assertAll();
		}catch(AssertionError e) {
			System.out.println("Assertion error  : "+e.getMessage());
		}
	}
	     

}
