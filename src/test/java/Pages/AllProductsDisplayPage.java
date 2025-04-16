package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProductsDisplayPage extends BasePage{

	public AllProductsDisplayPage(WebDriver driver) {
		super(driver);
	
	}
	
	
	 @FindBy(xpath="//img[@alt='Sauce Labs Backpack']")
	 WebElement btnBackpack;
	 
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 
	 //(//a[@class='shopping_cart_link'])[1]
	 //(//a[@class='shopping_cart_link'])[1]
	 ////a[@class='shopping_cart_link']
     WebElement btnCart;	 
	 
	 
	 
	 public void selectBackpackItem() {
		 btnBackpack.click();
		 
	 }
	 
	 public void clickCartButton() {
		 
		 btnCart.click();
	 }

}
