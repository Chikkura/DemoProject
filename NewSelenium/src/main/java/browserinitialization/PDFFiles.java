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

public class PDFFiles {
	
	public WebDriver driver;
	
	
 public void pdf() {
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.ilovepdf.com/pdf_to_word");
	 driver.manage().window().maximize();
	 WebElement pdf = driver.findElement(By.xpath("//a[@id='pickfiles']"));
	 pdf.click();
	 pdf.sendKeys("C:\\Users\\Chikku\\Downloads\\Chikku Resume.pdf");
	 
 }
 
 public void pdffile() throws AWTException {
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.ilovepdf.com/pdf_to_word");
	 driver.manage().window().maximize();
	 WebElement pdf = driver.findElement(By.xpath("//a[@id='pickfiles']"));
	 pdf.click();
 StringSelection selection =new StringSelection("C:\\Users\\Chikku\\Downloads\\Chikku Resume.pdf");

 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
 Robot robot =new Robot();
 robot.keyPress(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_V);
 robot.keyPress(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_V);
 
 
 
 
 
 
 }
 
 
 
 
	public static void main(String[] args) throws AWTException {
		PDFFiles z =new PDFFiles();
		z.pdf();
		z.pdffile();

	}

}
