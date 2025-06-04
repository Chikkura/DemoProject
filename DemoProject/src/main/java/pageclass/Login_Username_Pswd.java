package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Username_Pswd {
	
	public WebDriver driver;
	
	public Login_Username_Pswd(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement usernamefield;
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
		

public void usernameandwrongpswd(String username, String password)
{
	usernamefield.sendKeys(username);
	passwordfield.sendKeys(password);
	
}
public void click()
{
	loginButton.click();
}

	


public void wrongusernameandpswd(String username, String wrongpassword)
{
	usernamefield.sendKeys(username);
	passwordfield.sendKeys(wrongpassword);
	
}
public void nextclick()
{
	loginButton.click();
}



}

