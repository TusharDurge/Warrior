package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import practiceUtility.PracticeUtility;


public class PracticeBase
{
	protected static WebDriver driver;
	
	public void launchBrowser() throws IOException 
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(PracticeUtility.readDataFromPropertyFile("url"));
	    PracticeUtility.implicitWait(1000, driver);
	    Reporter.log("launching browser",true);
	}

}
