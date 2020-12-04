package com.custom.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(  basePackages = {"com.custom"})
public class ApplicationConfig {

}
