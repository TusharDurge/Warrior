package neoStoxPOMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//import neoStoxUtility.Utility2;

public class NeoStoxPasswordPage1 
{
	@FindBy(id = "txt_accesspin") private WebElement passwordField;
	@FindBy(id = "lnk_submitaccesspin") private WebElement submitButton;
	
	public NeoStoxPasswordPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterPassword(String password) throws IOException 
	{
		passwordField.sendKeys((password));
		Reporter.log("entering password", true);
	}
	
	public void clickOnsubmitButton() throws InterruptedException
	{
		Thread.sleep(1000);
		submitButton.click();
		Reporter.log("clicking on submit button", true);
	}

}
