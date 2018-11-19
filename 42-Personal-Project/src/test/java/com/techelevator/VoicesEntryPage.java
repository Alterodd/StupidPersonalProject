package com.techelevator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VoicesEntryPage {

	private WebDriver webDriver;

	public VoicesEntryPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	
	public VoicesEntryPage enterFirstName(String firstName) {
		WebElement firstNameField = webDriver.findElement(By.name("firstName"));
		firstNameField.sendKeys(firstName);
		return this;
	}
	public VoicesEntryPage enterLastName(String lastName) {
		WebElement lastNameField = webDriver.findElement(By.name("lastName"));
		lastNameField.sendKeys(lastName);
		return this;
	}
	public VoicesEntryPage selectVocalRange(String vocalRange) {
		WebElement radioButton = webDriver.findElement(By.name("voiceRange"));
		radioButton.click();	
		return this;
	}
	
	public VoiceEntryResultPage clickSubmit() {
		WebElement submitButton = webDriver.findElement(By.name("submit"));
		submitButton.click();
		return new VoiceEntryResultPage(webDriver);
	}	

}
