package testNgFbPOMClassesUsingDDF;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage1 
{   @FindBy(xpath = "//h3[text()='Facebook - log in or sign up']") private WebElement link;

	public GoogleHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openlink() 
	{
		link.click();
	}
}
