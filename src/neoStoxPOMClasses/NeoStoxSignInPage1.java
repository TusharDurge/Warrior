package neoStoxPOMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//import neoStoxUtility.Utility2;

public class NeoStoxSignInPage1 
{
  @FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement mobNoField;
  @FindBy(id = "lnk_signup1") private WebElement signInButton;
 // @FindBy(id = "MainContent_signinsignup_reqfld1") private WebElement userName;
  @FindBy(xpath = "//span[text()='Invalid Mobile Number']") private WebElement userName;
  public NeoStoxSignInPage1(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void enterMobileNumber(String mobNumber) throws IOException
  {
	  mobNoField.sendKeys((mobNumber));
	  Reporter.log("Entering mobile number", true);
  }
  
  public void clickOnSignInButton()
  {
	  signInButton.click();
	  Reporter.log("Clicking on sign in button", true);
  }
  public String getActualUserName()
  {
	String actualUserName = userName.getText();
	Reporter.log("getting actual user name", true);
	Reporter.log("Actual user name is--->"+actualUserName, true);
	return actualUserName;
  }
}
