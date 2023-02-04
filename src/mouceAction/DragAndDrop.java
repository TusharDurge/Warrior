package mouceAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://www.uitestpractice.com/Students/Actions");  
		    Thread.sleep(1000);
		    
		  Actions act = new Actions(driver);
		  
		  WebElement source = driver.findElement(By.id("draggable"));
		  Thread.sleep(1000);
		
	      WebElement desti = driver.findElement(By.id("droppable"));
	      
	    //  act.dragAndDrop(source, desti).perform();
	      
	      act.clickAndHold(source).moveToElement(desti).release().build().perform();
	   
	   
		

	}

}
