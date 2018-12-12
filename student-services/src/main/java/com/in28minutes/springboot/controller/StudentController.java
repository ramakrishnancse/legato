package com.in28minutes.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.model.Student;
import com.in28minutes.springboot.model.StudentRegistration;
import com.in28minutes.springboot.model.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//@GetMapping("/getallstudent")
	@GetMapping("/getallstudent")
//	@ResponseBody
	public List<Student> getAllStudent(){
		return studentService.retrieveAllStudent();
		
	}
	@GetMapping("/sayhello")
	public String sayHello(){
		return "hello world";
	}
	@PutMapping("/addstudent")
	@ResponseBody
	  public Student registerStudent(@RequestBody Student student) {
	  System.out.println("In registerStudent");
	        Student stdregreply = new Student();           
	        StudentRegistration.getInstance().add(student);
	        //We are setting the below value just to reply a message back to the caller
	        stdregreply.setName(student.getName());
	        stdregreply.setAge(student.getAge());
	        stdregreply.setCourseName(student.getCourseName());
	        stdregreply.setStudentName(student.getStudentName());
	        stdregreply.setStudentId(student.getStudentId());
	        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
	     
	        return stdregreply;
	}
	/*@GetMapping("/welcomestudent")
	public ResponseEntity<Student> welcomestudent(){
		return new ResponseEntity(HttpStatus.ACCEPTED);
		
	}*/
}

