package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageclass.HomePageclass;

public class Homepagetest extends  Base{
  @Test
  public void clickandlogout()
	{
		
	  HomePageclass HomePageclass = new HomePageclass(driver);
	  
	  HomePageclass.enterusernameANDpasword("carol", "1q2w3e4r");
	  HomePageclass.loginclick();
	  HomePageclass.usernameandlogout();
	  
	  
	  
	}
}
