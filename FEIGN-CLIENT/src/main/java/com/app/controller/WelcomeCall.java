package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCall {
	@Autowired
     WelcomeFeignClient feign;
	
	@GetMapping("/feign")
	public String welcomeCall() {
		return feign.welcome();
		
	}
}
