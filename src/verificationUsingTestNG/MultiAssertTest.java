package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiAssertTest {
	
	String a = null;
	String b = "abc";
	String c = "abc";
	
  @Test
  public void notNullCheck() 
  {
	  Assert.assertNotNull(b, "b value is null. tc failed");
	 Assert.assertNotNull(a, "a value is null. tc failed");
  }
  
  @Test
  public void equalsCheck()
  {
	  Assert.assertEquals(b, c, "b and c are not equal. tc is failed");
	  Assert.assertEquals(a, b, "a and b are not equal. tc is failed");
  }
  
}
