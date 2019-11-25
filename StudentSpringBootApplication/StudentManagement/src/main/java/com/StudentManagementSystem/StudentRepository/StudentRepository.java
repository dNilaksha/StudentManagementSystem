package com.StudentManagementSystem.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagementSystem.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
