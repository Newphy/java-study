package cn.newphy.jstudy.common.entity.corporation;

import cn.newphy.jstudy.common.entity.JEntity;

@SuppressWarnings("serial")
public class Group extends JEntity {
	/*
	 * ����
	 */
	private String name;
	/*
	 * ��ϵ�绰
	 */
	private String tel;
	/*
	 * ��ַ
	 */
	private String address;
	/*
	 * CEO
	 */
	private String ceo;
	

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
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel
	 *            the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the ceo
	 */
	public String getCeo() {
		return ceo;
	}

	/**
	 * @param ceo
	 *            the ceo to set
	 */
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

}
