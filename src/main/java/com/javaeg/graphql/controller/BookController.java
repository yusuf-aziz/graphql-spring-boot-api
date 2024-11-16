package com.javaeg.graphql.controller;

import com.javaeg.graphql.entity.Book;
import com.javaeg.graphql.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@QueryMapping
	public List<Book> allBooks() {
		return bookService.getAllBooks();
	}

	@QueryMapping
	public Book bookById(@Argument Long id) {
		return bookService.getBookById(id);
	}

	@MutationMapping
	public Book addBook(@Argument String title, @Argument String author, @Argument int publicationYear) {
		return bookService.addBook(title, author, publicationYear);
	}
}
