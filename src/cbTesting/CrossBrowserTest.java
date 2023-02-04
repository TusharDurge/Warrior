package cbTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserTest {
	@Parameters("browserName")
	
  @Test
  public void cbTesting(String bName) 
  {
	  WebDriver driver = null;
	  
	  if (bName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
      }
	  
	  else if (bName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  }
	  
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");  
  }
}
