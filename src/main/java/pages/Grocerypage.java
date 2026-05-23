package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.basePage;

public class Grocerypage extends basePage{

	public Grocerypage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@class='searchInputs']") public WebElement Gsearchbar;
	
	
	public void entertext(String text) {
		Gsearchbar.sendKeys(text);
	}

}
