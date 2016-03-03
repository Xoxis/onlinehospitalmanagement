package org.onlinehospitalmanagement.databaseproject.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.onlinehospitalmanagement.databaseproject.spring.Patient;
@Component("patientDAO")
public class PatientDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	
	
	public PatientDAO() {
		
	}

	@Autowired
	public void setDataSource(javax.sql.DataSource jdbc){
		this.jdbc = new NamedParameterJdbcTemplate(jdbc) ;
		System.out.println("hi");
	}
	
	public List<Patient> getPatientList(){
		String sql ="select * from patient";
		return jdbc.query(sql, new RowMapper<Patient>() {

			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
				Patient patient = new Patient();
				patient.setFirst_name(rs.getString("first_name"));
				System.out.println(rs.getString("first_name"));
				patient.setLast_name(rs.getString("last_name"));
				patient.setAddress(rs.getString("address"));
				patient.setContact_no(rs.getInt("contact_no"));
				patient.setID(3);
				return patient;
			}

		
		
		
	}
		);
	

}
}