package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");  
	    Thread.sleep(1000);
      
	     List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
	    
	     for(WebElement out:table)
	     {
	    	 System.out.print(out.getText()+"    ");
	     }
	     
	     
	}

}
