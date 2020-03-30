package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDao;
import com.cognizant.model.Student;
@Service

public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentDao;
	@Override
	public String insert(Student student) {
		return studentDao.insert(student);
	}

	@Override
	public String delete(int id) {
		return studentDao.delete(id);
	}

	@Override
	public String update(Student student) {
		return studentDao.update(student);
	}

	@Override
	public List<Student> getAll() {
		return studentDao.getAll();
	}

}
