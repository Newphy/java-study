package cn.newphy.spring.multidatasource;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import cn.newphy.jstudy.common.entity.Person;
import cn.newphy.niufei.spring.jdbc.JdbcTmpl;
import cn.newphy.spring.support.RowMapperSupport;

@Repository
public class PersonDao1 {
	
	@Autowired
	@Qualifier("jdbcTemplate1")
	private JdbcTmpl jdbcTemplate;
	
	/**
	 * 查询人员
	 * @param personId
	 * @return
	 */
	public Person getPerson(int personId) {
		String sql = "SELECT * FROM js_person WHERE id = ?";
		try {
			return jdbcTemplate.queryForObject(sql, new Object[] { personId },
					RowMapperSupport.personRowMapper());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	
	/**
	 * 查询人员
	 * @param personId
	 * @return
	 */
	public void savePerson(final Person person) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO js_person");
		sql.append("  (name, age, gender, email, telephone, address)");
		sql.append("VALUES");
		sql.append("  (?, ?, ?, ?, ?, ?)");
		jdbcTemplate.update(sql.toString(), new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				int i = 1;
				ps.setString(i++, person.getName());
				ps.setInt(i++, person.getAge());
				ps.setInt(i++, person.getGender());
				ps.setString(i++, person.getEmail());
				ps.setString(i++, person.getTel());
				ps.setString(i++, person.getAddress());
			}
		});
	}
	
}
