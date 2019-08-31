package com.example.LibraryMgmtSystem.model;
import java.util.ArrayList;
import java.util.List;

public interface IBookService {

    public default List<Book> getAllBooks()
    {
        return  new ArrayList<>();

    }
    public default Book saveBookRecord(Book book){
        return null;
    }
}
