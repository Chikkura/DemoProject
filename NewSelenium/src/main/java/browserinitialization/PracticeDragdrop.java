package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragdrop extends Base {
	
	public void dragndrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement a =driver.findElement(By.xpath("//span[text()= 'Draggable n°2']"));
		WebElement c =driver.findElement(By.xpath("//span[text()= 'Draggable n°3']"));
		Actions actions =new Actions(driver);//create an object for actions class
		actions.moveToElement(a).click();
		actions.doubleClick(a).perform();
		actions.moveToElement(c).click();
		actions.doubleClick(c).perform();
		
		
				
		WebElement b=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(a, b).build().perform();
		actions.dragAndDrop(a, c).build().perform();
		
		
		
		
	}

	public static void main(String[] args) {
		PracticeDragdrop  c =new PracticeDragdrop ();
		c.intialisebrowser();c.dragndrop();

	}

}
