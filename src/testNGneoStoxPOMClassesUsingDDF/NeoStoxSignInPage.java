package testNGneoStoxPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{
  @FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement mobNoField;
  @FindBy(id = "lnk_signup1") private WebElement signInButton;

  public NeoStoxSignInPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void enterMobileNumber(String mobNum)
  {
	  mobNoField.sendKeys(mobNum);
  }
  
  public void clickOnSignInButton()
  {
	  signInButton.click();
  }
}
