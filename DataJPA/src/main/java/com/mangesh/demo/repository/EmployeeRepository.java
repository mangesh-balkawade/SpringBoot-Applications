package com.mangesh.demo.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.mangesh.demo.entity.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
  
	//JPQL Query  class madhale veriable chi nav vapraychi
//	@Query("Select emp from Employee as emp where emp.name=:name")
//	public Employee getByName(@Param("name") String name);
	
	
	//NATIVE QUery sql table madhali nav vapraychi
	@Query(value="Select * from employee where name=:name",nativeQuery = true)
	public Optional<Employee> getByName(@Param("name") String name);
	
	@Query("Select Count(e.name) from Employee as e ")
	public Integer getCount();
	
	@Query(value = "Select * from employee order by name",nativeQuery = true)
	public List<Employee> getOrderByName();
	
	public List<Employee>getEmployeeDateAfter(@Param("date") LocalDate date);
	
	public Integer countByCity(String city1);
	
	@Query("select max(e.id) from employee as e ")
	public int get();
}

