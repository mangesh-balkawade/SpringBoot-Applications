package com.mangesh.crud.service;

import java.util.List;

import com.mangesh.crud.entity.Product;
import com.mangesh.crud.exception.ProductException;

public interface ProductSurvice {
	public List<Product> findByPriceBetween( int start, int end);
	public Product getById(int id) throws ProductException;
	public List<Product> getAllProduct() throws ProductException;
	
	public int addProduct(Product pobj) throws ProductException;
	public String addProducts(List<Product> productList) throws ProductException;
	
	public Product updateProduct(int id,Product pobj) throws ProductException;
	public String deleteProduct(int id)throws ProductException;
	
}
