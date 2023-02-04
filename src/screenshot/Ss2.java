package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Ss2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	   System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.w3schools.com/");
	 
	 Thread.sleep(1000);
	 
	     File random = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	          String add = RandomString.make(2);
	     
	     File dest = new File ("C:\\Users\\tushar\\Desktop\\velocity\\ss\\tushar09"+add+".jpg");
	     
	     FileHandler.copy(random, dest);
	     
	     

	}

}
