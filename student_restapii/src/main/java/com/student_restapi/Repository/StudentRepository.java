package com.student_restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student_restapi.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
