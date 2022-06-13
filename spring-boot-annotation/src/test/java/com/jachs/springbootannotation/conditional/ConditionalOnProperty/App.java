package com.jachs.springbootannotation.conditional.ConditionalOnProperty;

import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.jachs.springbootannotation.SpringBootAnnotationApplication;

/***
FilterType.ANNOTATION表示按照注解的方式进行过滤
FilterType.ASSIGNABLE_TYPE表示按照指定的类型进行过滤
FilterType.ASPECTJ使用ASPECTJ表达式进行过滤，但是一般不常用
FilterType.REGEX使用正则表达式进行过滤（不常用）
FilterType.CUSTOM表示使用自定义规则，这个自定义规则得要是TypeFilter的实现类
————————————————
版权声明：本文为CSDN博主「cb414」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_41043607/article/details/107591075
 * @author zhanchaohan
 *
 */
//@SpringBootTest
//@ComponentScan(basePackages = {"com.jachs.springbootannotation.conditional.ConditionalOnProperty"})
//@ComponentScan(excludeFilters = 
//{
//  @ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.jachs.springbootannotation.*") 
//})
//@ComponentScan(basePackages = "com.jachs.springbootannotation.conditional.ConditionalOnProperty.*",useDefaultFilters = false)
@ImportResource(locations = "/context.xml")
public class App {

	@Test
	public void contextLoads() {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class);
		
		PConditionConfig beanClass= cac.getBean(PConditionConfig.class);
		//看到容器中所有定义的bean的名字
        String[] names = cac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
		System.out.println(beanClass);
	}
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
//		
//		context.getEnvironment().getSystemProperties();
//		
////		context.getEnvironment().getSystemProperties().put("jachs.bean.enable", "true");
//		context.getEnvironment().getSystemEnvironment().put("jachs.bean.enable", "true");
//		ConditionConfig beanClass= context.getBean(ConditionConfig.class);
//		
//		System.out.println(beanClass);
//	}
}
