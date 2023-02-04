package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotstar {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    
	    
	    driver.manage().window().maximize();
	    
	    //driver.get("https://www.hotstar.com/in");
	    //Thread.sleep(1000);
	    
	    //driver.findElement(By.xpath("//div[@class='signIn']")).click();
	    
	    
	    driver.get("https://www.swiggy.com/");
	    //Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//div[@class='signIn']")).click();
	    
	   

	}

}
