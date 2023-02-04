package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ss {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");	
	    
	    Thread.sleep(1000);
	    
	    
         File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     System.out.println(screen);
	     
	     File dest = new File("C:\\Users\\tushar\\Desktop\\velocity\\ss\\Tushar.jpg");
	     
	     FileHandler.copy(screen, dest);
	     
	     
	    
	    
	    
	    
	    
	    
	
	     
	     
	       
	    
	}

}
