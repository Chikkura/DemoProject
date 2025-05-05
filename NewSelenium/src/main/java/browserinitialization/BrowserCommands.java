package browserinitialization;


public class BrowserCommands extends Base{
	public void browsercommands() {
		
		String title = driver.getTitle();
				System.out.println(title);
				String url = driver.getCurrentUrl();
						System.out.println(url);
				String pagesource =driver.getPageSource();	
						
						System.out.println(pagesource);
						
	}

	public static void main(String[] args) {
		
		BrowserCommands browsercommands =new BrowserCommands();
		browsercommands.intialisebrowser();
		browsercommands.browsercommands();
	}

}
