package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		   // driver.manage().window().maximize();
		    driver.get("https://www.google.co.in/");  
		    Thread.sleep(1000);
		    
		  //how to get default size of browser?
		    Dimension defaultSize = driver.manage().window().getSize();
		    System.out.println("defaultSize is "+defaultSize);
		    
		  //how to set size?
		  //1.create object dimension class and pass values of width and height
		    
		    Dimension d = new Dimension(555, 400);
		    Thread.sleep(1000);
		    
		  //  driver.manage().window().setSize(d);
		    
		   Dimension newSize = driver.manage().window().getSize();
		   
		   System.out.println("new size is "+newSize);

	}

}
