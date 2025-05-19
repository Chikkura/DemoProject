package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice_Project extends Practice_basics{
	public void project()
	{
		driver.navigate().to("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		List<WebElement> a= driver.findElements(By.xpath("//input[@name='first_name']"));
		for(WebElement test1 : a)
		{
			
			test1.sendKeys("Chikku");
		}
		List<WebElement> a1= driver.findElements(By.xpath("//input[@name='last_name']"));
		for(WebElement test2 : a1)
		{
			
			test2.sendKeys("Mariam");
		}
		
		List<WebElement> c =driver.findElements(By.xpath("//input[@name='email']"));
		
		for(WebElement test3:c)
		{
			test3.sendKeys("chikku.r@gmail.com");
			
	
	}
		
WebElement d =driver.findElement(By.xpath("//input[@type='submit']"));
		
		d.click();
		
	
	}

	public static void main(String[] args) {
		Practice_Project test =new Practice_Project();
		test.initialise();
		test.project();
		

	}

}
