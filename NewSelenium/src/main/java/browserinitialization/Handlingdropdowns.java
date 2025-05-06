package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdowns extends Base {
 public void dropdowns()
 {
	 driver.navigate().to("https://selenium.qabible.in/select-input.php");
	 WebElement dropdownfield =driver.findElement(By.xpath("//select[@id='single-input-field']"));
	 
	 Select select = new Select(dropdownfield);
	// select.selectByValue("Red");
	 //select.selectByVisibleText("Yellow");
	 select.selectByIndex(3);
	 
 }
	public static void main(String[] args) {
		
		Handlingdropdowns d= new Handlingdropdowns();
		d.intialisebrowser();
		d.dropdowns();
	}

}
