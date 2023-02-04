package testNGradioButtonValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void validateRadioButtonStatus() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");  
	    Thread.sleep(3000);
	    
	   WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	   
//	   if (radio1.isSelected())
//	   {
//		   Reporter.log("radio1 is selected TC is passed", true);
//	   }
//	   else
//	   {
//		   Reporter.log("radio1 is not selected TC is failed", true);
//	   }
	   
	   Assert.assertTrue(radio1.isSelected(), "Radio1 is not selected TC is failed ");
  }
}
