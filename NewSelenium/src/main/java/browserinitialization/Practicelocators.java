package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practicelocators extends Base {
	public void idLocator() {
		
		WebElement x = driver.findElement(By.id("single-input-field"));
		
			}
	
	
	public void classname()
	{
		
		WebElement y = driver.findElement(By.className("form-control datepicker"));
	}
	public void name()
	{
	 
	WebElement name =driver.findElement(By.name("password"));
	}
	
	public void linktext()
	{
	 WebElement z =driver.findElement(By.linkText("jquery-progress-bar.php"));
			 
	}
	 public void partialLinktext()
	 {
		 
		 WebElement p =driver.findElement(By.partialLinkText("jquery-progress"));
	 }
	
	 public void css_selectors()
	 {
		 
		 WebElement a = driver.findElement(By.cssSelector("input#single-input-field"));//tag#id
		 WebElement b =driver.findElement(By.cssSelector("input.form-check-input"));//tag.classname
		 WebElement c =driver.findElement(By.cssSelector("input[id='validationCustom05']"));//tag[attribute type ='attribute name']
		 WebElement d =driver.findElement(By.cssSelector("input.form-control[id='validationCustom05'] ")); //tag.classname[attribute type ='attribute name']
		 
		 
	 }

	public static void main(String[] args) {
		Practicelocators id =new Practicelocators();
		id.intialisebrowser();
		id.idLocator();
		id.classname();
		id.partialLinktext();
		id.linktext();
		id.css_selectors();
		id.name();

	}

}
