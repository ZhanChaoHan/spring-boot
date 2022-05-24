package com.jachs.configer.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/***
 * 
 * @author zhanchaohan
 *
 */
@Component
@PropertySources(value = {
		@PropertySource("classpath:student.properties"),
		@PropertySource("classpath:user.properties")})
public class EnvironmentConfig {
	
}
