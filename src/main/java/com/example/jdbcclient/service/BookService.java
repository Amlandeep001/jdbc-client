package com.example.jdbcclient.service;

import java.util.List;
import java.util.Optional;

import com.example.jdbcclient.entity.Book;

public interface BookService
{
	void create(Book book);

	List<Book> findAll();

	Optional<Book> findById(int id);

	void update(int id, Book book);

	void delete(int id);
}
