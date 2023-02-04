package testNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordTimeOut  {
  
  
 @Test
  
  public void A() 
  {
     Reporter.log("A running", true);  
  }
  
@Test
  
  public void C() 
  {
     Reporter.log("C running", true);  
  }
@Test(timeOut = 2000)

public void B() throws InterruptedException 
{
   Reporter.log("B running", true);  
   Thread.sleep(4000);
}

 
}
