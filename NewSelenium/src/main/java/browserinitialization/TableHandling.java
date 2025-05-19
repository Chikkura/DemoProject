package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	/*public void fulltablesdata()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement a  =driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		
		System.out.println(a.getText());
	}*/
	
	/*public void selectrow()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement b =driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));//tbody is tablebody,tr-tablrow index is2
		System.out.println(b.getText());
		
	}*/

	/*public void selectcolumn()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> c =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement column:c)
		{
			System.out.println(column.getText());
		}*/
		
		public void selectparticularelement()
		{

			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			
			WebElement d =driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[1]"));
			
					System.out.println(d.getText());	
		}
	 public void searchelelment()
	 {
		 driver.navigate().to("https://selenium.qabible.in/table-pagination.php"); 
		 String input = "Software Engineer";
		 
		 List<WebElement> e =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		 
		 for(WebElement onedata:e)
		 {
			  if(onedata.getText().equals(input))
				 
			  {
				  
				  System.out.println(onedata.getText());
			  }
			 
		 }
		 
	 }

	public static void main(String[] args) {
		TableHandling x =new TableHandling();
		x.intialisebrowser();
		//x.fulltablesdata();
//x.selectrow();
		//x.selectcolumn();
		x.selectparticularelement();
		x.searchelelment();
	}

}
