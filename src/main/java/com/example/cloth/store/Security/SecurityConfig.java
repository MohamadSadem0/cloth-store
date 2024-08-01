//package com.example.cloth.store.Security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/api/user/**").permitAll() // Allow GET requests
//                .antMatchers(HttpMethod.POST, "/api/user").authenticated() // Require authentication for POST
//                .anyRequest().authenticated() // Require authentication for any other request
//                .and()
//                .csrf().disable(); // Disable CSRF if necessary
//    }
//}
