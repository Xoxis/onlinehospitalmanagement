package org.onlinehospitalmanagement.databaseproject.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.onlinehospitalmanagement.databaseproject.spring.Patient;
import org.onlinehospitalmanagement.databaseproject.spring.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

	private static final String Object = null;
	private NamedParameterJdbcTemplate jdbc;

	public StudentDAO() {

	}

	@Autowired
	public void setDataSource(javax.sql.DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
		System.out.println("hi");
	}

	public List<Student> getStudentList() {
		String sql = "select * from student";
		return jdbc.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setReg_no(rs.getInt("reg_no"));
				student.setCgpa(rs.getFloat("cgpa"));
				System.out.println(rs.getString("name"));
				return student;
			}

		});

	}
	
	public boolean deleteStudent(int id){
		String sql = "delete from student where id = :id";
		
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("id", id);
		 jdbc.update(sql, params);
		 System.out.println("id "+id);
		 return true;
	}

	public void update(Student student) {
		String sql = "update student set name = :name,reg_no = :reg_no,cgpa = :cgpa where id = :id";
		Map params = new HashMap<>();
		params.put("id", (student.getId()));
		params.put("name", student.getName());
		params.put("reg_no", student.getReg_no());
		params.put("cgpa", student.getCgpa());
		System.out.println(student);
		jdbc.update(sql, params);
		
	}

	public void insertStudent(Student student) {
		String sql = "insert into student (name,reg_no,cgpa) values (:name,:reg_no,:cgpa)";
		Map params = new HashMap<>();
		params.put("name", student.getName());
		params.put("reg_no", student.getReg_no());
		params.put("cgpa", student.getCgpa());
		jdbc.update(sql, params);
		
		
		
		
	}

}
