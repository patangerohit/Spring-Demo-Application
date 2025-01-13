package com.example.SpringBoot.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.dto.student;
import com.example.SpringBoot.service.studentService;
import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class studentController {
@Autowired
studentService service;

@PostMapping("/add")
public void addStudent(@RequestBody student s) {
	try {
		service.add(s);
		log.info("success");
	}
	catch(Exception e) {
		log.info("failed",e);
	}
}

@GetMapping("/find/{id}")
public Optional<student> getStudent(@PathVariable long id) {
	return Optional.ofNullable(service.convertToDTO(service.find(id).orElse(null)));
}

}
