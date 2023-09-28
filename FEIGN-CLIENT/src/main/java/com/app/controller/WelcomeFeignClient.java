package com.app.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient("WELCOME-API")
public interface WelcomeFeignClient {

	
	@GetMapping("/welcome")
	public String welcome();
}
