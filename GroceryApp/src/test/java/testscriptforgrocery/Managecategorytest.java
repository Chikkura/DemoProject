package testscriptforgrocery;

import org.testng.annotations.Test;

import pageclassforgrocery.Managecategory;

public class Managecategorytest extends BaseClass  {
  @Test
  public void loginforgroceryapp() {
	  Managecategory category = new Managecategory (driver);
	  category.login("admin", "admin");
	  category.clickonsignin();
	 category.managecategory();
	  category.moreinfo();
	  
	  category.clickOnNewCategory();
	  category.entercategory();
	  category.selectgroups();
	  category.choosefileandtopmenu();
	  category.nowsave();
  }
}
