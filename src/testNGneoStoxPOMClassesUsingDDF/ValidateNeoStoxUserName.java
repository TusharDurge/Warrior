package testNGneoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateNeoStoxUserName 
{   WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashBoardPage dash;
	Sheet mySheet;
	File myFile;
	
 @BeforeClass
 public void launchNeostoxApp() throws EncryptedDocumentException, IOException
 {
	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
     
	   //created object of chromedriver
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://neostox.com/");
	       Reporter.log("Launching launchNeostoxApp", true);
	       
	       home= new NeoStoxHomePage(driver);
	       signIn= new NeoStoxSignInPage(driver);
	       pwd= new NeoStoxPasswordPage(driver);
	       dash= new NeoStoxDashBoardPage(driver);
	       
	       myFile = new File ("C:\\Users\\tushar\\Desktop\\velocity\\TUSHAR.xlsx");
		    
		   mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
  }
		   @BeforeMethod
		   public void loginToNeoStox() throws InterruptedException 
		   {
			   home.clickOnSignInButton();
			   Reporter.log("Clicking on sign in Button", true);
			//   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
               Thread.sleep(1000);
			   signIn.enterMobileNumber(mySheet.getRow(0).getCell(0).getStringCellValue());
			   Reporter.log("Entering mobile number", true);
			   Thread.sleep(1000);
			   signIn.clickOnSignInButton();
			   Reporter.log("Clicking on sign in Button", true);
			   
			  // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			   Thread.sleep(2000);
			   pwd.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
			   Reporter.log("Entering password ", true);
			  
			   Thread.sleep(2000);
			   pwd.clickOnsubmitButton();
			   Reporter.log("Clicking on submit Button", true);
			   Thread.sleep(2000);
			   //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			   dash.handlePopUp();
			   Reporter.log("Handeling popup", true);
			   Thread.sleep(2000);
			   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			 //Assert.fail();

		 }
 
		   @Test	
		   public void validateUserName()
		   {
			   String expectedUserName = mySheet.getRow(0).getCell(2).getStringCellValue();
			   String actualUserName = dash.getActualUserName();
			   
			   Reporter.log("Validating UserName ", true);
			   Assert.assertEquals(actualUserName, expectedUserName,"actual and expected UserNames are not Matching TC is failed");

		   }
		   
		   @AfterMethod
		   public void logOutFromNeoStox() throws InterruptedException
		   {
		   Thread.sleep(1000);
		   dash.logOutFromNeoStox();
		   Reporter.log("logging out from neoStox", true);
		   Thread.sleep(1000);
		   }
		   @AfterClass
		   public void closeBrowser()
		   {
		   driver.close();
		   Reporter.log("Closing browser", true);
		   }  
		   
		   
		   
		 }

