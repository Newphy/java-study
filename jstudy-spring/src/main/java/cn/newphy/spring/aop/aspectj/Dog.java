package cn.newphy.spring.aop.aspectj;


public class Dog {
	/*
	 * <b>Note:</b>不能用final修饰符，这样就不能生成代理类了
	 */
	private String name;


	public static Dog createDog(String name) {
		Dog dog = new Dog();
		dog.name = name;
		return dog;
	}

	public void bark() {
		System.out.println(dog() + "正在叫");
	}

	public void biteBone() {
		System.out.println(dog() + "正在咬骨头");
	}

	public void biteMeat() {
		System.out.println(dog() + "正在吃肉");
	}

	/**
	 * <b>note:</b>方法内不能用dog.name，因为代理类的name属性是null值
	 * @param dog
	 */
	public void bite(Dog dog) {
		System.out.println(dog() + "正在咬狗狗[" + dog.getName() + "]");
	}

	public void sleep() {
		System.out.println(dog() + "正在睡觉");
	}

	public String getName() {
		return name;
	}

	private String dog() {
		return "狗狗[" + name + "]";
	}
}
