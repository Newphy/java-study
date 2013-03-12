package cn.newphy.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleFactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sample/factorybean.xml");
		People people = applicationContext.getBean(People.class);
		System.out.println(people.getName());
		
		People2 people2 = (People2)applicationContext.getBean("people2", "newphy2", 31);
		System.out.println(people2.getName() + ", " + people.getAge() + ", having a " + people2.getPhone().getName());
	}
}
