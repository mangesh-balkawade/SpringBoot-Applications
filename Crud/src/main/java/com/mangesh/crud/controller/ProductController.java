package com.mangesh.crud.controller;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangesh.crud.entity.Product;
import com.mangesh.crud.exception.ProductException;
import com.mangesh.crud.service.ProductServiceImpl;

@RestController
@RequestMapping(value = "product")
public class ProductController 
{
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	

	
	@GetMapping(value = "/countProducts")
	public ResponseEntity<String> countProduct()
	{
	    
		Integer iret= this.productServiceImpl.getCount();
		LogFactory.getLog(getClass()).info(iret+"controller");
		return new ResponseEntity<String>("hi"+iret,HttpStatus.OK);
	}

	@GetMapping(value = "/getProductById/{id}")
	public ResponseEntity<Product> findProductById(@PathVariable int id) throws ProductException
	{
		return new ResponseEntity<Product>(this.productServiceImpl.getById(id),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts() throws ProductException
	{
		return new ResponseEntity<List<Product>>(this.productServiceImpl.getAllProduct(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getProductInBetweenPrice/{start}/{end}")
	public ResponseEntity<List<Product>> findByPriceBetween(@PathVariable int start,@PathVariable int end)
	{
		return new ResponseEntity<List<Product>>(this.productServiceImpl.findByPriceBetween(start, end),HttpStatus.OK);
	}
	
	@PostMapping(value = "/addProduct")
	public ResponseEntity<Integer> addProduct(@RequestBody Product product) throws ProductException
	{
		return new ResponseEntity<Integer>(this.productServiceImpl.addProduct(product),HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/addAllProduct")
	public ResponseEntity<String> addAllProduct(@RequestBody List<Product> proList) throws ProductException
	{
		return new ResponseEntity<String>(this.productServiceImpl.addProducts(proList),HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/updateProduct/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id,@RequestBody Product product) throws ProductException
	{
		return new ResponseEntity<Product>(this.productServiceImpl.updateProduct(id, product),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteProduct/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id) throws ProductException
	{
		return new ResponseEntity<String>(this.productServiceImpl.deleteProduct(id),HttpStatus.OK);
	}
}
