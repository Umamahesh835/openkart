package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.basePage;

public class HomePage extends basePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@class='search-input']") public WebElement Searchtext;
	@FindBy(xpath = "(//*[@class='search-lens'])[1]") public WebElement searchbutton;
	@FindBy(xpath = "(//ul/li/a)[1]") public WebElement Home;
	
	public void entersearchtext(String text) {
		Searchtext.sendKeys(text);

	}
	public void clicksearchbutton() {
		searchbutton.click();
	}
	public void clickHome() {
		Home.click();
	}

}
