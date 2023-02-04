package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGgroup {
	
  @Test (groups = "reg")
  public void tc1() 
  {
	Reporter.log("tc1 is pass", true);  
  }
  
  @Test (groups = "sanity")
  public void tc2() 
  {
	Reporter.log("tc2 is pass", true);  
  }
  
  @Test (groups = "reg")
  public void tc3() 
  {
	Reporter.log("tc3 is pass", true);  
  }
  
  @Test (groups = "sanity")
  public void tc4() 
  {
	Reporter.log("tc4 is pass", true);  
  }
  
  @Test (groups = {"reg","sanity"})
  public void tc5() 
  {
	Reporter.log("tc5 is pass", true);  
  }
  
  @Test
  public void tc6() 
  {
	Reporter.log("tc6 is pass", true);  
  }
  
  
  
  
}
