package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OnlyBackPackDisplayPage extends BasePage{

	public OnlyBackPackDisplayPage(WebDriver driver) {
		
		super(driver);
		
	}

	
	


////button[@id='add-to-cart']
//(//button[normalize-space()='Add to cart'])[1]
	@FindBy(xpath="(//button[normalize-space()='Add to cart'])[1]")
	 WebElement btnAddtoCart;
	
	////button[@id='remove']
	//(//button[normalize-space()='Remove'])[1]
	 @FindBy(xpath="(//button[normalize-space()='Remove'])[1]")
	 WebElement btnRemove;
	 
	 public void clickBackpackAddbtn() {
		 btnAddtoCart.click();
	 }
	 
	 public boolean verifyRemovebtnIsDisplayedAfterAdding() throws InterruptedException {
		 Thread.sleep(40);
		 boolean removebtnIsPresent = btnRemove.isDisplayed();
		 return removebtnIsPresent;
	 }
	 
	 public void clickRemoveItembtn() {
		 
		 btnRemove.click();
	 }
	 
	 public boolean verifyAddItembtnPresent() {
		 boolean btnAddItemPresent = btnAddtoCart.isDisplayed();
		 return btnAddItemPresent;
	 }
}
