package com.example.first_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("api/message")
	public String getMessage() {
		return "Welcomed by Spring";
	}
}
