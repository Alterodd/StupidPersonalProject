package com.techelevator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VoicesForumPage {

	
	private WebDriver webDriver;

	public VoicesForumPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	
	public void openForumPage() {
		webDriver.get("http://localhost:8080/42-Personal-Project/listOfVoiceEntries");
	}

	
	
	
	public int findNumberOfTables() {
		int numberOfTables = webDriver.findElements(By.id("voiceList")).size();
		return numberOfTables;
	}
	
	
}
