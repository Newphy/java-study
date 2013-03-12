package cn.newphy.thirdparty.jackson;

import java.util.Date;
import java.util.Random;

public class Department {

	private String name;
	private String director;
	private Date createTime;
	private String duty;

	public static Department create(String name) {
		Random rand = new Random();
		Department depart = new Department();
		depart.setName(name);
		depart.setDirector("ÕÅ" + rand.nextInt(100));
		depart.setCreateTime(new Date());
		depart.setDuty("Ö°Ôð" + rand.nextInt());
		return depart;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the duty
	 */
	public String getDuty() {
		return duty;
	}

	/**
	 * @param duty
	 *            the duty to set
	 */
	public void setDuty(String duty) {
		this.duty = duty;
	}

}
