package com.example.demo.MainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping("/allStudent")
	public void allStudent() {
		service.allStudent();
	}

	@RequestMapping("/StudentId")
	public void StudentId(long id) {
		service.getbyId(id);
	}

	@RequestMapping("/StudentName")
	public void StudentName(String name) {
		service.getByName(name);
	}
}
