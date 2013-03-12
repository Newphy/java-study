package cn.newphy.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JUnitSpringTemplate {

	protected ApplicationContext applicationContext;
	
	protected void loadConfigFile(String path) {
		applicationContext = new ClassPathXmlApplicationContext(path); 
	}
}
