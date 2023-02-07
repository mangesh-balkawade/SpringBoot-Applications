package com.mangesh.demo.controller;

import javax.print.DocFlavor.STRING;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {
	
	@ExceptionHandler({ConstraintViolationException.class,MethodArgumentNotValidException.class})
	public ResponseEntity<String> error1(Exception exception)
	{	
	  return new ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);	
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> error(Exception exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
	}

}

