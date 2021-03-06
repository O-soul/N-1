package BrowserFactory;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSetup {

	static WebDriver driver;
	DesiredCapabilities caps;
	
	@SuppressWarnings("static-access")
	public WebDriver getDriver(String browser){		
		caps = new DesiredCapabilities();
		switch(browser){
		case "fox":
		driver = new FirefoxDriver();
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "src/main/java/resource/chromedriver.exe");
		caps.chrome();
		caps.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		driver = new ChromeDriver(caps);              
		}	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		return driver;
	}
	
}
