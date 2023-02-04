package velocityAssignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base3;
import neoStoxPOMClasses.NeoStoxHomePage;
import neoStoxPOMClasses.NeoStoxSignInPage1;
import neoStoxUtility.Utility2;

public class ValidateErrorMessage extends Base3
{
	NeoStoxHomePage home;
	NeoStoxSignInPage1 signIn;
	


@BeforeClass
public void launchNeoStoxApp() throws IOException 
{
	  launchBrowser();
	  home = new NeoStoxHomePage(driver);
	  signIn = new NeoStoxSignInPage1(driver);
	 
	 
}
@BeforeMethod
public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
{
	  home.clickOnSignInButton();
	  Utility2.implicitWait(1000, driver);
	  signIn.enterMobileNumber(Utility2.readDataFromPropertyFile("mobNumber"));
	  Thread.sleep(1000);
	  signIn.clickOnSignInButton();
}
@Test
public void validateErrorMessage() throws IOException, InterruptedException
{     
	 Thread.sleep(1000);
	 Assert.assertEquals(signIn.getActualUserName(),Utility2.readDataFromPropertyFile("userName"),"Actual and Expected user Names are not matching Tc is failed");
    Utility2.takeScreenshot(driver,Utility2.readDataFromPropertyFile("TCID1"));
}
}

