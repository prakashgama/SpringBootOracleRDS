package com.test.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.model.Book;
import com.test.test.repository.BookRepository;

@Service
public class BookService {

	@Autowired
    private BookRepository bookRepository;
	
	 
	    public Book saveBook(Book book) {
	        return bookRepository.save(book);
	    }

	    
	    public Book saveBookClass( String name, Double price) {
	    	Book b=new Book();
	    	b.setName(name);
	    	b.setPrice(price);
	    	
	        return bookRepository.save(b);
	    }
	    
	    public List<Book> findBooks() {
	        return bookRepository.findAll();
	    }


	
	    public Book findBook(int id) throws Exception {
	        Book book = bookRepository.findById(id).orElseThrow(() -> new Exception("Book not available"));
	        return book;
	    }
	
}
