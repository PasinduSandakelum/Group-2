package com.pasindu.spring.validation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pasindu.spring.validation.modal.Student;
import com.pasindu.spring.validation.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public Student create(@Valid @RequestBody Student student) {
		return studentService.save(student);
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public List<Student> fetchAll() {
		return studentService.getAll();
	}
}
