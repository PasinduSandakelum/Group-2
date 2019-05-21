package com.pasindu.spring.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasindu.spring.validation.modal.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
