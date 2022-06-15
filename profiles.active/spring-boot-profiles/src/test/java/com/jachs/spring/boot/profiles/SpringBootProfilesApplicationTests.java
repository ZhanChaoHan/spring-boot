package com.jachs.spring.boot.profiles;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;


/***
 * 
 * @author zhanchaohan
 *
 */
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

	@Test
	public void test2() {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringBootProfilesApplication.class);
		
		ConfigurableEnvironment environment=cac.getEnvironment();
		
		String[]  str=environment.getActiveProfiles();//返回显式为该环境激活的配置文件集
		String[] dpr=environment.getDefaultProfiles();//当未显式设置活动配置文件时，返回默认情况下要激活的配置文件集。
		
		System.out.println("ActiveProfiles---------------------------------------");
		for (String string : str) {
			System.out.println(string);
		}
		System.out.println("DefaultProfiles---------------------------------------");
		for (String string : dpr) {
			System.out.println(string);
		}
		print(environment);
		//获取配置文件信息
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("pwd"));
	}
	
	private void print(ConfigurableEnvironment environment) {
		 // 获取PropertySource键值组合的集合
		MutablePropertySources mps=environment.getPropertySources();
	    // 系统环境变量
		Map<String, Object> seMap=environment.getSystemEnvironment();
	    // 系统配置
		Map<String, Object> spMap=environment.getSystemProperties();
		
		System.out.println("PropertySources-------------------------------------");
		mps.forEach(a->{
			
			System.out.println(a);
		});
		System.out.println("SystemEnvironment-------------------------------------");
		seMap.keySet().forEach(key->{
			System.out.println(key+"\t"+seMap.get(key));
		});
		System.out.println("SystemProperties--------------------------------------");
		spMap.keySet().forEach(key->{
			System.out.println(key+"\t"+seMap.get(key));
		});
	}
}
