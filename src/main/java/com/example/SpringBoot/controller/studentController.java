package com.example.SpringBoot.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.dto.student;
import com.example.SpringBoot.entity.studentEntity;
import com.example.SpringBoot.service.mailService;
import com.example.SpringBoot.service.studentService;
import com.mysql.jdbc.log.Log;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class studentController {
@Autowired
studentService service;

@Autowired
mailService mail;

@PostMapping("/add")
public void addStudent(@RequestBody student s) {
	try {
		service.add(s);
		log.info("success");
		try {
		mail.sendMail(s.getEmail(), "Student Admission", "Success");
		log.info("Mail sent");
		}
		catch(Exception e) {
			log.info("Could not sent mail");
		}
	}
	catch(Exception e) {
		log.info("failed",e);
	}
}

@GetMapping("/find/{id}")
public Optional<student> getStudent(@PathVariable long id) {
	return Optional.ofNullable(service.convertToDTO(service.find(id).orElse(null)));
}

@GetMapping("/all")
public List<studentEntity> getAll(){
	return service.getAll();
}

}
