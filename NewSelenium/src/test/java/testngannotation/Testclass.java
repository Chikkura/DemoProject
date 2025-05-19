package testngannotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testclass {
  @Test
  public void display() {
	  System.out.println("tEST1");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("tEST2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("tEST3");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("tEST4");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("tEST5");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("tEST6");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("tEST7");
  }

}
