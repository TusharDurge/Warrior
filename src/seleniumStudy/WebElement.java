package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException
	{
		
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.swiggy.com/");     
	    
	    Thread.sleep(2000);
        
	    driver.findElement(By.xpath("//a[@class='x4bK8']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9011591929");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='mobile']")).clear();
	    Thread.sleep(2000);
	
	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8956090501");
	}

}
