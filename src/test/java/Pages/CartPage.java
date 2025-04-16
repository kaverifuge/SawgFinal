package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="(//button[normalize-space()='Checkout'])[1]")
	WebElement btnCheckOut;
	
	public void clickCheckOutButton() {
		btnCheckOut.click();
		
	}

}
