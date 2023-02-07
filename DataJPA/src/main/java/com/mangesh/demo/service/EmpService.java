package com.mangesh.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mangesh.demo.entity.Employee;
import com.mangesh.demo.repository.EmployeeRepository;

@Service
public class EmpService 
{
	
	@Autowired
	EmployeeRepository repo;
  
	public Employee findByName(String name) throws Exception
	{
		Optional<Employee> op=this.repo.getByName(name);
		Employee e=op.orElseThrow(()-> new Exception("Employee not found"));
		return e;
	}
	
	public Integer getCount()
	{
		return this.repo.getCount();
	}
	
	public List<Employee> orderByName()
	{
		return this.repo.getOrderByName();
	}
	
	public List<Employee> getByDateAfter(LocalDate date)
	{
		try
		{
		return this.repo.getEmployeeDateAfter(date);
		}
		catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	public Integer getCountByCityName(String city)
	{
		return this.repo.countByCity(city);
	}
}
