package com.jachs.spring.boot.profiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

/***
 * 
 * @author zhanchaohan
 *
 */
public class PropertySourceTest {

	@Test
	public void test1() {
		Map<String,Object> map=new HashMap<>();
        map.put("name","wang");
        map.put("age",23);
        
		PropertySource ps=new MapPropertySource("testMap", map);
		
		System.out.println(ps.getProperty("name"));//wang
        System.out.println(ps.getProperty("age"));//23
        System.out.println(ps.getName());//person
        System.out.println(ps.containsProperty("class"));//false
	}
	@Test
	public void test2() throws IOException {
		Properties pr=new Properties();
		
		pr.load(SpringBootProfilesApplication.class.getResourceAsStream("/start-over.properties"));
		PropertySource ps=new PropertiesPropertySource("testMap", pr);
		
		System.out.println(ps.getName());
		System.out.println(ps.getProperty("jachs.name"));
	}
	
}