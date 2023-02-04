package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException 
	{

	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://en-gb.facebook.com/");  
	    
//	    driver.findElement(By.id("email")).sendKeys("9011591929");
//	    
//	    Thread.sleep(1000);
//	    
//	    
//	    driver.findElement(By.id("email")).clear();
//	    
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.id("email")).sendKeys("tushar.durge2013@gmail.com");
//	    
	    WebElement un = driver.findElement(By.id("email"));
	    
	    un.sendKeys("Tushar");
	    Thread.sleep(2000);
	    un.clear();
	    Thread.sleep(1000);
	    un.sendKeys("9011591929");
	    
	    String text = driver.findElement(By.xpath("//button[@type='submit']")).getText();
	    
	    System.out.println("my text is "+text);
	    
	 
	    
	    

	    
	    
	    

	}

}
