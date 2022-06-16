package com.jachs.springbootannotation.demo.conditional.conditionalonproperty;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/***
 * @author zhanchaohan
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(App.class);
		
//		ConditionConfig beanClass= cac.getBean(ConditionConfig.class);
		//看到容器中所有定义的bean的名字
        String[] names = cac.getBeanDefinitionNames();
        for (String name : names) {
            if(name.equals("PeopleVO")) {
            	System.out.println("注入成功");
            }
        }
        
        System.exit(0);
	}
}
