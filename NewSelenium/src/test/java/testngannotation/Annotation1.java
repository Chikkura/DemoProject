package testngannotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotation1 {
  @Test
  public void display() {
	  System.out.println("Hi");
  }
  @BeforeMethod
  public void beforeMethod() //chromelaunch,maximise,navigate, all launching methods
  {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod()//quit and close
  {
	  System.out.println("AfterMethod");
  }

}
