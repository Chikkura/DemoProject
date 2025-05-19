package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends Base {
	
	public void alerts()
	{
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alert1.click();
		driver.switchTo().alert().accept();
		
	}
	public void alertsmethod()
	{
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']']"));
		alert2.click();
		driver.switchTo().alert().dismiss();
	}

	public void alertsmethodentermessage()
	{
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert3.click();
		driver.switchTo().alert().sendKeys("Hi");
		driver.switchTo().alert().accept();
	}

	

	public static void main(String[] args) {
		Alerts a =new Alerts();
		a.intialisebrowser();
		//a.alerts();
		//a.alertsmethod();
		a.alertsmethodentermessage();

	}

}
