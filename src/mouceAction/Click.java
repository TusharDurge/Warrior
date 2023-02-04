package mouceAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException 
    {

		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");  
		    Thread.sleep(1000);	
		    
		    WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		    //by using web element method
		    //login.click(); 
		    
		    //using action class
		  //1.create an object of Actions class and pass WebDriver object as parameter
		    
		    Actions act = new Actions(driver);
		    
		    act.click(login).perform();
		    
		    
		    
		    

		    
		    

	}

}
