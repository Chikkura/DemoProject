package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeMulticheckboxes extends PracticeBaseclass{
	
	/*public void checkboxes()
	{
		List<WebElement> c = driver.findElements(By.xpath("//input[@type='checkbox']"));//multiple field are there so list is added for FINDELEMENTS
		for(WebElement checkbox:c)//for(WebElement reference =objname)
		{
			checkbox.click();
		
		}*/
		 public void select() {
			 
			WebElement multi = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
			Select c =new Select(multi);
			//c.selectByValue("c#");
			//c.selectByVisibleText(" Python ");
			c.selectByIndex(0);
			
			
		 }
		
	

	public static void main(String[] args) {
		PracticeMulticheckboxes test =new PracticeMulticheckboxes();
		test.browserinitialisation();
		//test.checkboxes();
		test.select();

	}

}
