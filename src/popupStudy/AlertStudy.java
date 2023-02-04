package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertStudy {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demo.guru99.com/test/delete_customer.php");  
		    Thread.sleep(2000);
		    
		    driver.findElement(By.name("cusid")).sendKeys("Tushar123");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.name("submit")).click();
		    Thread.sleep(2000);
		    
		    Alert alt = driver.switchTo().alert();
		    
		    //alt.accept();
		    System.out.println(alt.getText());
		    alt.dismiss();
		    
		    
		    
		    
	}

}
