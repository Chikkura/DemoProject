package browserinitialization;

public class Navigationcommands extends Base {
	public void navigationcommands()
	{
		driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
		driver.navigate().forward();
	driver.navigate().refresh();
	}

	public static void main(String[] args) {
		Navigationcommands navigationcommands= new  Navigationcommands();
		navigationcommands.intialisebrowser();
		navigationcommands.navigationcommands();
		

	}



}
