package com.StudentManagementSystem.StudentService;

import java.util.List;

import com.StudentManagementSystem.Model.Student;

public interface ServiceImpl {

List<Student> findAllStudents();//fetchall
Student findById(Integer id);//findbyid

Student saveaAllStudent(Student students);//save

Student updateStudents(Integer id,Student newStudent);

void deleteById(Integer id);//deletebyid
void deleteAllStudents();//deleteall

}
