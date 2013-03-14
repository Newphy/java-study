package cn.newphy.jstudy.common.entity;


@SuppressWarnings("serial")
public class Person extends JEntity {
	/*
	 * ���
	 */
	private Long id;
	/*
	 * ����
	 */
	private String name;
	/*
	 * ����
	 */
	private int age;
	/*
	 * �Ա�
	 */
	private int gender;
	/*
	 * �绰
	 */
	private String tel;
	/*
	 * ����
	 */
	private String email;
	/*
	 * ��ַ
	 */
	private String address;
	
	
	public static Person createPerson() {
		Person person = new Person();
		person.name = "Newphy11";
		person.age = 31;
		person.gender = 1;
		person.tel = "13433112127";
		person.email = "newphy@outlook.com";
		person.address = "�������������";
		return person;
	}
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
