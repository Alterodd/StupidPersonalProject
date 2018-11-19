package com.techelevator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VoicesMainMenuPage {

	private WebDriver webDriver;

	public VoicesMainMenuPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	public String findVoicesList() {
		return webDriver.findElement(By.id("voicesList")).getText();
	}
	public String findOpeningParagraph() {
		return webDriver.findElement(By.id("openingParagraph")).getText();
	}
	public String findBassDiv() {
		return webDriver.findElement(By.id("bassRange")).getText();
	}

	public String findFourm()  {
		return webDriver.findElement(By.id("forum")).getText();
	}
	
	public String findOtherVoicesList() {
		return webDriver.findElement(By.id("otherVoicesList")).getText();
	}
	public String findBariDiv() {

		return webDriver.findElement(By.id("baritoneRange")).getText();
	}
	
	
	
	
	
}
