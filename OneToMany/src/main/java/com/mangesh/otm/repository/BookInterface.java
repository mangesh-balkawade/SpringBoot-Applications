package com.mangesh.otm.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mangesh.otm.entity.Book;

public interface BookInterface extends CrudRepository<Book, Integer> {
	// @Query(value = "select b from Book b left join b.author a where a.name=?1")
	@Query(value = "select * from book left join author on author.name=?1", nativeQuery = true)
	public ArrayList<Book> findBooks(String name);
//	SELECT e FROM Entity1 e
//	JOIN e.entity2 e2
//	WHERE e2.someProperty = :someValue

	public ArrayList<Book> getByauthorName(String name);
	public ArrayList<Book> getByAuthorName(String name);
	public ArrayList<Book> findByauthorName(String name);
	public ArrayList<Book> queryByauthorName(String name);
}
