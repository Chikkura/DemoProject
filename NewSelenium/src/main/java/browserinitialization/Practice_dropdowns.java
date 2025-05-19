package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Practice_dropdowns extends Practice_basics {
	public void drop() {
		
		 driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 WebElement d =driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		 Select select =new Select(d);
		 //select.selectByContainsVisibleText("Maven");
		 //select.selectByValue("testng");
		 select.selectByIndex(2);
		
	}

	public static void main(String[] args) {
		Practice_dropdowns check =new Practice_dropdowns ();
		check.initialise();check.drop();

	}

}
