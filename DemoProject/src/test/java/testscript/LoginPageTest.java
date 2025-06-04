package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageclass.Loginpageclass;

public class LoginPageTest extends Base{
  @Test
  public void login() 
  {
	  
	  Loginpageclass login =new Loginpageclass (driver);//src main java class object creation
	  login.enterusernameANDpasword("carol", "1q2w3e4r");
	  login.loginclick();
  }
}
