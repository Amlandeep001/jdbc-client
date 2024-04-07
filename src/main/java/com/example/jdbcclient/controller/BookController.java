package com.example.jdbcclient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbcclient.entity.Book;
import com.example.jdbcclient.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController
{
	private final BookService bookService;

	public BookController(BookService bookService)
	{
		this.bookService = bookService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String addNewBook(@RequestBody Book book)
	{
		bookService.create(book);
		return "book added to the system";
	}

	@GetMapping
	public List<Book> getAllBooks()
	{
		return bookService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable int id)
	{
		return bookService.findById(id);
	}

	@PutMapping("/{id}")
	public String updateBook(@PathVariable int id, @RequestBody Book book)
	{
		bookService.update(id, book);
		return "book modified in system";
	}

	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable int id)
	{
		bookService.delete(id);
		return "book record removed !";
	}

}
