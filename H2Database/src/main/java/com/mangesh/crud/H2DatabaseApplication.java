package com.mangesh.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class H2DatabaseApplication {
	@Autowired
	private BookRepo bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(H2DatabaseApplication.class, args);
		
	}
	@PostMapping("/add")
	public String add(@RequestBody Book b)
	{
	Book newn	=this.bookRepo.save(b);
	System.out.println(newn.id);
	return "addes";
	}
	@GetMapping("/get")
	public List<Book> get()
	{
		List<Book>books=(List<Book>) this.bookRepo.findAll();
		System.out.println(this.bookRepo.findAll());
		return books;
	}

}
