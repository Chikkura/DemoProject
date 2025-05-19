package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base {
	
	public void draganddrop()
	{
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement a =driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
			Actions actions=new Actions(driver)	;
			actions.moveToElement(a).click();
			actions.doubleClick(a).perform(); 
	
		WebElement b =driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(a, b).build().perform();
	}

	public static void main(String[] args) {
		DragandDrop d =new DragandDrop();
		d.intialisebrowser();
		d.draganddrop();

	}

}
