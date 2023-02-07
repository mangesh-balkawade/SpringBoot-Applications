package com.mangesh.otm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangesh.otm.entity.Book;
import com.mangesh.otm.repository.BookInterface;

@Service
public class BookService 
{

	@Autowired
	BookInterface bookInterface;
	
	public Book addBook(Book book)
	{
		Book bnew =this.bookInterface.save(book);
		return bnew;
	}
	
	public List<Book> getBooks()
	{
	    List<Book> list =  (List<Book>)this.bookInterface.findAll();
		return list;
	}
	public List<Book> getBooks(String name)
	{
	    List<Book> list =  (List<Book>)this.bookInterface.getByauthorName(name);
		return list;
	}
	
	public String deleteBook(int id) throws Exception
	{
		try
		{
			this.bookInterface.deleteById(id);
			return "Book Deleted";
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Unable to Delete");
		}
	}
	public Book updateBooks(Book book,int id) throws Exception
	{
		Optional<Book> op=this.bookInterface.findById(id);
		Book b=op.orElseThrow(()->new Exception("PLease Enter Correct Id"));
		b.setAuthor(book.getAuthor());
		b.setName(book.getName());
		b.setPrice(book.getPrice());
		Book bnew= this.bookInterface.save(b);
		return bnew;
	}
}
