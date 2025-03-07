package com.crud.service;

import java.util.List;

import com.crud.entity.Student;

public interface StudentService {

	public Student saveStudent(Student s);
	
	public Student getById(int id);
	
	public List<Student> getAllStudent();
	
	public Student updateStudent(Student s,int id);
	
	public void deleteStudent(int id);
}
