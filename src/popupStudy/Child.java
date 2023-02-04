package popupStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://skpatro.github.io/demo/links/");  
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		    Thread.sleep(1000);
		    
		    String id = driver.getWindowHandle();
		    System.out.println(id);
		    
		    Set<String> id2 = driver.getWindowHandles();
		    System.out.println(id2);
		    
		    Iterator<String> it = id2.iterator();
		    
		    String fs = it.next();
		    
		    String se = it.next();
		    
		   driver.switchTo().window(se);
		   
		   driver.manage().window().maximize();
		   
		  // driver.close();
		   
		   driver.findElement(By.id("the7-search")).sendKeys("Mock group 13");
		   Thread.sleep(1000);
		   
		   driver.switchTo().window(fs);
		   
		  
		
		   
		   
		   
		   
		    
		    
		    
		
		    
		   
		    

	}

}
