package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
	    
	    WebElement textbox = driver.findElement(By.id("show-textbox"));
	    
	    textbox.click();
	    Thread.sleep(1000);
	//   hide-textbox
	     WebElement input = driver.findElement(By.id("displayed-text"));
	     
	    if(input.isDisplayed())
	    {
	    	input.sendKeys("hello");
	    }
	   
	    else
	    {
	    	
	      input.sendKeys("bye");
	  
	    }

	}

}
