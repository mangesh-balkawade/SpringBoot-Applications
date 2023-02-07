package com.mangesh.crud;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mangesh.crud.entity.Product;
import com.mangesh.crud.exception.ProductException;
import com.mangesh.crud.repository.ProductRepository;
import com.mangesh.crud.service.ProductServiceImpl;

@SpringBootTest
class CrudApplicationTests {
	
//	@Override
//	public Product getById(int id) throws ProductException {
//		Optional<Product> op=this.productRepository.findById(id);
//		Product product=op.orElseThrow(()->new ProductException("Product is not present"));
//		return product;
//	}
	
	@Mock
	ProductRepository productRepository;
	
	@InjectMocks
	@Autowired
	ProductServiceImpl productServiceImpl;

	@Test
	public void getByIdInvalid1()
	{
		Mockito.when(productRepository.findById(Mockito.anyInt())).thenReturn(Optional.empty());
		Exception e=Assertions.assertThrows(Exception.class, ()->this.productServiceImpl.getById(1));
		Assertions.assertEquals("Product is not present", e.getMessage());
	}
	
}
