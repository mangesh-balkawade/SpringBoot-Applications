package com.mangesh.crud.service;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.mangesh.crud.entity.Product;
import com.mangesh.crud.exception.ProductException;
import com.mangesh.crud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductSurvice{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getById(int id) throws ProductException {
		Optional<Product> op=this.productRepository.findById(id);
		Product product=op.orElseThrow(()->new ProductException("Product is not present"));
		return product;
	}

	@Override
	public List<Product> getAllProduct() throws ProductException {
		List<Product> listProducts=(List<Product>) this.productRepository.findAll();
		if(listProducts.size()==0)
			throw new ProductException("There Is No Product Is Currentaly Available");
		
		return listProducts;
	}

	@Override
	public int addProduct(Product pobj) throws ProductException {
		if(pobj==null)
			throw new ProductException("Object Is Null");
		Product pnew= this.productRepository.save(pobj);
		return pnew.getPid();
	}

	@Override
	public String addProducts(List<Product> productList) throws ProductException {
		if (productList.size()==0)
			throw new ProductException("List IS Empty");
		List<Product> li= (List<Product>)this.productRepository.saveAll(productList);
		return "Added The Element";
	}

	public List<Product> findByPriceBetween( int start, int end)
	{
		return this.productRepository.findByPriceBetween(start, end);
	}
	
	@Override
	public Product updateProduct(int id, Product pobj) throws ProductException {
		Optional<Product> op=this.productRepository.findById(id);
		Product product=op.orElseThrow(()->new ProductException("Product is not present"));
		product.setDescription(pobj.getDescription());
		product.setPrice(pobj.getPrice());
		product.setProductName(pobj.getProductName());
		this.productRepository.save(product);
		return product;
	}

	@Override
	public String deleteProduct(int id)throws ProductException {
		// TODO Auto-generated method stub
		Optional<Product> op=this.productRepository.findById(id);
		Product product=op.orElseThrow(()->new ProductException("Product is not present"));
		this.productRepository.deleteById(id);
		return "Delete The Product";
	}

	public Integer getCount() {
		// TODO Auto-generated method stub
		
		Integer iret= this.productRepository.getCount();
		LogFactory.getLog(getClass()).info(iret);
		return iret;
	}

}
