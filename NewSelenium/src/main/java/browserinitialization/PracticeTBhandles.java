package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticeTBhandles extends Base{
	 /*public void fulltbdata()
	 {
		 driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		 
		 WebElement a = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		 System.out.println(a.getText());
		 
	 }
	
	public void fullrow()
	{

		 driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		 
		WebElement b1 =driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(b1.getText());
	}*/
	
	public void particularcolumn()
	{

		 driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		 
		List<WebElement> c =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement column:c)

		{
			System.out.println(column.getText());
			
		}
		
		

	}
	
	public void searchaninput()
	
	{
		 driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		int c =63;
		List<WebElement> f =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[4]"));
		for(WebElement check:f)
		{
			if(check.getText().equals(f));
			System.out.println(check.getText());
			
		}
		
	}
	
	
	
public void selectrowandcolumn()
{
	
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> e =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[1]"));
	for (WebElement rowandcolumn :e)
	{
		
		System.out.println(rowandcolumn.getText());
	}
	
}

	public static void main(String[] args) {
		PracticeTBhandles b =new PracticeTBhandles();
		b.intialisebrowser();
		//b.fulltbdata();
      //b.fullrow();
//b.particularcolumn();
//b.selectrowandcolumn();
		b.searchaninput();
	}

}
