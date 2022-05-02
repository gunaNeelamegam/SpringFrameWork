package com.example.demo.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;

@Service
public class StudentService {

	static HashMap<Integer, Student> students;

	public StudentService() {
		students.put(1, new Student("guna", "guna12"));
		students.put(2, new Student("jeyakumar", "jeyakumar123"));
	}

	// allStudent
	public List<Student> allStudent() {

		List<Student> allStudent = new ArrayList<>();
		for (Student s : students.values()) {
			allStudent.add(s);
		}
		return allStudent;
	}

	// get Byusername
	public Student getByName(String name) {
		Student s = null;
		for (int i : students.keySet()) {
			String n = students.get(i).getName().toString();
			if (name.equals(n)) {
				s = students.get(i);
			}
		}
		return s;

	}

	// getById
	public Student getbyId(long id) {
		Student student = students.get(id);
		/*
		 * for (int i : students.keySet()) { if (i == id) { student = students.get(i); }
		 */return student;
	}

	public void deleteById(long id) {
		students.remove(id);
	}
}
