package com.pt.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pt.st.entity.Student;
import com.pt.st.service.StudService;

@Controller
public class StudentController {
	@Autowired
	StudService studService;

	@PostMapping(value = "/stud/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student saveStud(@RequestBody Student s) {
		s= studService.saveStudent(s);
		return s;

	}

	@GetMapping(value = "/stud/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAll() {
		return studService.getAllSt();

	}
}
