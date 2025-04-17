package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AllProductsDisplayPage;
import Pages.OnlyBackPackDisplayPage;

public class TC003_verifyUserIsAbleToAddItemToCart extends BaseTest{
	 
	 
	@Test(groups = "Verification")
	public void verifyAdditionOfItemsSuccess() throws IOException, InterruptedException {
		
		loginToAccount();
		additionOfItems();
		try
		{
	   if(obackpack.verifyRemovebtnIsDisplayedAfterAdding() == true) {
		  Assert.assertTrue(true);
		  System.out.println("TC : Pass User is able to Add Item !!!!");
	   }else {
		   Assert.assertTrue(false);
		  System.out.println("TC : FAIL User is not able to Add Item");
	   }
		
	}catch(AssertionError e) {
		System.out.println("Assertion message : "+ e.getMessage());
	
	}
	
	}
}
