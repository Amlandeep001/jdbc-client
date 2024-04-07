package com.example.jdbcclient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

import com.example.jdbcclient.config.QueryConfig;
import com.example.jdbcclient.entity.Book;

@Service
public class BookServiceImpl implements BookService
{
	private final JdbcClient jdbcClient;
	private final QueryConfig queryConfig;

	public BookServiceImpl(JdbcClient jdbcClient, QueryConfig queryConfig)
	{
		this.jdbcClient = jdbcClient;
		this.queryConfig = queryConfig;
	}

	@Override
	public void create(Book book)
	{
		jdbcClient.sql(queryConfig.getInsert())
				.params(List.of(book.getId(), book.getName(), book.getTitle()))
				.update();
	}

	@Override
	public List<Book> findAll()
	{
		return jdbcClient.sql(queryConfig.getSelect())
				.query(Book.class)
				.list();
	}

	@Override
	public Optional<Book> findById(int id)
	{
		return jdbcClient.sql(queryConfig.getSleectById())
				.param("id", id)
				.query(Book.class)
				.optional();
	}

	@Override
	public void update(int id, Book book)
	{
		jdbcClient.sql(queryConfig.getUpdate())
				.params(List.of(book.getTitle(), book.getName(), id))
				.update();
	}

	@Override
	public void delete(int id)
	{
		jdbcClient.sql(queryConfig.getDelete())
				.param("id", id)
				.update();
	}

}
