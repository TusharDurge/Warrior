package TestNGStudy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStoxSample2 {
  @Test
  public void neoStoxLaunch() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://neostox.com/");
	    Thread.sleep(1000);
	    
	    System.out.println("hi this is printing statement");
	    
	    Reporter.log("hi this is reporter");
	    
	    Reporter.log("hi this is reporter", true);
	    
  }
  
  @Test
  public void upstoxLaunch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://login.upstox.com/");
	    Thread.sleep(1000);
	    
	    
	    System.out.println("hi this is printing statement");
	    
	    Reporter.log("hi this is reporter");
	    
	    Reporter.log("hi this is reporter", true);
  }
  
  
  
  
}
