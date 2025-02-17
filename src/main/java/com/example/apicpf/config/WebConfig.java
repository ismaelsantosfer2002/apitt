package com.example.apicpf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT")
                .allowedOriginPatterns("*")
                .allowedHeaders("Requestor-Type", "Authorization", "Content-Type", "Accept", "Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers", "Access-Control-Allow-Origin");
    }
}
