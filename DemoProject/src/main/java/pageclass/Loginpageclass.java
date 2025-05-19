package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageclass  {
	
	public WebDriver driver;
	public Loginpageclass (WebDriver driver)//contructor

	{
		
		this.driver =driver;//localvar to instance(blue driver is this classdriver)
		PageFactory.initElements(driver,this);//classname.methodname(initialise). this driver is object calling class driver
		
	}
	
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement usernamefield;//element name
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement passwordfield;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement clicklog;
	public void enterusernameANDpasword(String username, String pasword)
	{
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(pasword);
	}
	
	public void loginclick() {
		clicklog.click();
		
	}
	

}
