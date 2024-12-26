package com.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.client.model.Student;
import com.client.service.CreateService;

import jakarta.ws.rs.POST;

@RestController
public class CreateController {
	@Autowired
	CreateService cs;
	
	@Autowired
	RestTemplate rs;
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student s) {
		System.out.println(s.toString());
		return cs.addStudent(s);
	}
	@GetMapping("/getsinglestudent/{rollno}")
	public Student getSingleStudent(@PathVariable ("rollno") int rollno) {
		Student stud=cs.getSingleStudent(rollno);
		System.out.println(stud.toString());
		return stud;
	}
	
	@PutMapping("/getupdatedstudent")
	public void updateStudent(@RequestBody Student s) {
		System.out.println(s);
		cs.updateStudent(s);
	}

}
