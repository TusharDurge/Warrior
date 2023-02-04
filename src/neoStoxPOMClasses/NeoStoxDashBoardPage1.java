package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxDashBoardPage1
{
   @FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUpokButton;
  // @FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popUpcloseButton;
   @FindBy(id = "lbl_username") private WebElement userName;
   @FindBy(id = "lnk_logout") private WebElement logOutButton;
   @FindBy(id = "lbl_curbalancetop") private WebElement acBalance;

   
   public NeoStoxDashBoardPage1(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void handlePopUp(WebDriver driver) throws InterruptedException
   {
	   Thread.sleep(5000);
	   if(popUpokButton.isDisplayed())
	   {
		   Utility.scrollIntoView(driver, popUpokButton);
		   popUpokButton.click();
		   Reporter.log("clicking on PopUp ok button", true);
	   }
	   else
	   {
		   Reporter.log("There is no pop-up", true);
	   }
	   //Thread.sleep(1000);
	  // Utility.scrollIntoView(driver, popUpcloseButton);
	  // popUpcloseButton.click();
	  // Reporter.log("clocking on PopUp close button", true);
   }
   
   public void logOutFromNeoStox() throws InterruptedException
   {
	   userName.click();
	   Thread.sleep(1000);
	   logOutButton.click();
	   Reporter.log("Logging out from neoStox",true);
	   Thread.sleep(1000);
   }
   
   public String getActualUserName()
   {
	String actualUserName = userName.getText();
	Reporter.log("getting actual user name", true);
	Reporter.log("Actual user name is--->"+actualUserName, true);
	return actualUserName;
	   
   }
   public String getAcBalance()
   {
   String balance = acBalance.getText();
   Reporter.log("getting AC Balance", true);
   Reporter.log("Account balance is "+balance, true);
   return balance;
   }
   
 }
