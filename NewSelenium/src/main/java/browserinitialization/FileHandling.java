package browserinitialization;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {
	public WebDriver driver;
public void files()
{
	driver = new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	
	WebElement file =driver.findElement(By.xpath("//a[@id='pickfiles']"));
	file.click();
	file.sendKeys("C:\\Users\\Chikku\\Downloads\\Chikku Resume.pdf");
	
	

}

public void filesrobo() throws AWTException
{
	driver = new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	WebElement file =driver.findElement(By.xpath("//a[@id='pickfiles']"));
	file.click();
	StringSelection selection =new StringSelection("C:\\Users\\Chikku\\Downloads\\Chikku Resume.pdf");//Creates a StringSelection object with the file path of the PDF you want to upload.
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);//Accesses the system's clipboard and sets its content to the file path you created above (selection).
	Robot robot =new Robot();//Creates a Robot object that allows you to simulate keyboard and mouse actions.
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	
	
	
}
	public static void main(String[] args) throws AWTException {
		FileHandling file = new FileHandling();
		file.files();
		file.filesrobo();

	}

}
