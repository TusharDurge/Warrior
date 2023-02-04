package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//hii all...
public class NeoStoxDashBoardPage
{
   @FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUpokButton;
  // @FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popUpcloseButton;
   @FindBy(id = "lbl_username") private WebElement userName;
   @FindBy(id = "lnk_logout") private WebElement logOutButton;
   
   public NeoStoxDashBoardPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void handlePopUp() throws InterruptedException
   {
	   Thread.sleep(1000);
	   popUpokButton.click();
//	   Thread.sleep(1000);
//	   popUpcloseButton.click();
   }
   
   public void validateUserName() 
   {
	 String expectedUserName = "Hi Tushar Durge";
	 String actualUserName = userName.getText();
	 
	 if(expectedUserName.equals(actualUserName))
	 {
		 System.out.println("tc is pass. expected and actual user name is matching");
	 }
	 else
	 {
		 System.out.println("tc is failed, expected and actual user name is not matching");
	 }
   }
   
   public void logOutFromNeoStox() throws InterruptedException
   {
	   userName.click();
	   Thread.sleep(1000);
	   logOutButton.click();
	   
   }
   
}
