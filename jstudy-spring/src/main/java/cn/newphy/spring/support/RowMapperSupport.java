package cn.newphy.spring.support;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.newphy.jstudy.common.entity.Person;

public class RowMapperSupport {

	public static RowMapper<Person> personRowMapper() {
		return new RowMapper<Person>() {
			@Override
			public Person mapRow(ResultSet rs, int index) throws SQLException {
				Person person = new Person();
				person.setId(rs.getLong("id"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setGender(rs.getInt("gender"));
				person.setEmail(rs.getString("email"));
				person.setTel(rs.getString("telephone"));
				person.setAddress(rs.getString("address"));
				return person;
			}
		};
	}
}
