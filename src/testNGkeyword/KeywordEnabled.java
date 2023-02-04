package testNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordEnabled 
{
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
@Test(enabled = false)

public void B() 
{
   Reporter.log("B running", true);  
}
@Test

public void D() 
{
   Reporter.log("D running", true);  
}
}
