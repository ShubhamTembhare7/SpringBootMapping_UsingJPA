package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/save")
	public List<Book> AddBook(@RequestBody List<Book> book) {
		 List<Book> saveAll = bookRepository.saveAll(book);
		 return saveAll;
	}
	
	@GetMapping("/getAll")
	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

}
