package neoStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNeoStoxUserNameUsingExcel 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{     
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    File myFile = new File ("C:\\Users\\tushar\\Desktop\\velocity\\TUSHAR.xlsx");
		    
		   Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		   String userId = mySheet.getRow(0).getCell(0).getStringCellValue();
		   String pw = mySheet.getRow(0).getCell(1).getStringCellValue();
		   String expUser = mySheet.getRow(0).getCell(2).getStringCellValue();
		 //launch neoStox url
		   driver.get("https://neostox.com/");
		   Thread.sleep(1000);
		   
		   //click on SignInButton
		   
		   driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(userId);
		   Thread.sleep(1000);
		 //2. clicking on signIn Button
		   driver.findElement(By.id("lnk_signup1")).click();
		   Thread.sleep(5000);
		   //working on password Page
		   //1.Entering password
		   driver.findElement(By.id("txt_accesspin")).sendKeys(pw);
		   
		 //2.clicking on SubmitButton
		   driver.findElement(By.id("lnk_submitaccesspin")).click();
		   Thread.sleep(6000);
		   //working on home Page
		   //popup
		   driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
	
		   driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		   Thread.sleep(1000);
		   
		   String actualText = driver.findElement(By.xpath("(//span[text()='Hi Tushar Durge'])[1]")).getText();
		   
		   if (actualText.equals(expUser))
		   {
			   System.out.println("Test case is passed");
		   }
		   else
		   {
			   System.out.println("Check user name. tc is failed");
			   
		   }
		   
		 //logging out
		   Thread.sleep(1000);
		   driver.findElement(By.id("lbl_username")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//span[text()='Logout']")).click();
		   driver.close();//closing browse
		   
		   

		   
		   
		   
	}

}
