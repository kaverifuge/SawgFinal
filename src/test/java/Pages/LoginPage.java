package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	
	//Constructor
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//Elements
	
	@FindBy(css="input#user-name")
	WebElement txtboxUsername;
	
   @FindBy(id = "password")
   WebElement txtboxPassword;
   
   @FindBy(xpath="//input[@id='login-button']")
   WebElement btnLogin;
   
   //Actions
   
   public void enterUsername(String username) {
	   txtboxUsername.clear();
	   txtboxUsername.sendKeys(username);
	   //System.out.println("aaaaaaaaaaaaaaa");
	   
   }
   
   public void enterPassword(String password) {
	   txtboxPassword.clear();
	   txtboxPassword.sendKeys(password);
   }
   
   public void clickLoginButton() {
	   
	  btnLogin.click();

   }
   
}
