package com.jachs.springbootannotation.conditional.part1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/***
 * 
 * @author zhanchaohan
 *
 */
@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(GpCondition.class)
	public BeanClass beanClass() {
		return new BeanClass();
	}
}
