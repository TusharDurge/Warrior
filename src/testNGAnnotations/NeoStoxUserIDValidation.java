package testNGAnnotations;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeoStoxUserIDValidation {
	
  @Test (groups = "1")
  public void validateUserName() 
  {
	  Reporter.log("username is valid.tc is pass", true);
  }
  
  @AfterMethod
  public void logout()
  {
	 Reporter.log("logout account", true);
  }
  
  @BeforeClass (groups = "1")
  private void launchBrowser() 
  {
	  Reporter.log("browser is open", true);
  }
  
  @BeforeMethod (groups = "1")
  public void login()
  {
	  Reporter.log("login account", true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser is close", true);
  }
  {
	  
  }
  
  
}
