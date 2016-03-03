package org.onlinehospitalmanagement.databaseproject.spring.services;

import org.onlinehospitalmanagement.databaseproject.spring.Hospital;
import org.onlinehospitalmanagement.databaseproject.spring.dao.HospitalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalServices {
 public HospitalServices(){
	 
 }
 
 private HospitalDao hospitalDao;
 @Autowired
 public void setDao( HospitalDao hospitalDao){
	 
	 this.hospitalDao = hospitalDao;
	 
 }
 public void createAccount(Hospital hospital){
	 hospitalDao.createAccount(hospital);
	 
 }
public boolean userExist(String username) {
	return  hospitalDao.userExist(username);
	
}
 
}
