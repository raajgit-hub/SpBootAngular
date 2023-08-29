package com.userreg.UserRegistration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfiguration {
//    @Autowired
//    private UserDetailsService userDetailsService;

	/*
	 * @Bean public BCryptPasswordEncoder bCryptPasswordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 * 
	 * protected void configure(HttpSecurity http) throws Exception { http
	 * .authorizeRequests() .antMatchers("/resources/**",
	 * "/registration").permitAll() .anyRequest().authenticated() .and()
	 * .formLogin() .loginPage("/login") .permitAll() .and() .logout() .permitAll();
	 * }
	 * 
	 * @Bean public AuthenticationManager customAuthenticationManager() throws
	 * Exception { return customAuthenticationManager(); }
	 * 
	 * 
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 * throws Exception {
	 * auth.userDetailsService(userDetailsService).passwordEncoder(
	 * bCryptPasswordEncoder()); }
	 */
}