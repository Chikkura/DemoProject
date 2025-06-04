package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageclass.ClientClass;

public class Clientclass extends Base{
  @Test
  public void client() {
	  
	  ClientClass clientPage= new ClientClass(driver);
	  clientPage.enterusernameANDpasword("carol", "1q2w3e4r");
	  clientPage.loginclick();
	 
	  clientPage.enterclientnameandID("Arnold", 101);
	  clientPage.search();

	  
  }
}
