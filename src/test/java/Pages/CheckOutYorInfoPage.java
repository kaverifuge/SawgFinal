package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutYorInfoPage extends BasePage{

	public CheckOutYorInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	  @FindBy(xpath="//input[@id='first-name']")
	  WebElement txtboxFirstname;
	  
	  @FindBy(xpath="//input[@id='last-name']")
	  WebElement txtboxLastname;
	  
	  @FindBy(xpath="//input[@id='postal-code']")
	  WebElement txtboxZipcode;
	  
	  @FindBy(xpath="//input[@id='continue']")
	  WebElement btnContinue;
	  
	  public void enterFirstname(String firstname) {
		  
		  txtboxFirstname.sendKeys(firstname);
	  }
	  
	  public void enterLastname(String lastname) {
		  
		  txtboxLastname.sendKeys(lastname);
	  }
	  
	  public void enterZipcode(String zipcode) {
		  
		  txtboxZipcode.sendKeys(zipcode);
	  }
	  
      public void clickContinuebtn() {
		  
    	  btnContinue.click();
	  }
}
