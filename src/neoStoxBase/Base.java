package neoStoxBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import neoStoxUtility.Utility;




public class Base 
{

	protected WebDriver driver;
	public void launchBrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://neostox.com/");
		    Utility.implicitWait(1000,driver);
		    
		    System.out.println("========");
		    //sajcjkcndklcmaslxml
	}
	
}
	