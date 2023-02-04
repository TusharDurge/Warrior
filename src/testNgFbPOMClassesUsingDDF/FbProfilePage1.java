package testNgFbPOMClassesUsingDDF;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FbProfilePage1 
{
   @FindBy(xpath = "(//span[text()='Like'])[3]") private WebElement likeButton;
   
   public FbProfilePage1(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Reporter.log("scrolling into view to"+element.getText(),true);
	}
   
   public void photoLike()
   {
	  likeButton.click();
   }

  
}
