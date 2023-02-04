package cbTesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoTesting{
  @Test
  public void fireFoxTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");  
	    
  }	
}
