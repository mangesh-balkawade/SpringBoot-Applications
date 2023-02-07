package com.mangesh.demo.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mangesh.demo.entity.Employee;
import com.mangesh.demo.service.EmpService;

@RestController
@Validated
public class EmployeeController 
{
	
	@Autowired
	EmpService service;
	
	@GetMapping("getByName/{name}")
	public ResponseEntity<Employee> getByNAme(@Pattern(regexp = "[a-zA-Z]+",message = "Name should only contains alphbates")
	@PathVariable String name) throws Exception
	{
		Employee e1= this.service.findByName(name);	
		return new ResponseEntity<Employee>(e1,HttpStatus.OK);
	}
	
	@GetMapping(value = "getCount")
	public ResponseEntity<Integer> getCount()
	{
		return new ResponseEntity<Integer>(this.service.getCount(),HttpStatus.OK);
	}
	
	@GetMapping("getByOrder")
	public ResponseEntity<List<Employee>> getByOrder()
	{
		return new ResponseEntity<List<Employee>>(this.service.orderByName(),HttpStatus.OK);
	}

	@GetMapping(value = "/getAfterDate/{date}")
	public ResponseEntity<List<Employee>>getByDateAfter( @PathVariable String date)throws Exception
	{
		LocalDate dt = LocalDate.parse(date); 
	  List<Employee> list=this.service.getByDateAfter(dt);
	  return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getCityCount/{city}")
	public ResponseEntity<Integer> getByCityName(@PathVariable String city)
	{
		Integer count=this.service.getCountByCityName(city);
		return new ResponseEntity<Integer>(count,HttpStatus.OK);
	}
	
	
}

