package org.onlinehospitalmanagement.databaseproject.spring.controllers;

import java.util.List;

import org.onlinehospitalmanagement.databaseproject.spring.Patient;
import org.onlinehospitalmanagement.databaseproject.spring.Student;
import org.onlinehospitalmanagement.databaseproject.spring.services.PatientServices;
import org.onlinehospitalmanagement.databaseproject.spring.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;

@Controller
public class HomeController {
	
	
	public HomeController() {
		
	}

	private PatientServices patientServices;
	private StudentServices studentServices;
	@Autowired
	public void setPatientServices(PatientServices patientServices){
		this.patientServices = patientServices;
	}
	@Autowired 
	public void setStudentServices(StudentServices studentServices) {
		this.studentServices = studentServices;
	}
	

	@RequestMapping("/")
	public String showHome(){
		
		System.out.println("hi from Controller");
		return "home";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	@RequestMapping("/home")
//	public String showHome2(){
//		
//		System.out.println("hi from Controller");
//		return "home";
//	}
//	@RequestMapping("/newstudent")
//	public String newStudent(){
//		return "newstudent";
//		
//	}
//	@RequestMapping(value="/deletestudent",method=RequestMethod.POST)
//	public String deleteStudent(Model model,@RequestParam("id") String id){
//		System.out.println(id);
//		studentServices.deleteStudent(Integer.parseInt(id));
//		return "redirect:/";
//	}
//	
//	//@RequestMapping("/")
//	public String showList(Model model){
//		List<Student> students = studentServices.getStudentList();
//		model.addAttribute("students", students);
//		System.out.println("from student controller");
//		return "showlist";
//		
//	}
//	@RequestMapping("/editstudent")
//	public String editStudent(Model model,Student student){
//		System.out.println(student);
//		model.addAttribute("student", student);
//		return "editstudent";
//	}
//	@RequestMapping(value="/doneediting",method=RequestMethod.POST)
//	public String doneEditing(Model model,Student student){
//		System.out.println(student);
//		studentServices.update(student);
//		return "redirect:/";
//		
//	}
//	@RequestMapping(value="/addstudent",method=RequestMethod.POST)
//	public String addStudent(Model model,Student student){
//		System.out.println(student);
//		studentServices.addStudent(student);
//		return "redirect:/";
//		
//	}
	
	
	
}
