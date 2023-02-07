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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mangesh.otm.entity.Book;
import com.mangesh.otm.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getBookByAuthorName")
	public ResponseEntity<List<Book>> getBookByAName(@RequestParam String name)
	{
		return new ResponseEntity<List<Book>>(this.bookService.getBooks(name),HttpStatus.OK);
	}

	@PostMapping(value = "/addBook")
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		return new ResponseEntity<Book>(this.bookService.addBook(book),HttpStatus.OK);
	}
	
	@GetMapping("/getBooks")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return new ResponseEntity<List<Book>>(this.bookService.getBooks(),HttpStatus.OK);
	}
	
	@PutMapping("/updateBook/{id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable int id) throws Exception
	{ 
		return new ResponseEntity<Book>(this.bookService.updateBooks(book, id),HttpStatus.OK);
	}
	
	@DeleteMapping("deleteBook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id) throws Exception
	{
		return new ResponseEntity<String>(this.bookService.deleteBook(id),HttpStatus.OK);
	}
	
}
