package testngannotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Practiceclass {
  @Test
  public void display() {
	  System.out.println("Wow");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beautiful");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I won");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Chikku");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Mariam");
  }
  

}
