package testNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test (priority = -2)
  public void b() 
  {
	  Reporter.log("tc b is pass", true);
  }
  
  @Test (priority = -8)
  public void a()
  {
	  Reporter.log("tc a is pass", true);
  }
  
  @Test (priority = 2)
  public void d()
  {
	  Reporter.log("tc d is pass", true);
  }
  
  @Test (priority = 1)
  private void c() 
  {
	  Reporter.log("tc c is pass", true);
  }
  
}
