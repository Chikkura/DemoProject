package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageclass.Login_Username_Pswd;

public class Login_username_Pswd_Test extends Base{
  @Test(priority = 1, dataProvider = "credentials")
   
	  
  
 public void wrongusernameandpswd(String username, String password)
  {	  
	  Login_Username_Pswd login =new Login_Username_Pswd(driver);
	  login.usernameandwrongpswd(username,  password);
	  login.click();
	  
  
}
	 @Test 
	 @Parameters({"username",  "password"})
 public void wrongusernameandwrongpswd(String username, String password)
  {	  
	   
	  Login_Username_Pswd login =new Login_Username_Pswd(driver);
	  login.wrongusernameandpswd(username,password);
	  login.nextclick();
}
 
@org.testng.annotations.DataProvider(name="credentials")
  public Object[][] testData()
  {
  	 Object data[][]= {{"carol","1q2w3e4r"},{"carol","1q2w3e4r"}};
  	return data;
  	}
  }

  

