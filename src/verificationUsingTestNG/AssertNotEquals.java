package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void fruits() 
  {
	  
		  String a = "apple";
		  String b = "orange";
		  
		  Assert.assertNotEquals(a, b ,"a and b are equal. tc is failed");
		 
	  
  }
}
