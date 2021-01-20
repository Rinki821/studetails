package com.pt.st.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pt.st.entity.Student;

public interface StudService {
	List<Student> getAllSt();
	Student saveStudent(Student s);

}
