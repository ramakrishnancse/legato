package com.in28minutes.springboot.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class StudentService{
	
	public List<Student> retrieveAllStudent(){
		
		List<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student(1,"Abc","Java"));
		studentlist.add(new Student(2,"Xyz","Phython"));
		studentlist.add(new Student(3,"Mno","Cpp"));
		studentlist.add(new Student(4,"Def","C"));
		return studentlist;
		
	}
}