package com.jachs.spring.boot.profiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootProfilesApplicationTests {
	@Value("${name}")
	private String name;
	@Value("${pwd}")
	private String pwd;
	
	@Test
	public void test1() {
		System.out.println(name);
		System.out.println(pwd);
	}

}
