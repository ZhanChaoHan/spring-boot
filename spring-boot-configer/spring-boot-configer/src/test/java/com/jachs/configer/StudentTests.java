package com.jachs.configer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.configer.config.StudentConfig;

/***
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class StudentTests {
	@Autowired
	private StudentConfig studentConfig;
	
	@Test
	public void test1() {
		System.out.println(studentConfig.getName());
		System.out.println(studentConfig.getAge());
		System.out.println(studentConfig.getEmail());
		System.out.println(studentConfig.getWord());
	}
}
