package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import PornTest.porn.BaseTest;
import Utilities.Utils;

public class BasePage {

	@FindBy(xpath = ".//*[@id='videoplayer']")
	private WebElement playLink;

	String partialURL;
	
	public BasePage(){
		PageFactory.initElements(BaseTest.driver, this);
		partialURL = "";
	}

	public BasePage playVideo(){
		Utils.waitUntilVisible(playLink);
		playLink.click();
		return this;
	}
	
	public boolean isPageDisplayed(){
		Utils.sleep(7);
		return BaseTest.driver.getCurrentUrl().contains(partialURL);
	}
}
