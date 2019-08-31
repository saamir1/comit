package com.example.LibraryMgmtSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminAppController {

    @GetMapping("/admin")
    public ModelAndView getIndexpage(){
        return new ModelAndView("admin/library/index");
    }
}
