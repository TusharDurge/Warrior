package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookWebElement {

	public static void main(String[] args) throws InterruptedException 
	
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");  
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		    
		    Thread.sleep(5000);
//		    
//		   WebElement day = driver.findElement(By.id("day"));
//		   Thread.sleep(3000);
//		    
//		    Select s = new Select(day);
//		    
//		    s.selectByVisibleText("2");
//		    
//		    Thread.sleep(1000);
//		    
//		    WebElement yr = driver.findElement(By.id("year"));
//			   Thread.sleep(3000);
//		    
//		    Select s1 = new Select(yr);
//		    s1.selectByValue("2021");
//		    Thread.sleep(1000);
		    
		    WebElement gender = driver.findElement(By.name("sex"));
		    System.out.println(gender.isSelected());
		    
		    
		    
		    
		    
		 

//		    
//		    WebElement fn = driver.findElement(By.name("firstname"));
//		    fn.click();
//		    Thread.sleep(2000);
//		    fn.sendKeys("Tushar");
//		    Thread.sleep(2000);
//		    
//		    WebElement ln = driver.findElement(By.name("lastname"));
//		    ln.click();
//		    Thread.sleep(2000);
//		    ln.sendKeys("Durge");
//		    Thread.sleep(2000);
		    
//		    WebElement date = driver.findElement(By.name("birthday_day"));
//		    date.click();
//		    Thread.sleep(2000);
//		    
//		    Select s = new Select(date);
//		    Thread.sleep(2000);
//		    
//		    s.selectByValue("2");
		    
		    
		    
		    
		    
		    
		    
		    
		    
		

	}

}
