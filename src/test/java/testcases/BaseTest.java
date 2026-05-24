package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.ContextMenu;
import pages.ElectronicsPage;
import pages.Grocerypage;
import pages.HomePage;

public class BaseTest {

	WebDriver driver;
	public HomePage hp;
	public ContextMenu cm;
	public Grocerypage GP;
	public ElectronicsPage EP;
	

@BeforeTest
public void setUp() {
	System.setProperty("webdriver.chrome.drivrer", "C:\\Users\\mahesh\\Downloads\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://openkart.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	hp = new HomePage(driver);
	cm = new ContextMenu(driver);
	GP = new Grocerypage(driver);
	EP = new ElectronicsPage(driver);
	
}

@AfterTest
public void tearDown() {
	//driver.close();
}
}
