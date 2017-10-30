package com.endava.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Hinciu on 29.10.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.endava")
public class HelloWorldConfiguration {
}
