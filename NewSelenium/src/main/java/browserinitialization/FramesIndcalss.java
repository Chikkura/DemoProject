package browserinitialization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesIndcalss {
	
	public WebDriver driver;
	public void frames()
	{
		
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id=\'a077aa5e\']"));//webelement for iframe
		driver.switchTo().frame(iframe);
		WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));//webelement for that particular image
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(image));
		image.click();
		
	}
	

	public static void main(String[] args) {
		FramesIndcalss f = new FramesIndcalss ();
		f.frames();
		

	}

}
