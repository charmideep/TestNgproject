package testngpk;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing4 {
	SoftAssert softassert=new SoftAssert();
 @Test(priority=1,groups="smoke") //test run first
  public void creteuser() {
	  System.out.println("I amhome test");
	  System.out.println("Before assertion");
	  Assert.assertTrue(2<3, "verfying Element");
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc");
	  //juit suitrun is java file and testng suitrun is xml file
  }
  @Test(priority=2, dependsOnMethods="creteuser")  //we put depends that just first test is run another go to skip
  public void edituser()
  {
	  System.out.println("Before assertion");
	  softassert.assertTrue(2 < 3 ,"verfying element");
	  System.out.println("after assertion");
	  softassert.assertAll();
  }
  
  @Test(priority=3,dependsOnMethods="edituser")
  public void deleteuser()
  {
	  System.out.println("I am in end test");
	  System.out.println("before seconf assertion");
	  softassert.assertTrue(2<3, "verfying element");
	  System.out.println("afterscond assertion");
	  softassert.assertEquals("abc", "abc");
	  System.out.println("after equal menthod");
	  softassert.assertAll();
	  
  }
}
