package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NesterdIframeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");  
		    Thread.sleep(2000);
		    
		    driver.switchTo().frame("frame1");
		    
		     WebElement a = driver.findElement(By.xpath("//input"));
		     a.click();
		     Thread.sleep(1000);
		     a.sendKeys("abc123");
		    
		    Thread.sleep(1000);
		    
		    driver.switchTo().frame("frame3");
		    
		    WebElement b = driver.findElement(By.id("a"));

		    Thread.sleep(1000);
		    b.click();

		    Thread.sleep(1000);
		 System.out.println(b.isSelected());
		 
		 driver.switchTo().parentFrame();
		 a.clear();
		 Thread.sleep(1000);
		 a.sendKeys("Tushar");
		 Thread.sleep(1000);
		 
	     driver.switchTo().parentFrame();
	     WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]"));
	     
	     System.out.println("my text is "+text.getText());
	     
	     driver.switchTo().frame("frame2");
	     
	     WebElement ani = driver.findElement(By.id("animals"));
	     
	     Select s = new Select(ani);
	     
	     s.selectByValue("big baby cat");
	     Thread.sleep(1000);
	     
	     
	     
	     

		    
		    
		    
		    
		    

	}

}
