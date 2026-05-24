package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.basePage;

public class ElectronicsPage  extends basePage{

	public ElectronicsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div/h1") public WebElement ElectonicsWelcomeMessage;
	
	public String getElectonicsWelcomeMessage() {
		String msg = ElectonicsWelcomeMessage.getText();
		return msg;
	}


	
}
