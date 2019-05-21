package com.pasindu.spring.validation.service;

import java.util.List;

import com.pasindu.spring.validation.modal.Student;

public interface StudentService {
	Student save(Student student);
	List<Student> getAll();
}
