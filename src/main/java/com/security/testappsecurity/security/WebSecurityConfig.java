package com.security.testappsecurity.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http = http.cors().and().csrf().disable();

    http.authorizeRequests().anyRequest().authenticated();
    http.oauth2Login().defaultSuccessUrl("/test/v1/text");
    http.formLogin();
//    .defaultSuccessUrl("/test/v1/text");
  }

//  @Bean
//  public AuthenticationEntryPoint entryPoint(){
//    return new LoginUrlAuthenticationEntryPoint("/test/v1/text");
//  }
}
