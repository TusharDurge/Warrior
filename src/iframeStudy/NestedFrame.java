package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
	    
	   Thread.sleep(1000);
	   
	   driver.switchTo().frame("frame1");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.tagName("input")).sendKeys("hii");
	   Thread.sleep(1000);
	   
	   driver.switchTo().frame("frame3");
	   driver.findElement(By.id("a")).click();
	   
	   driver.switchTo().defaultContent();
	   String maintext = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	   
	   System.out.println("main text is "+maintext);
	   
	   driver.switchTo().frame("frame2");
	   WebElement animal = driver.findElement(By.id("animals"));
	   
	   Select s = new Select(animal);
	   Thread.sleep(1000);
	   
	   s.selectByValue("babycat");
	   Thread.sleep(1000);
	   s.selectByVisibleText("Avatar");
	   Thread.sleep(1000);
	   s.selectByIndex(1);
	   Thread.sleep(1000);
	   
	   driver.switchTo().defaultContent();
      String maintext2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	   
	   System.out.println("main text is "+maintext2);
	 
	   

	   
	   
	   
	   
	   
	   
	   
	   
	    

	}

}
