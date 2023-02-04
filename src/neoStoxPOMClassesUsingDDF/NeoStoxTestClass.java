package neoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	      
		   //created object of chromedriver
		       WebDriver driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.get("https://neostox.com/");
		       
			    File myFile = new File ("C:\\Users\\tushar\\Desktop\\velocity\\TUSHAR.xlsx");
			    
				   Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
				   String mobNum = mySheet.getRow(0).getCell(0).getStringCellValue();
				   String pw = mySheet.getRow(0).getCell(1).getStringCellValue();
				   String expUser = mySheet.getRow(0).getCell(2).getStringCellValue();
				   
				   //create an object of Home page
				   NeoStoxHomePage home = new  NeoStoxHomePage(driver);
				   home.clickOnSignInButton();
				   
				 //signIn Page
				   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				   NeoStoxSignInPage signIn = new NeoStoxSignInPage(driver);
				   signIn.enterMobileNumber(mobNum);
				   signIn.clickOnSignInButton();
				   
				 //password page
				   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				   NeoStoxPasswordPage password = new NeoStoxPasswordPage(driver);
				   password.enterPassword(pw);
				   password.clickOnsubmitButton();
				   
				 //dashBoard Page
				   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				   NeoStoxDashBoardPage dash = new NeoStoxDashBoardPage(driver);
				   dash.handlePopUp();
				   dash.validateUserName(expUser);
				   dash.logOutFromNeoStox();
				   
				   
				   driver.close();
				   

	}

}
