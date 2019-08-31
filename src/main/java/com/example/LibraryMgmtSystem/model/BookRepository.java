package com.example.LibraryMgmtSystem.model;

import com.example.LibraryMgmtSystem.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional

public interface BookRepository extends CrudRepository<Book,Long> {
}
