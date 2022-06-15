package com.jachs.spring.boot.profiles;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootTest
public class ConfigurableEnvironmentTest {
	
	@Test
	public void test1() {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringBootProfilesApplication.class);
		
		ConfigurableEnvironment environment=cac.getEnvironment();
		
		environment.setActiveProfiles("dev");
	
	
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("pwd"));
	}
}
