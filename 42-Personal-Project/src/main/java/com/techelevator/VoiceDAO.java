package com.techelevator;

import java.util.List;

public interface VoiceDAO {

	public List<Voice> getAllVoiceEntries();
	public void save(Voice voice);
	
}
