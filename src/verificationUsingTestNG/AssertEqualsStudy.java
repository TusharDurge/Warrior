package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertEqualsStudy {
	
  @Test
  public void tushar() 
  {
	  String a = "abc";
	  String b = "abcd";
	  
	  Assert.assertEquals(a, b ,"a and b are not equal. tc is failed");
	 
  }
}
