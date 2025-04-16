package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.OnlyBackPackDisplayPage;

public class TC005_RemoveItem extends BaseTest{
	
	public OnlyBackPackDisplayPage obackpack;
	
	@Test
	public void removeItem() throws IOException, InterruptedException {
	
	loginToAccount();
	additionOfItems();
	Thread.sleep(1000);
	
	obackpack = new OnlyBackPackDisplayPage(driver);
	
	obackpack.clickRemoveItembtn();
	
	sa= new SoftAssert();
	    if(obackpack.verifyAddItembtnPresent() == true) {
	    	
	    	sa.assertTrue(true);
	    	System.out.println("Item Removed !!!!");
	    }else {
	    	
	    	sa.assertTrue(false);
	    	System.out.println("Item Not Removed ");
	    }
	
	}

}
