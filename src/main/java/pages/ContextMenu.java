package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.basePage;

public class ContextMenu extends basePage{

	public ContextMenu(WebDriver driver) {
		super(driver);
		
	}
	//(//*[@loading ='lazy'])[1]
	////*[@alt='Grocery']
	@FindBy(xpath = "(//*[@loading ='lazy'])[1]") public WebElement Grocery;
	@FindBy(xpath = "//*[@alt='Electronics']") public WebElement Electronics;
	
	public void clickGrocery() {
		Grocery.click();
	}
	public void clickElectronics() {
		Electronics.click();
	}

}
