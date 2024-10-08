package com.student_restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student_restapi.Entity.Student;
import com.student_restapi.Services.Services;

@RestController
@RequestMapping("/acount")
public class StudentCntroller {

	
	@Autowired
	private Services service;
	
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		 Student createStudent = service.createStudent(student);
		return createStudent;
		
	}
	
	
	@GetMapping("/{idNumber}")
	public Student getStudentid(@PathVariable Long idNumber) {
		 Student student=service.getStudentdetails(idNumber);
		 return student;
	}
	
	@GetMapping("/getall")
	public List<Student> getAllStudent(){
		List<Student> student=service.getAllStudent();
		return student;
	}
	
	
	//in postman you first copy the all the data with out id then put mthod then click method
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable Long id , @RequestBody Student student) {
		student.setId(id);
		Student updateStudent = service.updateStudent(student);
	return updateStudent;
	
}

	@DeleteMapping("/delete/{id}")
	public void  delteStudent(@PathVariable Long id) {
	 service.deleteStudent(id);
	 
	}
}




















