package testNgFbPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbProfilePage 
{
   @FindBy(xpath = "//span[text()='Er Tushar Durge']") private WebElement accName;
   
   public FbProfilePage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void openProfile()
   {
	  accName.click();
   }
}
