package com.mangesh.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mangesh.crud.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{
	
	  @Query("Select p from Product p where p.price between :start and :end")
	  public List<Product> findByPriceBetween(@Param("start") int start,@Param("end") int end);

	@Query("select count(p.pid) from Product as p ")  
	public Integer getCount();

}
