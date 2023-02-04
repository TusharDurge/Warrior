package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_andUrl {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    
		    Thread.sleep(2000);
		    
		    String title= driver.getTitle();
		    System.out.println("title of web page is "+title);

		    String url= driver.getCurrentUrl();
		    System.out.println("current url is "+url);
	
	}

}
