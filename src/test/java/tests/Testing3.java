package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
 
	SoftAssert softAssert = new SoftAssert();
	
	//we use priority in order to run test based on selected priority
	
	@Test (priority = 1)//create new User test@tests.com
  public void createUser() {
	  System.out.println("I am in home Test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(2>3, "Verifying Element"); // we use regular assertion like this only in industry
	 //when we use Assert (in industry) tests get stopped running if assert failed 
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc");
  }
	
	//dependecy will skipp tests which depend on previous test that is failing to save time and to find that excatly which test is failing and due to which, which tests are getting skipped.
	@Test (priority = 2, dependsOnMethods = "createUser")//Edit new User test@test.com
	  public void editUser() {
		  System.out.println("Before Assertion");
		  softAssert.assertTrue(2>3, "Verifying Element"); 
		  System.out.println("After assertion");
		  softAssert.assertAll(); //similar to error collector in Junit
	  }
	
	@Test (priority = 3, dependsOnMethods = "editUser") //Delete new User test@test.com
	  public void deleteUser() {
		System.out.println("I am in end test");
		  System.out.println("Before Assertion");
		  softAssert.assertTrue(2>3, "Verifying Element"); 
		  System.out.println("After assertion");
		  softAssert.assertEquals("abc", "abd");
		  System.out.println("After second assertion");
		  softAssert.assertAll(); 
		 //use of AssertAll (test runs after softassert and shows pass (even after failure conditions)
		  // so even test runs after failure to get that failure result use AssertAll, to see failed results and get as failure output 
	  }
}
