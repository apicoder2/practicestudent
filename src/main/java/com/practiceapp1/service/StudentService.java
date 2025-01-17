package com.practiceapp1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practiceapp1.Repository.StudentRepository;
import com.practiceapp1.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;

	public void saveStudentation(Student register) {
		
		studentRepo.save(register);
		
	}

	public List<Student> getAllRegistrations() {
		List<Student> registerations = studentRepo.findAll();
		return registerations;
		
		
	}

	public void deleteRecord(Long id) {
		studentRepo.deleteById(id);
		
	}

}

