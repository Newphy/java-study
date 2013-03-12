package cn.newphy.thirdparty.jackson;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;

public class Company {
	private String name;
	private String url;
	private Date registDate;
	private String owner;
	private List<Department> departments = Lists.newArrayList();

	public static Company create() {
		Company company = new Company();
		company.setName("牛飞科技发展有限公司");
		company.setOwner("Newphy");
		company.setRegistDate(new Date());
		company.setUrl("http://www.newphy.cn");
		company.getDepartments().add(Department.create("技术部"));
		company.getDepartments().add(Department.create("销售部"));
		return company;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the registDate
	 */
	public Date getRegistDate() {
		return registDate;
	}

	/**
	 * @param registDate
	 *            the registDate to set
	 */
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the departments
	 */
	public List<Department> getDepartments() {
		return departments;
	}

	/**
	 * @param departments
	 *            the departments to set
	 */
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

}
