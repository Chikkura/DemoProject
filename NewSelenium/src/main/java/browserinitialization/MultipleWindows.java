package browserinitialization;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindows extends Base{
	public void windows()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement b =driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		b.click();
		WebElement c =driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		c.click();
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		Set<String> Childwindow = driver.getWindowHandles();
		String title ="";
		 for(String window :Childwindow)
		 {
			 if(!window.equals(Parentwindow))//not equals
				 
			 {
				 driver.switchTo().window(window);//we will get the console of child windows
				title =driver.getTitle();//storing the gettitle to title
				 //System.out.println(driver.getTitle());
				 //System.out.println(window);
			 }
			 
			 if(title.equals("WebDriver | Login Portal"))
			 {
				 WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
				 username.sendKeys("chikku_mariam)");
				 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
				 password.sendKeys("Chikku@145");
			 }
			 if(title.equals("WebDriver | Contact Us"))
			 {
				 WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
				 firstname.sendKeys("Chikku");
				 WebElement secondname = driver.findElement(By.xpath("//input[@name='last_name']"));
				 secondname.sendKeys("Mariam");
			 }
		 }
		
	}

	public static void main(String[] args) {
		MultipleWindows w =new MultipleWindows();
		w.intialisebrowser();
		w.windows();

	}

}
