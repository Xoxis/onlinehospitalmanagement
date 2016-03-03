package org.onlinehospitalmanagement.databaseproject.spring.controllers;

import javax.validation.Valid;

import org.onlinehospitalmanagement.databaseproject.spring.Hospital;
import org.onlinehospitalmanagement.databaseproject.spring.services.HospitalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	private HospitalServices hospitalServices;

	@Autowired
	public void setHospitaServices(HospitalServices hospitaServices) {
		this.hospitalServices = hospitaServices;
	}

	@RequestMapping("/login")
	public String showLogin() {
		System.out.println("from login");
		return "login";
	}
	@RequestMapping("/logginIn")
	public String showLogignIn(Hospital hospital) {
		return "home";
	}
	
	@RequestMapping("/loggedout")
	public String showLoggedout() {
		return "loggedout";
	}

	@RequestMapping("/newaccount")
	public String newAccount(Model model) {
		model.addAttribute("hospital", new Hospital());
		return "newaccount";
	}

	@RequestMapping(value = "/createaccount", method = RequestMethod.POST)
	public String createAccount(@Valid Hospital hospital, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
        	return "newaccount";
        }
        hospital.setAuthority("user");
        hospital.setEnable(true);
        
        if (hospitalServices.userExist(hospital.getUsername()))
        {
        	bindingResult.rejectValue("username","duplicateuserkey.hospital.username" ,"this username already exists");
        	return "newaccount";
        }
        try{
        	hospitalServices.createAccount(hospital);
        } catch (DuplicateKeyException e){
        	bindingResult.rejectValue("username","duplicateuserkey.username" ,"this username already exists");
        	//bindingResult.rejectValue(field, errorCode, defaultMessage);
        	return "newaccount";
        }
		
		return "accountcreated";
	}
}
