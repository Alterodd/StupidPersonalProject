package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class VoiceController {

	
/** NOT WORKING RIGHT NOW FOR SOME REASON. WILL CONSULT TOM/OTHERS TOMORROW @Autowired
private VoiceDao voiceDao;
	 */
	
@RequestMapping (path="voiceEntry", method=RequestMethod.GET) 
public String displayVoiceEntryPage() {
		
		return "voiceEntry";
		
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



/**@RequestMapping(path="listOfVoiceEntries", method=RequestMethod.GET)
	public String displayListOfVoiceEntries(HttpServletRequest request) {
		request.setAttribute("voiceList", voiceDao.getAllVoiceEntries());
		return "listOfVoiceEntries";
		
	}
	*/
	
	
/**	@RequestMapping(path="voiceEntry", method=RequestMethod.POST)
	public String makeVoiceEntry(Voice voice) {
		voiceDao.save(voice);
		
		return "redirect:/thankYou";
		
	}
	*/
	

	
}
