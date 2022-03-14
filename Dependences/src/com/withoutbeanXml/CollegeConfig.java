package com.withoutbeanXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	@Bean
	public Principal principalagain() {
	  return new Principal();
	}
	@Bean
	public College collgeBean()
	{
		College college=  new College(principalagain());
	
		
	
		return college;
	}

}
