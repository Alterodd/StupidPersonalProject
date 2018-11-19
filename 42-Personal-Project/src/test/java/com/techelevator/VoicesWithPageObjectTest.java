package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VoicesWithPageObjectTest {

	private static WebDriver webDriver;
	private VoicesHomePage homePage;
	private VoicesMainMenuPage menuPage;
	private VoicesEntryPage entryPage;
	private VoiceEntryResultPage resultPage;
	private VoicesForumPage forumPage;
	
	
	@BeforeClass
	public static void openWebBrowserForTesting() {
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.chrome.driver", homeDir + "/dev-tools/chromedriver/chromedriver_new");
		webDriver = new ChromeDriver();
	}

	@Before
	public void openHomePage() {
		webDriver.get("http://localhost:8080/42-Personal-Project/menuList");
		homePage = new VoicesHomePage(webDriver);
	}

	@AfterClass
	public static void closeWebBrowser() {
		webDriver.close();
	}
	
	@Test
	public void main_menu_link_test() {
		
		menuPage = homePage.clickMainMenuLink();

		assertEquals("See Voice Entries", menuPage.findVoicesList());
		assertEquals("Make An Entry To The Forum", menuPage.findFourm());

	}
	
	@Test
	public void main_menu_range_finder_test() {
		menuPage = homePage.clickMainMenuLink();
		assertEquals("Bass Range", menuPage.findBassDiv());
		assertEquals("Baritone Range", menuPage.findBariDiv());
	}
	
	@Test
	public void forum_entry_test() {
		
		forumPage = new VoicesForumPage(webDriver);
		forumPage.openForumPage();
		int numberOfTables = forumPage.findNumberOfTables();
		
		
		resultPage = homePage.clickVoicesEntryLink()
					.enterFirstName("Bob")
					.enterLastName("Johnson")
					.selectVocalRange("Bass")
					.clickSubmit();
		
		assertEquals("Thanks for your entry!", resultPage.findThankYouParagraph());
		
		forumPage.openForumPage();
		
		assertTrue(forumPage.findNumberOfTables() > numberOfTables);
	}
	
	
	
}
