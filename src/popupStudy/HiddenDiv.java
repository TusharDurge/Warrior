package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.flipkart.com/");  
		    Thread.sleep(2000);
		    
		   // driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    
		    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9011591929");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Tushar@09");
 	        Thread.sleep(2000);
	    
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		    
		    
		
		    
		    
		

	}

}
