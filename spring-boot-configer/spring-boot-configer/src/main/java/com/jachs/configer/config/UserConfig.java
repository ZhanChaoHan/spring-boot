package com.jachs.configer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/***
 * 
 * @author zhanchaohan
 *
 */
@Configuration
@PropertySource("classpath:user.properties")
public class UserConfig {
	@Value("${user.name}")
	private String u_name;
	@Value("${user.age}")
	private int u_age;
	@Value("${user.email}")
	private String u_email;
	
	public UserConfig() {
		super();
	}
	public UserConfig(String u_name, int u_age, String u_email) {
		super();
		this.u_name = u_name;
		this.u_age = u_age;
		this.u_email = u_email;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	
}
