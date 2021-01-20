package com.pt.st.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.pt.st.entity.Student;
import com.pt.st.repository.StudRepository;

@Service
public class StudServiceImpl implements StudService {
	@Autowired
	StudRepository studRepository;

	@Override
	public List<Student> getAllSt() {
		return studRepository.findAll();
	}

	@Override
	public Student saveStudent(Student s) {
		return s = studRepository.save(s);
	}

}
