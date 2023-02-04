package neoStoxBase;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


import neoStoxUtility.Utility2;




public class Base3 
{

	protected static WebDriver driver;
	public void launchBrowser() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		   // driver.get("https://neostox.com/");
		    driver.get(Utility2.readDataFromPropertyFile("url"));
		    Utility2.implicitWait(1000,driver);
		    Reporter.log("launching browser",true);
	}
	
}
	