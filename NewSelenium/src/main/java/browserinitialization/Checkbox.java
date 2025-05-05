package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base{
	
	/*public void checkbox()
	{
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement c = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		c.click();
		
		
	}*/
	
	public void radiobutton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement r= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		r.click();
	}

	public static void main(String[] args) {
		Checkbox test = new Checkbox();
		test.intialisebrowser();
		//test.checkbox();
		test.radiobutton();
		

	}

}
