package testngannotation;

import org.testng.annotations.Test;

public class TestNG {
  @Test(priority = 2)
  public void print() {
	  System.out.println("Hello");
  }
  @Test(priority = 1)
  public void display()//it runs based on alphabetical order of method
  {
	  System.out.println("Beautiful");
  }
}
