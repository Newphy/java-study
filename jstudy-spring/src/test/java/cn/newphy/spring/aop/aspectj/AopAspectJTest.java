package cn.newphy.spring.aop.aspectj;

import org.junit.Before;
import org.junit.Test;

import cn.newphy.spring.test.JUnitSpringTemplate;


public class AopAspectJTest extends JUnitSpringTemplate {

	@Before
	public void setUp() {
		loadConfigFile("sample/aop-aspectj.xml");
	}
	
	@Test
	public void test() {
		Dog xiaodoudou = (Dog)applicationContext.getBean("dog", "xiaodoudou");
		Dog kimi = (Dog)applicationContext.getBean("dog", "kimi");
		
		kimi.bark();
		kimi.biteBone();
		kimi.biteMeat();
		kimi.bite(xiaodoudou);
		xiaodoudou.bite(kimi);
	}
}
