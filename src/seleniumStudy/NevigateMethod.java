package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateMethod {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    
		    Thread.sleep(2000);
		    
		    driver.get("https://www.swiggy.com/");
		    
		    Thread.sleep(2000);
		    
		    driver.navigate().back();
		    Thread.sleep(2000);
		    
		    driver.navigate().forward();
		    Thread.sleep(2000);
		    
		    driver.navigate().refresh();
		    Thread.sleep(2000);
		    
		    driver.close();
		    
		    
}

}
