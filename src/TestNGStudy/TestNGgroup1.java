package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGgroup1 {
	
  @Test (groups = "reg")
  public void a() 
  {
	Reporter.log("a is pass", true);  
  }
  
  @Test (groups = "sanity")
  public void b() 
  {
	Reporter.log("b is pass", true);  
  }
  
  @Test (groups = "reg")
  public void c() 
  {
	Reporter.log("c is pass", true);  
  }
  
  @Test (groups = "sanity")
  public void d() 
  {
	Reporter.log("d is pass", true);  
  }
  
  @Test (groups = {"reg","sanity"})
  public void e() 
  {
	Reporter.log("e is pass", true);  
  }
  
  @Test
  public void f() 
  {
	Reporter.log("f is pass", true);  
  }
  
  
  
  
}
