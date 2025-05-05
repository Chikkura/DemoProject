package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestAutomation extends  Base{
	
	/*public void test()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement a =driver.findElement(By.xpath("//input[@id='value-a']"));
		a.sendKeys("10");
		WebElement b= driver.findElement(By.xpath("//input[@id='value-b']"));
		b.sendKeys("20");
		WebElement c= driver.findElement(By.xpath("//button[@id='button-two']"));
		c.click();
		
	}*/
	
	public void textfieldlocator()//this is to enter value for a particulat textfield out of 3
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement text =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		text.sendKeys("100");
		
		
	}

	public static void main(String[] args) {
		TestAutomation test = new TestAutomation();
		test.intialisebrowser();
		//test.test();
		test.textfieldlocator();

	}

}
