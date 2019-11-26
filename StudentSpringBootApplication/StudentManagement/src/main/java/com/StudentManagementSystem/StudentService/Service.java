package com.StudentManagementSystem.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.StudentManagementSystem.Model.Student;
import com.StudentManagementSystem.StudentRepository.StudentRepository;

public class Service implements ServiceImpl {
	
	@Autowired
	StudentRepository studentrepository;

	@Override
	public List<Student> findAllStudents() {

		return studentrepository.findAll();
	}

	@Override
	public Student findById(Integer id) {
		Optional<Student> stud=studentrepository.findById(id);
		
		return stud.get();
	}

	@Override
	public Student saveaAllStudent(Student students) {
		
		return studentrepository.save(students);
	}

	@Override
	public Student updateStudents(Integer id, Student newStudent) {
	
		Optional<Student> stud=studentrepository.findById(id);
		if(stud.isPresent()) {
			Student st=stud.get();
			
			st.setName(newStudent.getName());
			Student.setCollege(Student.getCollege());
			st.setAge(newStudent.getAge());
			
			return studentrepository.save(st);
			
		}
		return null;
		
	}

	@Override
	public void deleteById(Integer id) {
		Optional<Student> st=studentrepository.findById(id);
		if(st.isPresent()) {
		studentrepository.deleteById(id);
		}
		System.out.println("No available Value");
	}

	@Override
	public void deleteAllStudents() {
		
		studentrepository.deleteAll();
	}

}
