package dynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderdList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");  
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("q")).sendKeys("toyota");
	    Thread.sleep(1000);
	    
	    List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	    Thread.sleep(1000);
	    System.out.println("No of items in list are "+searchResults.size());
	    System.out.println("=======");
	    Thread.sleep(1000);
	    
	    for ( WebElement s:searchResults)
	    	
	    {
	    	System.out.println(s.getText());
	    }
	    System.out.println("=======");
	    
	    for (WebElement result:searchResults)
	    { 
	    	String expected = "toyota innova hycross";
	    	
	    	String actual = result.getText();
	    	
	    	if (expected.equals(actual))
	    	{
	    		System.out.println("clicked on "+result.getText());
	    		Thread.sleep(1000);
	    		
	    		result.click();
	    		break;
	    	}	
	    	}
	    	Thread.sleep(3000);
	    	
        driver.findElement(By.linkText("News")).click();
	       
	     
	      	    }

	}


