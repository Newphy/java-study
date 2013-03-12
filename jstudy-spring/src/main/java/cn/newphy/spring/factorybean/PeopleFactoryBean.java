package cn.newphy.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PeopleFactoryBean implements FactoryBean<People> {

	@Override
	public People getObject() throws Exception {
		People people = new People();
		people.setAge(31);
		people.setName("Newphy");
		return people;
	}

	@Override
	public Class<?> getObjectType() {
		return People.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
