package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void notNullCheck() 
  {
	  String a = null;
	  
	  Assert.assertNotNull(a, "a is null. tc is failed");
  }
}
