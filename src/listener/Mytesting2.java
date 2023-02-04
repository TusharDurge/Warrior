package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class Mytesting2 {
  @Test
  public void P() 
  {
	  Reporter.log("TC P is running", true);

  }
  
  @Test
  public void Q() 
  {
	  Assert.fail();
	  Reporter.log("TC Q is running", true);

  }
  
  @Test(dependsOnMethods = "Q")
  public void R() 
  {
	  
	  Reporter.log("TC R is running", true);

  }
  
  
}
