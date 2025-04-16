package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage{

	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 @FindBy(xpath="(//button[normalize-space()='Finish'])[1]")
	  WebElement btnFinish;
	 
	 //@FindBy(xpath="")
	  //WebElement ;
	 
	 public void clickFinishButton() {
		 btnFinish.click();		 
	 }
}
