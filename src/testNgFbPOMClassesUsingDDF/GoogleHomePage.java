package testNgFbPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage 
{
	@FindBy(id = "input") private WebElement searchFild;
	@FindBy(xpath = "(//input[@type='submit'])[3]") private WebElement submit;
	
	public GoogleHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enterfbname(String name) 
	{
	  	searchFild.sendKeys(name);
	}
	
    public void submitname()
    {
    	submit.click();
    }
}
