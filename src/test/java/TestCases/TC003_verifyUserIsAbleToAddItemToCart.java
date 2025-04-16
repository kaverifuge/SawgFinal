package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import Pages.AllProductsDisplayPage;
import Pages.OnlyBackPackDisplayPage;

public class TC003_verifyUserIsAbleToAddItemToCart extends BaseTest{
	 
	 
	@Test
	public void verifyAdditionOfItemsSuccess() throws IOException, InterruptedException {
		
		loginToAccount();
		additionOfItems();
	   if(obackpack.verifyRemovebtnIsDisplayedAfterAdding() == true) {
		  
		  System.out.println("TC : Pass User is able to Add Item !!!!");
	   }else {
		  System.out.println("TC : FAIL User is not able to Add Item");
	   }
	  
	}
	
	
}
