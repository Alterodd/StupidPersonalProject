
package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCVoiceDao implements VoiceDao {

	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCVoiceDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate((javax.sql.DataSource) dataSource);
	}
	
	
	@Override
	public List<Voice> getAllVoiceEntries() {
		List<Voice> allVoices = new ArrayList<>();
		String sqlSelectAllVoices = "SELECT * FROM voice_range";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllVoices);
		while(results.next()) {
			Voice voice = new Voice();
			voice.setVoiceRangeId(results.getLong("voice_range_id"));
			voice.setFirstName(results.getString("first_name"));
			voice.setLastName(results.getString("last_name"));
			voice.setVoiceRange(results.getString("voice_range"));
			
			allVoices.add(voice);
		}
		return allVoices;
	}


	@Override
	public void save(Voice voice) {
		Long voiceRangeId = getNextId();
		String sqlInsertVoice = "INSERT INTO voice_range (first_name, last_name, voice_range) VALUES (?, ?, ?);";
		jdbcTemplate.update(sqlInsertVoice, voice.getFirstName(), voice.getLastName(), voice.getVoiceRange());
		voice.setVoiceRangeId(voiceRangeId);
		
	}

	
	
	private Long getNextId() {
		String sqlSelectNextId = "SELECT NEXTVAL('seq_voice_range_id')";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectNextId);
		Long id = null;
		if(results.next()) {
			id = results.getLong(1);
		} else {
			throw new RuntimeException("Something strange happened, unable to select next forum post id from sequence");
		}
		return id;
	}

}

	






