package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");	
	    //https://chercher.tech/practice/frames-example-selenium-webdriver
	    
	    driver.switchTo().frame("iframe-name");
	    Thread.sleep(1000);
	    String text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class ')]")).getText();
	    
	    System.out.println("iframe text is "+text);
	    Thread.sleep(1000);
	    
	    driver.switchTo().defaultContent();
	    
	    String maintext = driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText();
	    System.out.println("main page text is "+maintext);
	    
	    

	}

}
