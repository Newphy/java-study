package cn.newphy.spring.customtag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomtagTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("sample/customtag.xml");
		PeopleConfig config = (PeopleConfig)applicationContext.getBean("iid");
		System.out.println(config.getName());
		System.out.println(config.getAge());
	}
}
