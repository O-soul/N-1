package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Utils;
import porn.BaseTest;

public class MainPage extends BasePage{

	@FindBy(xpath = "//a[@href='/anal_porno_online/']")
	private WebElement analLink;
	
	@FindBy(xpath = "//a[@href='/onlain_gruppovuha/']")
	private WebElement gruppovuhaLink;
	
	@FindBy(xpath = "//a[@href='/onlajn-porno-studenty/']")
	private WebElement studentyLink;
	
	@FindBy(xpath = "//a[contains(@href,'trahaet-v-zhopu-uchilku')]/img")
	private WebElement teacherFuckinkLink;

	public MainPage(){
		partialURL = "online";
	}
	
	public MainPage clickAnalLink(){
		Utils.waitUntilVisible(analLink);
		analLink.click();
		Utils.waitUntilVisible(teacherFuckinkLink);
		teacherFuckinkLink.click();
		Utilities.Utils.sleep(5);
		return new MainPage();
	}
	
	public MainPage clickGruppovuhaLink(){
		Utils.waitUntilVisible(gruppovuhaLink);
		gruppovuhaLink.click();
		Utilities.Utils.sleep(7);
		return new MainPage();
	}
	
	public MainPage clickStudentyLink(){
		Utils.waitUntilVisible(studentyLink);
		studentyLink.click();
		Utilities.Utils.sleep(7);
		return new MainPage();
	}
	
	
}
