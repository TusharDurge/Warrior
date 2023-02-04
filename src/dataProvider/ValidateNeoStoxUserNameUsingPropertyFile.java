package dataProvider;

import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import neoStoxBase.Base3;
import neoStoxPOMClasses.NeoStoxDashBoardPage1;
import neoStoxPOMClasses.NeoStoxHomePage;
import neoStoxPOMClasses.NeoStoxPasswordPage1;
import neoStoxPOMClasses.NeoStoxSignInPage1;
import neoStoxUtility.Utility2;

@Listeners(neoStoxTestClasses.Listener.class)
public class ValidateNeoStoxUserNameUsingPropertyFile extends Base3
{
    NeoStoxDashBoardPage1 dash;
	NeoStoxHomePage home;
	NeoStoxSignInPage1 signIn;
	NeoStoxPasswordPage1 pass;
	//String s= "TCID-2023";

	
  @BeforeMethod
  public void launchNeoStoxApp() throws IOException 
  {
	  launchBrowser();
	  home = new NeoStoxHomePage(driver);
	  signIn = new NeoStoxSignInPage1(driver);
	  pass = new NeoStoxPasswordPage1(driver);
	  dash = new NeoStoxDashBoardPage1(driver);
  }
  
  //Note: TestNG comes up with DataProvider to automate the process of providing test cases for execution. 
  //DataProvider helps with data-driven test cases that carry the same methods but can be run multiple times with different data sets. 
  //It also helps in providing complex parameters to the test methods.
  
  @Test(dataProvider = "loginDetailsforValidateUserName")
  public void validateUserName(String mobNum,String password,String userName) throws IOException, InterruptedException 
  {
	  home.clickOnSignInButton();
	  Utility2.implicitWait(1000, driver);
	  signIn.enterMobileNumber(Utility2.readDataFromPropertyFile("mobNumber"));
	  Thread.sleep(1000);
	  signIn.clickOnSignInButton();
	  
	  Utility2.implicitWait(1000, driver);
	  pass.enterPassword(Utility2.readDataFromPropertyFile("password"));
      pass.clickOnsubmitButton();
      
      Utility2.implicitWait(1000, driver);
      dash.handlePopUp(driver);
      
      Assert.assertEquals(dash.getActualUserName(), userName,"Actual and  Expected user Names are not matching TC is failed"); 
      dash.logOutFromNeoStox();
}
  
  @Test	(dataProvider = "loginDetailsForValidateAccountBalance")
  public void validateACBalance(String mobNumber,String password) throws IOException, InterruptedException
  {
	  home.clickOnSignInButton();
	  Utility2.implicitWait(1000, driver);
	  signIn.enterMobileNumber(Utility2.readDataFromPropertyFile("mobNumber"));
	  Thread.sleep(1000);
	  signIn.clickOnSignInButton();
	  
	  Utility2.implicitWait(1000, driver);
	  pass.enterPassword(Utility2.readDataFromPropertyFile("password"));
      pass.clickOnsubmitButton();
      
      Utility2.implicitWait(1000, driver);
      dash.handlePopUp(driver);
      
      Assert.assertNotNull(dash.getAcBalance(),"AC balance is null, TC is failed");
    		  dash.logOutFromNeoStox();
  }
  
  @AfterMethod
  public void closeNeoStoxApp() throws InterruptedException 
  {
	  driver.close();
	  Reporter.log("Closing application", true);
	  Thread.sleep(1000);
  }
 
  @DataProvider(name="loginDetailsforValidateUserName")
  public String[][] getLoginDetails1()
  {
  String userData[][]= {{"9011591929","9196","Hi Tushar Durge"},{"7769045652","5555","Hi Shweta Dhilpe"},{"8862071140","1234","Hi Dhiraj Singh"}};
  return userData;
  }
  
  @DataProvider(name="loginDetailsForValidateAccountBalance")
  public String[][] getLoginDetails2()
  {
  String userData[][]= 
 {{"9011591929","9196"},{"7769045652","5555"},{"8862071140","1234"}};
  return userData;
  }
  
  
  
}
