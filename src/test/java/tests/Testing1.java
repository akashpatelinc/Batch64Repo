package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1 {
  @Test(dataProvider = "dp")
  public void abc (Integer n, String s) {
	  System.out.println("n+s");
  }
  // used dataProvider to run set of data for tests
  
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  } 
    @DataProvider
    public Object[][] dp1() {
      return new Object[][] {
        new Object[] { 1, "a" },
        new Object[] { 2, "b" },
      };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }
  
  @Test
  public void test1() {
	  System.out.println("Test1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2");
  }

}
