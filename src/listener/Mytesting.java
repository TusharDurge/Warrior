package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class Mytesting {
  @Test
  public void A() 
  {
	  Reporter.log("TC A is running", true);

  }
  
  @Test
  public void B() 
  {
	  Assert.fail();
	  Reporter.log("TC B is running", true);

  }
  
  @Test(dependsOnMethods = "B")
  public void c() 
  {
	  
	  Reporter.log("TC c is running", true);

  }
  
  
}
