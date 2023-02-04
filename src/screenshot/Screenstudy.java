package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenstudy {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.swiggy.com/");  
		    Thread.sleep(1000);
	
		    String multi = RandomString.make(3);
		    
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        File destination = new File("C:\\Users\\tushar\\Desktop\\velocity\\ss\\Tushar"+multi+".jpg");
	        
	        FileHandler.copy(source, destination);
	        
	        
	        
	        
	       
		    
		    
	

	}

}
