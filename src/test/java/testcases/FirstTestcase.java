package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContextMenu;
import pages.Grocerypage;
import pages.HomePage;

public class FirstTestcase extends BaseTest{
	
	
	@Test
	public void f() throws InterruptedException {
		
		
		Thread.sleep(1000);
		//cm.clickGrocery();
		cm.clickElectronics();
		String Welcomemsg = EP.getElectonicsWelcomeMessage();
		//System.out.println(Welcomemsg);
		Assert.assertEquals(Welcomemsg,"Electronics");
		System.out.println(Welcomemsg);
		
		
		
		
	}

}
