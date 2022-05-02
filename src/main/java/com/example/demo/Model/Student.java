package com.example.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private long id;
	private String name;
	private String password;

	public Student(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

}
