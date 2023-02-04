package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonValidation {
  @Test
  public void validateRadioButtonStatus() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");  
	    Thread.sleep(3000);
	    
	   WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true)", radio1);
	   
	   radio1.click();
	   
	   Assert.assertTrue(radio1.isSelected(),"Radio1 is not selected tc is failed");
  }
}
