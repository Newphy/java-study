package cn.newphy.spring.multidatasource;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import cn.newphy.jstudy.common.entity.Person;
import cn.newphy.spring.multidatasource.separate.MDSSeparateService;
import cn.newphy.spring.test.JUnitSpringTemplate;

public class MultiDatasourceServiceTest extends JUnitSpringTemplate {

	private Person person;
	
	@Before
	public void setUp() {
		loadConfigFile("sample/multi-datasource-separate.xml");
		person = Person.createPerson();
	}
	
	@Test
	public void testSavePerson() {
		MDSSeparateService mdService = applicationContext.getBean(MDSSeparateService.class);
		try {
			mdService.savePerson1(person);
		} catch (Exception e) {
		}
		Person p1 = mdService.getPerson1(1);
		System.out.println("p1: " + p1);
		
		try {
			mdService.savePerson2(p1);
		} catch (Exception e) {
		}
		Person p2 = mdService.getPerson2(1);
		System.out.println("p2: " + p2);
	
	}
}
