package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


import org.apache.logging.log4j.LogManager; //LogManage
import org.apache.logging.log4j.Logger; // Logger
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.AllProductsDisplayPage;
import Pages.LoginPage;
import Pages.OnlyBackPackDisplayPage;
import Utilities.ReadConfigFileData;

public class BaseTest {
	
public WebDriver driver;
	
	public ReadConfigFileData rdconfig ;
	public SoftAssert sa;
	public AllProductsDisplayPage ap;
	 public OnlyBackPackDisplayPage obackpack;
	 public Logger logger;
	
	@BeforeClass
	public void setUp() throws IOException {
		
		// Set up Chrome options to disable password manager
     /*  Map<String, Object> prefs = new HashMap<>();
        prefs.put("safebrowsing.enabled", false);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        
        final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", prefs);*/
		
		logger = LogManager.getLogger(this.getClass());
		
		logger.info("Test Execution Started");
		driver = new EdgeDriver();
		logger.info("Driver Created");
		driver.manage().deleteAllCookies();
		rdconfig = new ReadConfigFileData();
		logger.info("Config file read");
		driver.get(rdconfig.readAppUrl());
		logger.info("App url fetched from config file");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	
	
	public void loginToAccount() throws IOException, InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
	
		lp.enterUsername(rdconfig.readUsername());
		lp.enterPassword(rdconfig.readPassword());
		logger.info("Login data entered");
		lp.clickLoginButton();
		logger.info("Login button clicked");
		System.out.println("Login Success");
		logger.info("LOGIN SUCCESS");
		
		
	}
	
	
	
	public void additionOfItems() throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	   ap = new AllProductsDisplayPage(driver);
	   ap.selectBackpackItem();
	   
	  obackpack = new OnlyBackPackDisplayPage(driver);
	   obackpack.clickBackpackAddbtn();
	   Thread.sleep(30);
	   System.out.println("Addition of item success");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		//Thread.sleep(30);
		driver.quit();
		
	}

}
