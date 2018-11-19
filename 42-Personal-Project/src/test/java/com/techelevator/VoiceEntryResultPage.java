package com.techelevator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VoiceEntryResultPage {

	private WebDriver webDriver;

	public VoiceEntryResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	
public String findThankYouParagraph() {
	return webDriver.findElement(By.id("thankYou")).getText();
}
	
}
