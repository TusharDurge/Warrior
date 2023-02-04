package mouceAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://www.uitestpractice.com/Students/Actions");  
		    Thread.sleep(1000);	
		    
		    Actions act = new Actions (driver);
            WebElement doubleclick = driver.findElement(By.xpath("//button[@name='dblClick']"));

            //act.moveToElement(doubleclick).doubleClick().build().perform();
            
            act.doubleClick(doubleclick).perform();
            
            //handling alert popup
            
            //switch focus to alert
            
            Alert alt = driver.switchTo().alert();
            
            //use one the alert method
           Thread.sleep(1000);
           
            alt.accept();
            //click on ok button
            
          //  alt.dismiss();
          
            
            
            
            
            
            
           }

}
