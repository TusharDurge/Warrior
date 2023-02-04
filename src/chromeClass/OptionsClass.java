package chromeClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsClass {
public static void main(String[] args) throws InterruptedException
{  
	
	 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 ChromeOptions chr = new ChromeOptions();
//	 
//	 chr.addArguments("---start-maximized");
//	 chr.addArguments("--headless");
//	 chr.addArguments("---Incognito");
//	 chr.addArguments("disable-infobars");
	 
	 ArrayList<String> ar = new ArrayList<>();
	
	 ar.add("start-maximized");
	// ar.add("--version");
	 ar.add("Incognito");
	 ar.add("disable-infobars");
	 chr.addArguments(ar);
	 
	    WebDriver driver = new ChromeDriver(chr);
	    driver.get("https://demo.guru99.com/test/delete_customer.php");  
	    Thread.sleep(1000);
	    
	    
	    
	    
	 
	    
	    

}
}
