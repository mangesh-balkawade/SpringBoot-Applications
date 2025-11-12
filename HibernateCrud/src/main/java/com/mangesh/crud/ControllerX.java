package com.mangesh.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerX {
	
	@Autowired
	private com.mangesh.crud.RepositoryX repo;
	
	
	@PostMapping(value = "add")
	public ResponseEntity<String> add(@RequestBody Student s)
	{
		return new ResponseEntity<String>(this.repo.add(s),HttpStatus.OK);
	}

}
