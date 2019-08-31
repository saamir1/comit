package com.example.LibraryMgmtSystem.controller;


import com.example.LibraryMgmtSystem.model.Book;
import com.example.LibraryMgmtSystem.model.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AddNewBookController {

    @Autowired
    IBookService bookService;


    @GetMapping("/admin/addbook")
    public ModelAndView getIndexPage(){
        ModelAndView mv= new ModelAndView("admin/library/addbook");
        mv.addObject("book",new Book());
        return mv;
    }

    @PostMapping ("/admin/addbook")
    public ModelAndView addBookRecord(@ModelAttribute("book")Book book){
        ModelAndView mv= new ModelAndView("redirect:/admin");
        bookService.saveBookRecord(book);
        return mv;
    }


}
