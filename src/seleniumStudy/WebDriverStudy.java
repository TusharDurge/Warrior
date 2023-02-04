package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    
		    Thread.sleep(2000);
		    
		 driver.get("https://instagram.com/");
		   
		    
		    Thread.sleep(2000);
		    
		    driver.close();
		    //driver.quit();
		    
		   // driver.manage().window().maximize();
		    
		    //Thread.sleep(2000);
		    
		   // driver.manage().window().minimize();
		    
	 
		    

	}

}
