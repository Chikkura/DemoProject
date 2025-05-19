package browserinitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice_basics {
	
	public WebDriver driver;// global declarisation of a web
	public void initialise()
	{
		driver = new ChromeDriver();//method for chrome intialisation
		driver.get("https://webdriveruniversity.com");
		driver.manage().window().maximize()	;
		//driver.close();
	}

	public static void main(String[] args) {
		Practice_basics basics = new Practice_basics();
		basics.initialise();
		

	}

}
