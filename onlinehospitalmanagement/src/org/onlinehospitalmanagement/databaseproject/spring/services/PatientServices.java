package org.onlinehospitalmanagement.databaseproject.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

import org.onlinehospitalmanagement.databaseproject.spring.Patient;
import org.onlinehospitalmanagement.databaseproject.spring.dao.*;
@Component
@Service
public class PatientServices {
	
	
	public PatientServices() {
		
	}
	private PatientDAO patientDAO;
	@Autowired
	public void setDAO(PatientDAO patientDAO){
		this.patientDAO = patientDAO;
	}
	public List<Patient> getPatientList(){
		return patientDAO.getPatientList();
	}
	
	

}
