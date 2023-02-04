package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utube {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.youtube.com/c/IndusMoonMedia/videos");
	    
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("//input[@id='search']")).click();
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hechi Yel Deva Naka - Lyrical | Fatteshikast | Chinmay Mandlekar, Mrinal Kulkarni | Avadhoot Gandhi");
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	    Thread.sleep(1500);
	    
	    driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Hechi Yel Deva Naka - Lyrical | Fatteshikast | muvie in song by Umesh Bedse 4 months ago 4 minutes, 34 seconds 35 views']")).click();
	    Thread.sleep(1500);
	    
	   // driver.close();
	}

}
