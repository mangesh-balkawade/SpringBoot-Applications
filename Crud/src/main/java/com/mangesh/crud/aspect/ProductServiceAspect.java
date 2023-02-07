package com.mangesh.crud.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mangesh.crud.exception.ProductException;

@RestControllerAdvice
public class ProductServiceAspect {
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<String> productException(ProductException productException)
	{
		return new ResponseEntity<String>(productException.getMessage(),HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> normalException (Exception exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
