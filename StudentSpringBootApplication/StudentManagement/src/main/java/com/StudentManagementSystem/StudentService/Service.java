package com.StudentManagementSystem.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.StudentManagementSystem.Model.Student;
import com.StudentManagementSystem.StudentRepository.StudentRepository;

public class Service implements ServiceImpl {
	
	@Autowired
	StudentRepository studentrepository;

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student saveaAllStudent(Student students) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudents(Integer id, Student newStudent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		studentrepository.deleteById(id);
		
	}

	@Override
	public void deleteAllStudents() {
		
		studentrepository.deleteAll();
	}

}
