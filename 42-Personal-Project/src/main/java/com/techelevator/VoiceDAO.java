package com.techelevator;

import java.util.List;

public interface VoiceDao {

	public List<Voice> getAllVoiceEntries();
	public void save(Voice voice);
	
}
