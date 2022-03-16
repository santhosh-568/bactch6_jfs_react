package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityResource {
	
	@GetMapping("/")
	public String Security() {
		return ("<h1>Welcome to Security Startup<h1>");
	}
	@GetMapping("/user")
	public String user() {
		return("<h1>Welcome user<h1>");
		
	}
	@GetMapping("/admin")
		public String admin() {
	   return ("<h1>Welcome Admin<h1>");
			   }

}
