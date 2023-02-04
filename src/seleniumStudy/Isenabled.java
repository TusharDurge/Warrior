package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://en-gb.facebook.com/");  
		    
		    boolean password = driver.findElement(By.xpath("//input[@id='pass']")).isEnabled();
		    
		    System.out.println(password);
		    

	}

}
