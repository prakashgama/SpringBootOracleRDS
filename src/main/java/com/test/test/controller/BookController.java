package com.test.test.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.model.Book;
import com.test.test.service.BookService;


@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    
    @GetMapping("/saveBook")
    public Book saveBookClass(@RequestParam String name,@RequestParam Double price) {
        return bookService.saveBookClass(name,price);
    }
    
    @GetMapping
    public List<Book> findBooks() {
        return bookService.findBooks();
    }

    @GetMapping("/{id}")
    public Book findBook(@PathVariable int id) throws Exception {
        Book book = bookService.findBook(id);
        return book;
    }

}
