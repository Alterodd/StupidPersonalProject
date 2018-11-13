package com.techelevator;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class HelloController {

@Autowired 
private VoiceDao voiceDao;
	
	
	@RequestMapping(path= {"/", "homepage"})
	public String displayGreeting() {
		
		return "homepage";
	}
	
	@RequestMapping (path="voiceEntry", method=RequestMethod.GET) 
	public String displayVoiceEntryPage() {
		
		return "voiceEntry";
		
	}
	
	
	@RequestMapping(path="/voiceEntry", method=RequestMethod.POST)
	public String makeVoiceEntry(Voice voice) {
		voiceDao.save(voice);
		
		return "redirect:/thankYou";
		
	}
	
	
	
	
	
	
}
