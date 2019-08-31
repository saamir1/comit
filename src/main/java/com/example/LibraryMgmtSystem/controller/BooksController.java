package com.example.LibraryMgmtSystem.controller;


import com.example.LibraryMgmtSystem.model.Book;
import com.example.LibraryMgmtSystem.model.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class BooksController {

    @Autowired
    IBookService bookService;

    @GetMapping("/books")
    public ModelAndView getAllBooksPage() {
        List<Book> bookList = bookService.getAllBooks();
        ModelAndView mv = new ModelAndView("/allBooks");
        mv.addObject("books",bookList);
        return mv;
    }
}