package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(1000);
		    
		    String ActualText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]")).getText();
		    
		    String expectedText="Facebook helps you connect and share with the people in your life.";

            System.out.println("actual text is "+ActualText);
            
            if (ActualText.equals(expectedText))
            {
            	System.out.println("Text is correct");
            	
            }
            else
            {
            System.out.println("Text is incorrect");	
            }
            
	}

}
