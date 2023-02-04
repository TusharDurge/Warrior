package testNGkeyword;



import org.testng.Reporter;
import org.testng.annotations.Test;

//DeadLock  or cyclic dependence jar out put aale nahi tar. output blank aale tar.
public class KeywordDependsOnMethod {
  @Test(priority = 1)
  public void A() 
  {	
     Reporter.log("A running", true);  
  }
  @Test(priority = 3)
  public void C() 
  {  
	 
     Reporter.log("C running", true);  
  }
  @Test(priority = 2)
  public void B() 
  {
     Reporter.log("B running", true);  
  }
  @Test(dependsOnMethods = "C")
  public void D() 
  {
     Reporter.log("D running", true);  
  }
}
