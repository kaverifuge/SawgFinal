package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrawerOption extends BasePage{

	
	public DrawerOption(WebDriver driver) {   
	    super(driver);
	}
	
	
	
	@FindBy(css="button#react-burger-menu-btn")
	WebElement btndrawer;
	
	@FindBy(css="a#logout_sidebar_link")
	WebElement btnLogout;
	
	public void clickDrawerOption() {
		
		btndrawer.click();
	}
	
	public void clickLogot() {
		btnLogout.click();
	}
	
}
