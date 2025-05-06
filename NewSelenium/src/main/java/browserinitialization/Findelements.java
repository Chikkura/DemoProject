package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Findelements extends Base {
	
	public void findelements()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		List<WebElement> messagefields =driver.findElements(By.xpath("//input[@type='text']"));
		
		for(WebElement c:messagefields )
		{
			
			c.sendKeys("Hello");
		}
		
		
		/*driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		List<WebElement> multiplecheckbox= driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(WebElement checkboxes:multiplecheckbox)
		{
			checkboxes.click();
			
		}*/
		
		
		
	}
	

	public static void main(String[] args) {
		Findelements y =new Findelements();
		y.intialisebrowser();y.findelements();

	}

}
