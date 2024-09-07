package com.rradjabli.spring_custom_login_page.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .formLogin(form->form.loginPage("/login").permitAll())
                .authorizeHttpRequests(auth->
                        auth.requestMatchers("/images/**", "/css/**").permitAll()
                                .anyRequest().authenticated())
                .build();
    }
}
