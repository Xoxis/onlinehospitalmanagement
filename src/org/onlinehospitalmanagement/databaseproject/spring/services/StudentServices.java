package org.onlinehospitalmanagement.databaseproject.spring.services;

import java.util.List;

import org.onlinehospitalmanagement.databaseproject.spring.Patient;
import org.onlinehospitalmanagement.databaseproject.spring.Student;
import org.onlinehospitalmanagement.databaseproject.spring.dao.PatientDAO;
import org.onlinehospitalmanagement.databaseproject.spring.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServices {

public StudentServices() {
		
	}
	private StudentDAO studentDAO;
	@Autowired
	public void setDAO(StudentDAO studentDAO){
		this.studentDAO = studentDAO;
	}
	public List<Student> getStudentList(){
		return studentDAO.getStudentList();
	}
	public void deleteStudent(int id){
		studentDAO.deleteStudent(id);
		
	}
	public void update(Student student) {
		studentDAO.update(student);
		
	}
	public void addStudent(Student student) {
		studentDAO.insertStudent(student);
		
	}
	
}
