package com.practiceapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practiceapp1.dto.StudentDto;
import com.practiceapp1.entity.Student;
import com.practiceapp1.service.StudentService;

@Controller
public class StudentController {
       @Autowired
       private StudentService studentservice;
       
       @RequestMapping("/viewregistration")
       public String viewRegistjsp(Model model) {
    	   
    	   return "create_reg";
       }
       
//	    @PostMapping("/savereg")
//	    public String createRegistration(Student register) {
//	    	secondservice.saveStudentation(register);
//			return "create_reg";
//	    }
	    
	    
//        @PostMapping("/savereg")
//	    public String createRegistration(
//	    		@RequestParam(name="firstName") String firstname,
//	    		@RequestParam(name="lastName") String lastname,
//	    		@RequestParam(name="email") String email,
//	    		@RequestParam(name="mobile") Long mobile
//	    		) {
//	    	Student reg = new Student();
//	    	reg.setFirstName(firstname);
//	    	reg.setLastName(lastname);
//	    	reg.setEmail(email);
//	    	reg.setMobile(mobile);
//	    	secondservice.saveStudentation(reg);
//	    	return"create_reg";
//	    }

	    @RequestMapping("/savereg")
	    public String createRegistration(StudentDto dto, Model model) {
	    	Student reg = new Student();
	    	reg.setFirstName(dto.getFirstName());
	    	reg.setLastName(dto.getLastName());
	    	reg.setEmail(dto.getEmail());
	    	reg.setMobile(dto.getMobile());
	    	
	    	studentservice.saveStudentation(reg);
	    	
	    	model.addAttribute("msg", "Record is saved !");
			return "create_reg";
	    	
	    	
	    }
	    @RequestMapping("/getAllReg")
	    public String getAllRegistrations(Model model) {
	    	
	    	List<Student> registrations = studentservice.getAllRegistrations();
	    	model.addAttribute("registrations", registrations);
	    	System.out.println(registrations);
	    	
	    	return "list_reg";
	    }
	    
	    @RequestMapping("/delete")
	    public String deleteRecord(@RequestParam Long id, Model model) {
	    	studentservice.deleteRecord(id);
	    	List<Student> registrations = studentservice.getAllRegistrations();
	    	model.addAttribute("registrations", registrations);
	    	
	    	
	    	return "list_reg";
	    }
	    
       
}
