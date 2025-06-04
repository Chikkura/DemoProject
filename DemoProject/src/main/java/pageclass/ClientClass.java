package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientClass {
	public WebDriver driver;
	
	public ClientClass(WebDriver driver)
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
	
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientnamefield;
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientidfield;
	@FindBy(xpath="//button[@class='btn btn-primary']")
			WebElement clickonsearch;
			
	public void enterusernameANDpasword(String username, String pasword)
	{
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(pasword);
	}
	
	public void loginclick() {
		clicklog.click();
		
	}
	
	public void enterclientnameandID(String clientname, int clientId) {
	    clientnamefield.sendKeys(clientname);
	    clientidfield.sendKeys(String.valueOf(clientId));
	}
public void search()
{
clickonsearch.click();
}


}
