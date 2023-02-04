package neoStoxTestClasses;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.Base3;
import neoStoxUtility.Utility2;

public class Listener extends Base3 implements ITestListener
{
  @Override
  public void onTestFailure(ITestResult result)
  {
	  try {
		    Reporter.log("TC"+result.getName()+"failed",true);
		    Utility2.takeScreenshot(driver, result.getName());
	      }
	  catch (IOException e) 
	      {
		    e.printStackTrace();
	      }
  }
  
  @Override
  public void onTestSuccess(ITestResult result)
  {
	  //Reporter.log("TC"+result.getName()+"passed",true);
	  try {
		    Reporter.log("TC"+result.getName()+"failed",true);
		    Utility2.takeScreenshot(driver, result.getName());
	      }
	  catch (IOException e) 
	      {
		    e.printStackTrace();
	      }
	 
	  
  }
}
