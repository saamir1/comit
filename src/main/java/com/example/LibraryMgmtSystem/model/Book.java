package com.example.LibraryMgmtSystem.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*Model represent the database table */

@Entity

/*@Table(name = "book")*/

public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "book_title")
    @NotNull
    private String bookTitle;


    @Column(name = "isbin")
    @NotNull
    private String isbin;

    @Column(name = "authors")
    @NotNull
    private String authors;



    @Column(name = "publisher")
    @NotNull
    private String publisher;

    @Column(name = "price")
    @NotNull
    private Double price;

    @Column(name = "stock")
    @NotNull
    private Integer stock;

  /*  public Book(Long id, @NotNull String bookTitle, @NotNull String isbin, @NotNull String authors, @NotNull String publisher, @NotNull Double price, @NotNull Integer stock) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.isbin = isbin;
        this.authors = authors;

        this.publisher = publisher;
        this.price = price;
        this.stock = stock;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getIsbin() {
        return isbin;
    }

    public void setIsbin(String isbin) {
        this.isbin = isbin;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }



    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
