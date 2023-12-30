package Com.CucumberFrameWork.AutomationPractice2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGOfAnnotation2 {
  @Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is afterMethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before Class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }
  @Test
  public void f6() {
	  System.out.println("This is second test annotation");
  }


  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suit annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suit annotation");
  }

}
