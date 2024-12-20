package com.example.demo.hello;

import java.util.*;
import org.springframework.stereotype.*;

@Service
public class HelloService {

	List<Student> sList = new ArrayList<Student>();
	
	public Student getStudent(String n, int a, String l) {
		return new Student(n, a, l); 
	}

	public void addStudent(String name, int age, String location) {
		sList.add(new Student(name, age, location));
	}
}
