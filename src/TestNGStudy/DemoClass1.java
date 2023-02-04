package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoClass1 {
  @Test
  public void neostox() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://neostox.com/");
		   Thread.sleep(1000);
  }
}
