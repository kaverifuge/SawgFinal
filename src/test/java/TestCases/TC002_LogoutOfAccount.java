package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.DrawerOption;

public class TC002_LogoutOfAccount extends BaseTest{
	
	
	public DrawerOption drawer;
	
	@Test(groups ="Sanity")
	public void logOutOfAccount() throws IOException, InterruptedException {
		
		drawer = new DrawerOption(driver);
		loginToAccount();
		//driver.switchTo().alert().accept();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		drawer.clickDrawerOption();
		drawer.clickLogot();
		
		
		if(driver.getTitle().equals("Swag Labs")) {
		
		    Assert.assertTrue(true);
		    System.out.println("TC002 :Pass : Logout Success");
		}else {
			
			Assert.assertTrue(false);
		    System.out.println("TC002 :Fail : Logout Failed ");
			
		}
		
	}
	     

}
