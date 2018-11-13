package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCVoiceDAO implements VoiceDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCVoiceDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<Voice> getAllVoiceEntries() {
		List<Voice> allVoices = new ArrayList<>();
		String sqlSelectAllVoices = "SELECT * FROM voice_range";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllPosts);
		while(results.next()) {
			ForumPost post = new ForumPost();
			post.setId(results.getLong("id"));
			post.setUsername(results.getString("username"));
			post.setSubject(results.getString("subject"));
			post.setMessage(results.getString("message"));
			post.setDatePosted(results.getTimestamp("post_date").toLocalDateTime());
			allPosts.add(post);
		}
		return allPosts;
	}
	}

	@Override
	public void save(Voice voice) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}
