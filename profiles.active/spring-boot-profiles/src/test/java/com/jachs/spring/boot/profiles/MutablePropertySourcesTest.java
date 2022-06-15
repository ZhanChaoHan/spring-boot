package com.jachs.spring.boot.profiles;

import java.util.Iterator;
import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

/***
AbstractEnvironment数据都是存储在MutablePropertySources中的，然后对于数据的处理都交给了ConfigurablePropertyResolver。 
ConfigurablePropertyResolver是PropertySource数据对外暴露的统一处理接口，并且提供了类型转换功能。
 * @author zhanchaohan
 *
 */
@SpringBootTest
public class MutablePropertySourcesTest {
	
	@Test
	public void test1() {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringBootProfilesApplication.class);
		
		ConfigurableEnvironment environment=cac.getEnvironment();
		
		MutablePropertySources mps=environment.getPropertySources();
		
		Iterator<PropertySource<?>>ite=mps.iterator();
		
		ite.forEachRemaining(a->{
			System.out.println(a.getName()+"\t:"+a.getSource());
		});
	}
	/***
	 */
	@Test
	public void test2() {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringBootProfilesApplication.class);
		
		ConfigurableEnvironment environment=cac.getEnvironment();
		
		MutablePropertySources mps=environment.getPropertySources();
		
		Iterator<PropertySource<?>>ite=mps.iterator();
		
//		ite.forEachRemaining(a->{
//			System.out.println(a.getName());
//			
//			PropertySource ps=(PropertySource) a.getSource();
//			
//			System.out.println(ps.getName());
//		});
		
		Properties pr=new Properties();
		pr.setProperty("jhhhhh", "KKKKKK");
		
		mps.addLast(new PropertiesPropertySource("testMap", pr));
		System.out.println(environment.getProperty("jhhhhh"));
//		PropertySourcesPropertyResolver c=new PropertySourcesPropertyResolver(mps.get("configurationProperties"));
		
		
	}
}
