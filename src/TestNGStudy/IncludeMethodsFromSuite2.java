package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeMethodsFromSuite2 {
  @Test
  public void tushar() 
  {
	  Reporter.log("my name is tushar", true);
  }
  
  @Test
  public void chetan() 
  {
	Reporter.log("my name is chetan", true);
  }
  
  @Test
  public void vinayak() 
  {
	Reporter.log("my name is vinayak", true);
  }
  
  @Test
  private void sangita() 
  {
	Reporter.log("my name is sangita", true);
  }
}
