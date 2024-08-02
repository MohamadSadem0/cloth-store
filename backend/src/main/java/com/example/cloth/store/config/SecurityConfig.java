//package com.example.cloth.store.config;
//
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
////@EnableWebSecurity
////public class SecurityConfig {
////
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .anyRequest()
////                .permitAll();
//////                .and()
//////                .httpBasic(Customizer.withDefaults());
////
////        return http.build();
////    }
////}
//
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests();
//
////                authorizeRequests()
////                .anyRequest()
////                .permitAll()  // Allow all requests without authentication
////                .and()
////                .csrf().disable();  // Disable CSRF protection for testing purposes
//
//        return http.build();
//    }
//}
