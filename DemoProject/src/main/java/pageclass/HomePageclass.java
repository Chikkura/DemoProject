package pageclass;

import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageclass {
	public WebDriver driver;
	public HomePageclass(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement usernamefield;//element name
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement passwordfield;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement clicklog;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement clickonusernamefield;
	@FindBy(xpath="//a[@class='logout-btn']")
	WebElement clickonlogout;
	
	public void enterusernameANDpasword(String username, String pasword)
	{
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(pasword);
	}
	
	public void loginclick() {
		clicklog.click();
		
	}
	 public void usernameandlogout()
	 {
		 clickonusernamefield.click();
		 clickonlogout.click();
	 }
	
	
	
	
	

}
