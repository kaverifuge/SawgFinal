package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage  {

	public CheckoutCompletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="(//h2[normalize-space()='Thank you for your order!'])[1]")
	WebElement txtOrderConfirm;
	
	@FindBy(xpath="(//button[normalize-space()='Back Home'])[1]")
	WebElement btnBackHome;

	
	public boolean confirmOrderSuccesstext() {
		
		boolean odersuccesstxt = txtOrderConfirm.isDisplayed();
		return odersuccesstxt;
	}
}

