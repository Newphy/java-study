package cn.newphy.spring.aop.aspectj;


public class Dog {
	/*
	 * <b>Note:</b>������final���η��������Ͳ������ɴ�������
	 */
	private String name;


	public static Dog createDog(String name) {
		Dog dog = new Dog();
		dog.name = name;
		return dog;
	}

	public void bark() {
		System.out.println(dog() + "���ڽ�");
	}

	public void biteBone() {
		System.out.println(dog() + "����ҧ��ͷ");
	}

	public void biteMeat() {
		System.out.println(dog() + "���ڳ���");
	}

	/**
	 * <b>note:</b>�����ڲ�����dog.name����Ϊ�������name������nullֵ
	 * @param dog
	 */
	public void bite(Dog dog) {
		System.out.println(dog() + "����ҧ����[" + dog.getName() + "]");
	}

	public void sleep() {
		System.out.println(dog() + "����˯��");
	}

	public String getName() {
		return name;
	}

	private String dog() {
		return "����[" + name + "]";
	}
}
