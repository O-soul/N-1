package porn;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.MainPage;

public class AnalVideoTest extends BaseTest{

	MainPage mainPage;
	
	@BeforeTest
	public void beforeTest(){
		mainPage = new Pages.MainPage();
	}
	
	@Test
	public void viewAnalLink(){	//
		Assert.assertTrue(mainPage.clickAnalLink().isPageDisplayed(), "Page is not displayed!");
	}
	
	@Test
	public void viewGruppovuhaLink(){
		Assert.assertTrue(mainPage.clickGruppovuhaLink().isPageDisplayed(), "Page is not displayed!");
	}
	
	@Test
	public void viewStudentyLink(){
		Assert.assertTrue(mainPage.clickStudentyLink().isPageDisplayed(), "Page is not displayed!");
	}
}
