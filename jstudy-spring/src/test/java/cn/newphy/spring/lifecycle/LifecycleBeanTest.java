package cn.newphy.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleBeanTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("sample/lifecycle.xml");
		applicationContext.registerShutdownHook();
		applicationContext.start();
		LifecycleBean lifecycle = applicationContext.getBean(LifecycleBean.class);
		System.out.println(lifecycle.getName());
		applicationContext.close();
		System.exit(-1);
	}
}
