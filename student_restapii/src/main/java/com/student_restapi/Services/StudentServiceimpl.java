package com.student_restapi.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student_restapi.Entity.Student;
import com.student_restapi.Repository.StudentRepository;

@Service
public class StudentServiceimpl implements Services {
	
	
	
	@Autowired
	private StudentRepository stdrepo;

	@Override
	public Student createStudent(Student student) {
		  Student student_save = stdrepo.save(student);
		return student_save;
	}

	@Override
	public Student getStudentdetails(Long idNumber) {
		 Optional<Student> student = stdrepo.findById(idNumber);
		 if(student.isEmpty()) {
			 throw new RuntimeException("student is not present");
		 }
		 Student  single_student = student.get();
		return single_student;
	}

	@Override
	public List<Student> getAllStudent() {
		 List<Student> listofstudent = stdrepo.findAll();
		return listofstudent;
	}

	@Override
	public Student updateStudent(Student student) {
		 Student  update = stdrepo.save(student);
		return update;
	}

	@Override
	public void  deleteStudent(Long id) {
		 stdrepo.deleteById(id);
		 
		 
	}

	 
	}

	 


