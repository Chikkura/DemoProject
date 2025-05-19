package browserinitialization;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practicemultiplewindows extends Base {
	public void windows()
	{
		driver.navigate().to("https://webdriveruniversity.com");
		WebElement a =driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		a.click();
		WebElement b =driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		b.click();
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		Set<String> Childwindow =driver.getWindowHandles();
	//String title =" ";
		
		for(String window:Childwindow)
		{
			if(!window.equals(Parentwindow))
			{
			driver.switchTo().window(window);
			@Nullable
			String title = driver.getTitle();
			System.out.println(driver.getTitle());
			System.out.println(window);
			}
			 /*if(title.equals("WebDriver | Login Portal"))
			 {
				 WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
				 username.sendKeys("chikku_mariam");
				 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
				 password.sendKeys("Chikku@145");
			 }
			 if(title.equals("WebDriver | Contact Us"))
			 {
				 WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
				 firstname.sendKeys("Chikku");
				 WebElement secondname = driver.findElement(By.xpath("//input[@name='last_name']"));
				 secondname.sendKeys("Mariam");
			 }*/
		 }
		}
		
		
	

	public static void main(String[] args) {
		Practicemultiplewindows window = new Practicemultiplewindows();
		window.intialisebrowser();
		window.windows();

	}

}
