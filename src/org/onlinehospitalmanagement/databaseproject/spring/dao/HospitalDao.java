package org.onlinehospitalmanagement.databaseproject.spring.dao;

import java.util.HashMap;
import java.util.Map;

import org.onlinehospitalmanagement.databaseproject.spring.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class HospitalDao {
	
	private static final String Object = null;
	private NamedParameterJdbcTemplate jdbc;

	public HospitalDao() {

	}

	@Autowired
	public void setDataSource(javax.sql.DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
		System.out.println("hi");
	}
	@Transactional
	public void createAccount(Hospital hospital) {
		String sql = "insert into users (username,email,password,enabled) values (:username,:email,:password,:enabled)";
		Map params = new HashMap<>();
		params.put("username", hospital.getUsername());
		params.put("email", hospital.getEmail());
		params.put("password", hospital.getPassword());
		params.put("enabled", hospital.isEnable());
		jdbc.update(sql, params);
		sql = "insert into authorities(username,authority) values (:username,:authority)";
		params = new HashMap<>();
		params.put("username", hospital.getUsername());
		params.put("authority", hospital.getAuthority());
		jdbc.update(sql, params);
		return ;
		
		
		
		
		
		
	}

	public boolean userExist(String username) {
		return jdbc.queryForObject("select count(*) from users where username=:username", new MapSqlParameterSource("username",username), Integer.class) > 0; 
		
	}

}
