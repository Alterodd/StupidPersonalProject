package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class VoiceController {

 
@Autowired
private VoiceDao voiceDao;
	
	
@RequestMapping (path="menuList", method=RequestMethod.GET) 
public String displayMenuList() {
		
		return "menuList";
		
	}


@RequestMapping(path="bass", method=RequestMethod.GET)
public String displayBassPage() {
	
	return "Bass";
}

@RequestMapping(path="baritone", method=RequestMethod.GET)
public String displayBariPage() {
	return "Baritone";
}
	
@RequestMapping(path="tenor", method=RequestMethod.GET) 
public String displayTenorPage() {
	return "Tenor";
}

@RequestMapping(path="alto", method=RequestMethod.GET) 
public String displayAltoPage() {
	return "Alto";
}

@RequestMapping(path="soprano", method=RequestMethod.GET) 
public String displaySopranoPage() {
	return "Soprano";
}

@RequestMapping(path="castrati", method=RequestMethod.GET)
public String displayCastratiPage() {
	return "Castrati";
}


@RequestMapping(path="listOfVoiceEntries", method=RequestMethod.GET)
	public String displayListOfVoiceEntries(HttpServletRequest request) {
		request.setAttribute("voiceList", voiceDao.getAllVoiceEntries());
		return "listOfVoiceEntries";
		
	}
	
@RequestMapping(path="makeVoiceEntry", method=RequestMethod.GET)
public String displayVoiceEntry() {
	
	return "makeVoiceEntry";
	
}




@RequestMapping(path="makeVoiceEntry", method=RequestMethod.POST)
	public String makeVoiceEntry(Voice voice) {
		voiceDao.save(voice);
		
		return "redirect:/thankYou";
		
	}
	
@RequestMapping(path="thankYou", method=RequestMethod.GET) 
public String displayThankYou() {
	
	return "thankYou";
}
	
}
