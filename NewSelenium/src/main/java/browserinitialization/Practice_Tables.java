package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice_Tables extends Practice_basics {
	public void tables()
	{
		driver.navigate().to("https://webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		WebElement a =driver.findElement(By.xpath("//div[@id='thumbnail-1']"));
		System.out.println(a.getText());
		
		
	}
	public void rowtables()
	{
		driver.navigate().to("https://webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		WebElement b =driver.findElement(By.xpath("//div[@id='thumbnail-1']//tbody//td[1]"));
		System.out.println(b.getText());
	}
	
	public void row_columntables()
	{
		driver.navigate().to("https://webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		List<WebElement> c =driver.findElements(By.xpath("//div[@id='thumbnail-1']//tbody//tr[2]//td[1]"));
				{
			for(WebElement randc: c)
			{
				System.out.println(randc.getText());
			}
				}
								
				
	}
	public void element()
	{
		String input ="	Woods";
		List<WebElement> e =driver.findElements(By.xpath("//div[@id='thumbnail-1']//tbody//tr[4]//td[2]"));
		for(WebElement check :e)
		{
			if(check.getText().equals(input))
				
			{
				System.out.println(check.getText());
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Practice_Tables p = new Practice_Tables();
		p.initialise();
		//p.tables();
		//p.rowtables();
		p.row_columntables();
		p.element();

	}

}
