package com.mangesh.otm.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.mangesh.otm.entity.Student;
import com.mangesh.otm.service.StudentServiceImpl;


@RestController
public class StudentController 
{

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@PostMapping(value = "/addStudent")
	public ResponseEntity<Student> addStudnet(@RequestBody Student student)
	{
		Student newn=this.studentServiceImpl.addStudent(student);
		return new ResponseEntity<Student>(newn,HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<Student>> geAll()
	{
	  List<Student> list=this.studentServiceImpl.getAll();
	  return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s,@PathVariable int id) throws Exception
	{
		Student newn=this.studentServiceImpl.updateStudent(s, id);
		return new ResponseEntity<Student>(newn,HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id)
	{
		String str=this.studentServiceImpl.deleteStudent(id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
}
