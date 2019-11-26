package com.StudentManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	private String name;
	private static String college;
	private int age;
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
