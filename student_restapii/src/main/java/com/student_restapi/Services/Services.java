package com.student_restapi.Services;

import java.util.List;

import com.student_restapi.Entity.Student;

public interface Services {
	
	public Student createStudent(Student student);
	 
	public Student getStudentdetails(Long idNumber);

	public List<Student> getAllStudent();
	
	public Student updateStudent(Student student);
	
	public  void deleteStudent(Long id);

}
