package testNgFbPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage 
{
   @FindBy(id = "email") private WebElement username;
   @FindBy(id = "pass") private WebElement password;
   @FindBy(xpath = "//button[@type='submit']") private WebElement login;
   
   public FbLoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void enterUsername(String userID)
   {
	   username.sendKeys(userID);
   }
   
   public void enterPassword(String Pass)
   {
	   password.sendKeys(Pass);
   }
   
   public void login()
   {
	   login.click();
   }
}
