/**
 * 
 */
package com.siva.spring.core.annotations.beans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author siva
 *
 */

@Configuration
@ComponentScan(basePackages = "com.siva.spring.core.annotations.beans")
@PropertySource({ "classpath:driver.properties", "classpath:passanger.properties", "classpath:trip.properties" })
public class AppConfig {

}
