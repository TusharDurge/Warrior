package testNgFbPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://neostox.com/");
	       
	   File myFile = new File ("C:\\Users\\tushar\\Desktop\\chetan\\TUSHAR.xlsx");
	   
	   Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	   String name = mySheet.getRow(0).getCell(0).getStringCellValue();
	   String username = mySheet.getRow(0).getCell(1).getStringCellValue();
	   String password = mySheet.getRow(0).getCell(2).getStringCellValue();
	   
	   //open google
	   GoogleHomePage home = new GoogleHomePage(driver);
	   home.Enterfbname(name);
	   
	   //click link
	   GoogleHomePage1 home1 = new GoogleHomePage1(driver);
	   home1.openlink();
	   
	   //login page
	   FbLoginPage login = new FbLoginPage(driver);
	   login.enterUsername(username);
	   login.enterPassword(password);
	   
	   //profile click
	   FbProfilePage profile  = new FbProfilePage(driver);
	   profile.openProfile();
	   
	   //like
	   FbProfilePage1 like = new FbProfilePage1(driver);
	   like.photoLike();
	}

}
