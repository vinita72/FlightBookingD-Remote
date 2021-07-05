package com.FlightBookingSystem.FlightAdmin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors();
		http.csrf().disable();
		  http.authorizeRequests().antMatchers("/**").fullyAuthenticated()
		  .antMatchers(new String[]{"/passenger/registerpassenger", "/loginhere"}).permitAll()
		  .anyRequest()
		  .authenticated()
		  .and()
		  .httpBasic(); 
	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Java").password("$2a$04$hRZ5qVzQ6HqW.fuGzfcIxuaMEu9Cd/amavqKh8s/cfzoDDuUHGY.G").roles("ADMIN");
		//auth.userDetailsService(userDetailsService);
	}
	

	// security for all API

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable();
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().
	 * httpBasic(); }
	 */

	// security based on URL

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable();
	 * http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and
	 * ().httpBasic(); }
	 */

	// security based on ROLE
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * 
	 * http .antMatcher("/**").authorizeRequests() .antMatchers(new
	 * String[]{"/"}).permitAll() .anyRequest() .authenticated() .and()
	 * .formLogin(); }
	 */
		
	/*
	 * http.csrf().disable(); http.authorizeRequests()
	 * .antMatchers("/admin").hasRole("ADMIN") // .antMatchers("/user") //
	 * .hasAnyRole("ADMIN") .antMatchers("/admin").permitAll().and() .formLogin(); }
	 */
	

//	@Bean
//		public static BCryptPasswordEncoder passwordEncoder() {
//	    return new BCryptPasswordEncoder();
//
//		//return (BCryptPasswordEncoder) BCryptPasswordEncoder.getInstance();
//	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
	
}