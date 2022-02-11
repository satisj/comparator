package com.springmvcproject.base.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
	private UserDetailsService service;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(service);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.cors().disable()
		.authorizeRequests()
		.antMatchers("/adminlogin")
		.hasRole("ADMIN")
		.antMatchers("/userlogin")
		.hasAnyRole("USER","ADMIN")
		.antMatchers("/welcome")
		.hasAnyRole("USER","ADMIN")
		.antMatchers("/welcomeadmin")
		.hasRole("ADMIN")
		.antMatchers("/getdata")
		.hasAnyRole("ADMIN","USER")
		.antMatchers("/loginform").permitAll()
		.and().formLogin()
		;	
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
  
	
	
}
