package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.AllProductsDisplayPage;
import Pages.CartPage;
import Pages.CheckOutYorInfoPage;
import Pages.CheckoutCompletePage;
import Pages.CheckoutOverviewPage;

import Utilities.ReadConfigFileData;

public class TC004_VerifyCompletePurchaseSuccess extends BaseTest {
	
	public  AllProductsDisplayPage ap;
	public CartPage cp ;
	public CheckOutYorInfoPage chkinfo;
	public ReadConfigFileData rdconfig;
	public CheckoutOverviewPage chkOverview;
	public CheckoutCompletePage chckComplete;
	
	@Test(groups ={"Functionality","Sanity"})
	public void purchaseCompleteSucess() throws IOException, InterruptedException  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		loginToAccount();
		additionOfItems();
		
		//System.out.println("Additem success");
		ap = new AllProductsDisplayPage(driver);
		ap.clickCartButton();
		
		cp = new CartPage(driver);
		cp.clickCheckOutButton();
		
		chkinfo = new CheckOutYorInfoPage(driver);
		
		rdconfig = new ReadConfigFileData();
		chkinfo.enterFirstname(rdconfig.readFirstname());
		chkinfo.enterLastname(rdconfig.readLastname());
		chkinfo.enterZipcode(rdconfig.readZipcode());
		chkinfo.clickContinuebtn();
		
		chkOverview = new CheckoutOverviewPage(driver);
		chkOverview.clickFinishButton();
		
		chckComplete = new CheckoutCompletePage(driver);
		
		 if(chckComplete.confirmOrderSuccesstext()== true) {
			 
			 Assert.assertTrue(true);
			 System.out.println("TC004 :Pass : Purchase item worked ");
		 }else {
			 Assert.assertTrue(false);
			 System.out.println("TC004 :Pass : Purchase item not working");
		 }
		
		
		
	}

}
