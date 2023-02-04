package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");  
	    Thread.sleep(1000);
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    for(WebElement l:links)
	    {
  	
	    	System.out.println(l.getText());
	    }
    
	    System.out.println(links.size());

	}
	

	

}
