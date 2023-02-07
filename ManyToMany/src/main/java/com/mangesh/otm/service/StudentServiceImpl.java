package com.mangesh.otm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangesh.otm.entity.Student;
import com.mangesh.otm.repository.StudentRepo;

@Service
public class StudentServiceImpl {

	@Autowired
	StudentRepo studentRepo;
	
	

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		 Student newn=	this.studentRepo.save(student);
		  return newn;
	}
	
	public List<Student> getAll()
	{
		List<Student> list= (List<Student>)this.studentRepo.findAll();
		return list;
	}
	
	public String deleteStudent(int id)
	{
		this.studentRepo.deleteById(id);
		return "Deleted ";
		
	}
	
	public Student updateStudent(Student s,int id) throws Exception
	{
		Optional<Student> op= this.studentRepo.findById(id);
		Student newn=op.orElseThrow(()->new Exception("Unable to find Student "));
		newn.setCourses(s.getCourses());
		newn=this.studentRepo.save(newn);
		return newn;
	}
}
