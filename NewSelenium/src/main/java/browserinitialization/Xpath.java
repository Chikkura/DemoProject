package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {

	public void relativexpath() {
		
	
	//tagname[@attribute ='value']
		
		WebElement a = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		
	}
	public void contains()
	{
		
		//tagname[contains(@attribute,'value')]
		
		
		WebElement b =driver.findElement(By.xpath("//input[contains(@placeholder,'First name')]"));
	}
	
	public void stratsWith()
	{
		
		//tagname[starts-With(@attribute,'value')]
		WebElement c =driver.findElement(By.xpath("//select[starts-with(@id,'single-input-field')]"));
		
		
	}
	
	public void and () {
		//tagname[@attribute ='value' and @attribute ='value']
		
		WebElement d =driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='button-one']"));
		
	}
	 public void or()
	 {
		 //tagname [@attribute ='value' or @attribute = 'value']
		 
		 WebElement e =driver.findElement(By.xpath("//button[@class='btn btn-primary' or @id='button-one']"));
		 
		 
	 }
	 
	 public void text()
	 {
		 
		 WebElement d =driver.findElement(By.xpath("//button[text()='Show Message']"));
	 }
	 public void automatetest()
	 {
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");//first navigate to page u want to automate
		 
		 WebElement test =driver.findElement(By.xpath("//input[@class='form-control']"));
		 System.out.println(test.isEnabled());
		 test.sendKeys("Hello");
		 WebElement test1 =driver.findElement(By.xpath("//button[@id='button-one']"));
		 test1.click();
		 
		 
	 }
	public static void main(String[] args) {
		
		Xpath x= new Xpath();
		x.intialisebrowser();
		
		/*x.relativexpath();
		x.contains();
		x.stratsWith();
		x.and();
		x.or();
		x.text();*/
		
		
		x.automatetest();
		
		
	}

}
