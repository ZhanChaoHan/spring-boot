package com.jachs.springbootannotation.conditional.part1;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/***
 * 
 * @author zhanchaohan
 *
 */
public class GpCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//此处进行条件判断,如果返回true,表示需要加载该配置类或者bean
		//如果当前系统是windows则通过如果不是则不通过
		String os=context.getEnvironment().getProperty("os.name");
		System.out.println(os);
		if(os.contains("Windows")) {
			return true;
		}
		return false;
	}

}
