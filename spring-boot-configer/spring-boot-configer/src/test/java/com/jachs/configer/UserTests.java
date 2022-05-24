package com.jachs.configer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.configer.config.UserConfig;

/****
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest
class UserTests {
	@Autowired
	private UserConfig userConfig;
	
	@Test
	public void test() {
		System.out.println(userConfig.getU_name());
		System.out.println(userConfig.getU_age());
		System.out.println(userConfig.getU_email());
	}
}
