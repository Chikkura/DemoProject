package browserinitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBaseclass {
	public WebDriver driver;
	public void browserinitialisation()
	{
		
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
	}
	

	public static void main(String[] args) {
		PracticeBaseclass test =new PracticeBaseclass();
		test.browserinitialisation();

	}

}
