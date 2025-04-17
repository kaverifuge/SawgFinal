package TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	sa= new SoftAssert();
	try {
	    if(obackpack.verifyAddItembtnPresent() == true) {
	    	
	    	TakesScreenshot screen1 = (TakesScreenshot)driver;
	    	File source1 = screen1.getScreenshotAs(OutputType.FILE);
	    	File target1 = new File(System.getProperty("user.dir")+"//screenshots//fullpage1.png");
	    	source1.renameTo(target1);
	    	
	    	sa.assertTrue(true);
	    	System.out.println("Item Removed !!!!");
	    }else {
	    	
	    	TakesScreenshot screen2 = (TakesScreenshot)driver;
	    	File source2 = screen2.getScreenshotAs(OutputType.FILE);
	    	File target2 = new File(System.getProperty("user.dir")+"//screenshots//removebtn.png");
	    	source2.renameTo(target2);
	    	
	    	sa.assertTrue(false);
	    	System.out.println("Item Not Removed ");
	    }
	    
	    sa.assertAll();
	    
	}catch(AssertionError e) {
		
		System.out.println("Assertion error : " + e.getMessage());
	}
	
	}

}
