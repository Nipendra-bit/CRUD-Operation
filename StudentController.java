package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.service.StudentService;

@RestController
@RequestMapping("/crud")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s)
	{
		return new ResponseEntity<Student>(service.saveStudent(s),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public Student getById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s,@PathVariable int id)
	{
		return new ResponseEntity<Student>(service.updateStudent(s, id),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		service.deleteStudent(id);
		return "Student is deleted successfully";
	}
}
