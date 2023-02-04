package keyBoardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");  
	    Thread.sleep(1000);	
	    
	   WebElement button = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
	   
	   Actions act = new Actions(driver);
	   
	   act.click(button).perform();
	   Thread.sleep(1000);	
	   
	   WebElement day = driver.findElement(By.id("day"));
	   Thread.sleep(1000);	

	   for(int i=1; i<=9;i++)
	   {
		   act.sendKeys(day,Keys.ARROW_DOWN).perform();
		   Thread.sleep(500);
	   }
	   
	   act.sendKeys(day,Keys.ENTER).perform();
	   
	   WebElement name = driver.findElement(By.name("firstname"));
	   act.sendKeys(name,Keys.ENTER).perform();
	   Thread.sleep(1000);	
	  //act.sendKeys(name,"Tushar").perform();
      
	   act.keyDown(name,Keys.SHIFT).sendKeys("T").keyUp(Keys.SHIFT).sendKeys("ushar").build().perform();
	   
	   
	}

}
