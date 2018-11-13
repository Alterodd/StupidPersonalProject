package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class HelloController {

	@RequestMapping(path= {"/", "homepage"})
	public String displayGreeting() {
		
		return "homepage";
	}
	
}
