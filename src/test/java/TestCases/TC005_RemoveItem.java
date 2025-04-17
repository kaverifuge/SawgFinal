package TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.OnlyBackPackDisplayPage;

public class TC005_RemoveItem extends BaseTest{
	
	public OnlyBackPackDisplayPage obackpack;
	
	@Test(groups ="Functionality")
	public void removeItem() throws IOException, InterruptedException {
	
	loginToAccount();
	additionOfItems();
	Thread.sleep(1000);
	
	obackpack = new OnlyBackPackDisplayPage(driver);
	
	obackpack.clickRemoveItembtn();
	
	
	    if(obackpack.verifyAddItembtnPresent() == true) {
	    	
	    	TakesScreenshot screen1 = (TakesScreenshot)driver;
	    	File source1 = screen1.getScreenshotAs(OutputType.FILE);
	    	File target1 = new File(System.getProperty("user.dir")+"//screenshots//fullpage1.png");
	    	source1.renameTo(target1);
	    	
	    	Assert.assertTrue(true);
	    	System.out.println("TC005 : Pass : Item Removed");
	    }else {
	    	
	    	TakesScreenshot screen2 = (TakesScreenshot)driver;
	    	File source2 = screen2.getScreenshotAs(OutputType.FILE);
	    	File target2 = new File(System.getProperty("user.dir")+"//screenshots//removebtn.png");
	    	source2.renameTo(target2);
	    	
	    	Assert.assertTrue(false);
	    	System.out.println("TC005 : Fail : Item Not Removed ");
	    }
	    
	   
	
	}

}
