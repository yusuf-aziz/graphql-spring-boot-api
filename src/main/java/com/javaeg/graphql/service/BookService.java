package com.javaeg.graphql.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.javaeg.graphql.entity.Book;
import com.javaeg.graphql.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	public Book addBook(String title, String author, int publicationYear) {
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublicationYear(publicationYear);
		return bookRepository.save(book);
	}
}