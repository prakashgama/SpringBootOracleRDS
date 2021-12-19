package com.test.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
