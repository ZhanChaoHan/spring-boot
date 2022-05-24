package com.jachs.configer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class EnvironmentTest {
	@Autowired
	private Environment environment;
	
	@Test
	public void test1() {
		System.out.println(environment.getProperty("user.name"));
		System.out.println(environment.getProperty("user.age"));
		System.out.println(environment.getProperty("user.email"));
		System.out.println("-----------------------------------");
		System.out.println(environment.getProperty("com.jacjs.student.name"));
		System.out.println(environment.getProperty("com.jacjs.student.age"));
		System.out.println(environment.getProperty("com.jacjs.student.email"));
		System.out.println(environment.getProperty("word"));
	}
}
