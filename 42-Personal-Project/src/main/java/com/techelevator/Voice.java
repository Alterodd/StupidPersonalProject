package com.techelevator;

import org.springframework.beans.factory.annotation.Autowired;

public class Voice {

	
public Long voiceRangeId;
public String firstName;
public String lastName;
public String voiceRange;


@Autowired
public Voice(Long voiceRangeId, String firstName, String lastName, String voiceRange) {
	this.voiceRangeId = voiceRangeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.voiceRange = voiceRange;
}

public Voice() { }

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getVoiceRange() {
	return voiceRange;
}
public void setVoiceRange(String voiceRange) {
	this.voiceRange = voiceRange;
}
public Long getVoiceRangeId() {
	return voiceRangeId;
}
public void setVoiceRangeId(Long voiceRangeId) {
	this.voiceRangeId = voiceRangeId;
}
	
}






