package com.example.LibraryMgmtSystem.controller;
import com.example.LibraryMgmtSystem.model.Book;
import com.example.LibraryMgmtSystem.model.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AppController {

@Autowired
BookRepository bookRepository;

    @GetMapping("/")
    public ModelAndView getIndexPage(){

       Iterable<Book> itr = bookRepository.findAll();
        for (Book book : itr)
              {
                  System.out.println(book.getBookTitle());
        }
        return new ModelAndView("index");
    }
}





