package testcases;

import org.testng.annotations.Test;

import pages.ContextMenu;
import pages.Grocerypage;
import pages.HomePage;

public class FirstTestcase extends BaseTest{
	
	
	@Test
	public void f() throws InterruptedException {
		
		
		Thread.sleep(1000);
		cm.clickGrocery();
		
		
		
	}

}
