package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");  
		    Thread.sleep(2000);
		    
		   WebElement check = driver.findElement(By.xpath("//button[@type='submit']"));
		   System.out.println(check.isEnabled());
		   System.out.println("=============");
		   Thread.sleep(2000);
		    
		    WebElement mob = driver.findElement(By.name("mobileNumber"));
		    Thread.sleep(2000);
		    mob.click();
		    Thread.sleep(2000);
		    mob.sendKeys("9011591929");
		    Thread.sleep(2000);
		    System.out.println(check.isEnabled());
		    System.out.println("=============");
		    
		    if(check.isEnabled())
		    {
		    	System.out.println("otp is enable");
		    }
		    else
		    {
		    	System.out.println("otp button is not enable");
		    }
		    
		
		

	}

}
