package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentService {
	String insert(Student student);

	String delete(int id);

	String update(Student student);

	List<Student> getAll();

}
