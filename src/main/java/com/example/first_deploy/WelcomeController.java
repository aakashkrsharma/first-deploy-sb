package com.example.first_deploy;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	@GetMapping("api/message")
	public Map<String, String> getMessageInJSON(){
		return Collections.singletonMap("message","Welcomed By Spring");
	}
	
	
//	public String getMessage() {
//		return "Welcomed by Spring";
//	}
}
