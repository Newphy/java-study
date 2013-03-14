package cn.newphy.spring.multidatasource.separate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.newphy.jstudy.common.entity.Person;
import cn.newphy.spring.multidatasource.PersonDao1;
import cn.newphy.spring.multidatasource.PersonDao2;
import cn.newphy.spring.multidatasource.TransactionalDB1;
import cn.newphy.spring.multidatasource.TransactionalDB2;


@Service
public class MDSSeparateService {

	@Autowired
	private PersonDao1 personDao1;
	@Autowired
	private PersonDao2 personDao2;
	
	
	/**
	 * 保存人员1
	 * 
	 * @param person
	 */
	@Transactional(value="db1TX", readOnly=false)
	public void savePerson1(Person person) {
		personDao1.savePerson(person);
	}
	
	
	@TransactionalDB1
	public void savePerson1Custom(Person person) {
		personDao1.savePerson(person);
		throw new RuntimeException();
	}
	
	
	/**
	 * 查询人员1
	 * @param personId
	 */
	public Person getPerson1(int personId) {
		return personDao1.getPerson(personId);
	}
	
	
	/**
	 * 保存人员2
	 * 
	 * @param person
	 */
	@Transactional(value="db2TX", readOnly=false)
	public void savePerson2(Person person) {
		personDao2.savePerson(person);
		throw new RuntimeException();
	}
	
	
	@TransactionalDB2
	public void savePerson2Custom(Person person) {
		personDao2.savePerson(person);
	}
	
	/**
	 * 查询人员2
	 * @param personId
	 */
	public Person getPerson2(int personId) {
		return personDao2.getPerson(personId);
	}
}
