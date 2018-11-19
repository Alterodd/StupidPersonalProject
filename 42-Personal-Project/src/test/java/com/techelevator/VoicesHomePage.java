package com.techelevator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VoicesHomePage {
	private WebDriver webDriver;

	public VoicesHomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	
	
	public VoicesMainMenuPage clickMainMenuLink() {
		WebElement linkClick = webDriver.findElement(By.id("menuList"));
		linkClick.click();
		return new VoicesMainMenuPage(webDriver);
	}
	
	public VoicesEntryPage clickVoicesEntryLink() {
		WebElement linkClick = webDriver.findElement(By.linkText("Make An Entry To The Forum"));
		linkClick.click();
		return new VoicesEntryPage(webDriver);
	}
	
	public VoicesForumPage clickVoicesForumPage() {
		WebElement linkClick = webDriver.findElement(By.linkText("See Voice Entries"));
		linkClick.click();
		return new VoicesForumPage(webDriver);
	}

	
	
	
	/*------------------------------------*/
	
	
	
	
}
