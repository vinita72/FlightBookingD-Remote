
  package com.FlightBookingSystem.FlightPassenger.config;
  
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static
  springfox.documentation.builders.PathSelectors.regex;
  
  import springfox.documentation.builders.ApiInfoBuilder; import
  springfox.documentation.builders.RequestHandlerSelectors; import
  springfox.documentation.service.ApiInfo; import
  springfox.documentation.spi.DocumentationType; import
  springfox.documentation.spring.web.plugins.Docket; import
  springfox.documentation.swagger2.annotations.EnableSwagger2;
  
  
  @Configuration 
  public class PassengerConfig{
  
		/*
		 * @Bean public Docket productApi() { return new
		 * Docket(DocumentationType.SWAGGER_2) .select()
		 * .apis(RequestHandlerSelectors.basePackage(
		 * "com.FlightBookingSystem.FlightPassenger")) .paths(regex("/passenger.*"))
		 * .build(); }
		 */
  
	  
		
		/*
		 * @Override protected void configure(HttpSecurity http) throws Exception {
		 * 
		 * http .antMatcher("/**").authorizeRequests() .antMatchers(new String[]{"/",
		 * "/not-restricted"}).permitAll() .anyRequest().authenticated() .and()
		 * .oauth2Login(); }
		 */
		 
  }
   
 