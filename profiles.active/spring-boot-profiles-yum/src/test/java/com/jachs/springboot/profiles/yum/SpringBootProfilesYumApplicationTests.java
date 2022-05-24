package com.jachs.springboot.profiles.yum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.springboot.profiles.yum.entity.User;

@SpringBootTest
class SpringBootProfilesYumApplicationTests {
	@Autowired
	private User user;
	
	
	@Test
	public void test() {
		System.out.println(user.toString());
	}

}
