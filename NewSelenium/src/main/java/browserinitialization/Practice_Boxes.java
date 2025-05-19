package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice_Boxes extends Practice_basics{
	public void checkbox()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		WebElement a =driver.findElement(By.xpath("//input[@value='option-1']"));
		a.click();
		System.out.println(a.isSelected());
		
	}
	
	public void radiobutton() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement b =driver.findElement(By.xpath("//input[@value='blue']"));
		b.click();
		System.out.println(b.isSelected());
	}

	public static void main(String[] args) {
		Practice_Boxes a1 =new Practice_Boxes();
		a1.initialise();
		a1.checkbox();
		a1.radiobutton();

	}

}
