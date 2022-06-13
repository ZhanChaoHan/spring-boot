package com.jachs.springbootannotation.conditional.part1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * 
 * @author zhanchaohan
 *
 */
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		BeanClass beanClass= context.getBean(BeanClass.class);
		
		System.out.println(beanClass);
	}
}
