package testNGkeyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyWordInvocationCount  {
	
	@BeforeMethod
	public void before()
	{
		Reporter.log("before method running", true);
	}
  @Test(invocationCount = 3)
  public void TC1() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://neostox.com/");
		   Thread.sleep(1000);
	  Reporter.log("TC1 running", true);
  }
}
