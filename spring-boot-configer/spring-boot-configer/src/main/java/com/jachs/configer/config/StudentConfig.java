package com.jachs.configer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/***
 * 
 * @author zhanchaohan
 *
 */
@Component
@PropertySource("classpath:student.properties")
@ConfigurationProperties(prefix="com.jacjs.student")
public class StudentConfig {
	private String name;
	private int age;
	private String email;
	private String word;
	
	public StudentConfig() {
		super();
	}
	public StudentConfig(String name, int age, String email, String word) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.word = word;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
}
