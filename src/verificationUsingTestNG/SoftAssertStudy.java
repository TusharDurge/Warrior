package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	SoftAssert soft = new SoftAssert();
  @Test
  
  public void myTest1() 
  {
	  String a = "abc";
      String b = "abc";
      
      SoftAssert soft = new SoftAssert();
      
      soft.assertNull(a, "a is not null tc failed");
      soft.assertNotEquals(a, b, "a and b are equal tc is failed");
      soft.assertAll();
  }
  @Test
  public void myTest2()
  {
  boolean a= true;
  boolean b=false;
 
  soft.assertTrue(b,"b is false, Tc is failed");
  soft.assertFalse(a,"a is true, TC is failed");
  soft.assertAll();
  }

}
