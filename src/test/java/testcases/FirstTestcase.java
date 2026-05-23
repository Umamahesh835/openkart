package testcases;

import org.testng.annotations.Test;

import pages.ContextMenu;
import pages.Grocerypage;
import pages.HomePage;

public class FirstTestcase extends BaseTest{
	
	public HomePage hp;
	public ContextMenu cm;
	public Grocerypage GP;
	@Test
	public void f() throws InterruptedException {
		hp = new HomePage(driver);
		cm = new ContextMenu(driver);
		GP = new Grocerypage(driver);
		
		Thread.sleep(1000);
		cm.clickGrocery();
		
		
		
	}

}
