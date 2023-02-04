package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMClasses.NeoStoxDashBoardPage1;
import neoStoxPOMClasses.NeoStoxHomePage;
import neoStoxPOMClasses.NeoStoxPasswordPage1;
import neoStoxPOMClasses.NeoStoxSignInPage1;
//import neoStoxUtility.Utility;
import neoStoxUtility.Utility2;

public class ValidateNeoStoxUserName extends Base
{
    NeoStoxDashBoardPage1 dash;
	NeoStoxHomePage home;
	NeoStoxSignInPage1 signIn;
	NeoStoxPasswordPage1 pass;
	String s= "TCID-2023";

	
  @BeforeClass
  public void launchNeoStoxApp() 
  {
	  launchBrowser();
	  home = new NeoStoxHomePage(driver);
	  signIn = new NeoStoxSignInPage1(driver);
	  pass = new NeoStoxPasswordPage1(driver);
	  dash = new NeoStoxDashBoardPage1(driver);
  }
  
  @BeforeMethod
  public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  home.clickOnSignInButton();
	  Utility2.implicitWait(1000, driver);
	  signIn.enterMobileNumber(Utility2.readDataFromPropertyFile("mobNumber"));
	  Thread.sleep(1000);
	  signIn.clickOnSignInButton();
	  
	  Utility2.implicitWait(1000, driver);
	  pass.enterPassword(Utility2.readDataFromPropertyFile("password"));
      pass.clickOnsubmitButton();
      
      Utility2.implicitWait(3000, driver);
      dash.handlePopUp(driver);
  }
  
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	//Assert.fail();
   Assert.assertEquals(dash.getActualUserName(), Utility2.readDataFromPropertyFile("userName"),"Actual and Expected user Names are not matching Tc is failed");
   Utility2.takeScreenshot(driver,Utility2.readDataFromPropertyFile("TCID1"));
  }
  
  @Test
  public void validateACBalance() throws IOException
  {
  Assert.assertNotNull(dash.getAcBalance(),"AC Balance is null TC failed");
  Utility2.takeScreenshot(driver, Utility2.readDataFromPropertyFile("TCID2"));
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException 
  {
  dash.logOutFromNeoStox();
  }
  @AfterClass
  public void closeNeoStoxApp() throws InterruptedException
  {
  driver.close();
  Reporter.log("Closing application", true);
  Thread.sleep(1000);
  }
  
  
}
