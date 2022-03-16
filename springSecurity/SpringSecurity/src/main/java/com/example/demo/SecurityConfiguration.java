package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//setting own configuration with auth object
		auth.inMemoryAuthentication()
		    .withUser("san")
		    .password("van")
		    .roles("USER")
		    .and()
		    .withUser("suri")
		    .password("12345")
		    .roles("ADMIN");
	}
	@Bean
	public PasswordEncoder GetPasswordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		     .antMatchers("/**").hasRole("ADMIN")
		     .and()
		     .formLogin();
		     
	}
	

}
