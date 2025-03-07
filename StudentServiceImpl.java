package com.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.entity.Student;
import com.crud.exception.StudentException;
import com.crud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository)
	{
		this.repository=repository;
	}
	
	@Override
	public Student saveStudent(Student s) {
		return repository.save(s);
	}

	@Override
	public Student getById(int id) {
		return repository.findById(id).orElseThrow(()-> new StudentException("Student","Id", id));
	}

	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	@Override
	public Student updateStudent(Student s, int id) {
		Student existingStd=repository.findById(id).orElseThrow(()-> new StudentException("Student","Id",id));
		existingStd.setFirstName(s.getFirstName());
		existingStd.setLastName(s.getLastName());
		existingStd.setEmail(s.getEmail());
		existingStd.setAddress(s.getAddress());
		existingStd.setCity(s.getCity());
		return repository.save(existingStd);
	}

	@Override
	public void deleteStudent(int id) {
		repository.findById(id).orElseThrow(()-> new StudentException("Student", "Id", id));
		repository.deleteById(id);
		
	}

}
