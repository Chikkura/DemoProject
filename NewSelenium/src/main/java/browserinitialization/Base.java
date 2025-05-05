package browserinitialization;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public void intialisebrowser()
	{
	driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
	
		//driver =new EdgeDriver();
		//driver =new FirefoxDriver();
	
	}
	public void quitandClose()
	{
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		
Base base =new Base();
base.intialisebrowser();
base.quitandClose();
	}

}