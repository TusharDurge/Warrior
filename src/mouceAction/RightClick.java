package mouceAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{ 

		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");  
		    Thread.sleep(1000);
		
		  //1.Create an Object of ACtions class and pass Webdriver object as a argument
		    
		  Actions act = new Actions(driver);
		  
		 WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		 
		//3. by using one of the ACtions class methods take required action.
        
		// act.moveToElement(rightClick).contextClick().build().perform();
		 
		 act.contextClick(rightClick).perform();
		  
}

}
