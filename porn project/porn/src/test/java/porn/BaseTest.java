package porn;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import BrowserFactory.BrowserSetup;

public class BaseTest{
	public static WebDriver driver;

	@BeforeSuite
	public void setup(){  	
		driver = new BrowserSetup().getDriver("chrome");
		driver.get("http://www.porus.co");		
	}

	@AfterSuite(alwaysRun = true)
	public static void afterClass() {
		driver.close();
	}

}
