package cn.newphy.spring.factorybean;

import org.springframework.beans.factory.annotation.Autowired;

public class People2 {

	@Autowired
	private Phone phone;

	private final String name;
	private final int age;

	public People2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static People2 createPeople2(String name, int age) {
		return new People2(name, age);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	
	public Phone getPhone() {
		return phone;
	}

}
