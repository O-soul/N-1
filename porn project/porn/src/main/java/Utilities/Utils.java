package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import porn.BaseTest;

public class Utils {

	public static void waitUntilVisible(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(BaseTest.driver)
				.withTimeout(15, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NullPointerException.class);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch (TimeoutException  e) {}
	}
	
	public static void sleep(int seconds){
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
