package com.example.LibraryMgmtSystem.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("bookService")
public class BookService implements IBookService {

    @Autowired
     BookRepository bookRepository;


    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        Iterable<Book> itr = bookRepository.findAll();
        if (null != itr) {
            for (Book book : itr) {
                books.add(book);
            }
        }
        return books;
    }


    @Override
    public Book saveBookRecord(Book book) {
        return bookRepository.save(book);
    }
}
