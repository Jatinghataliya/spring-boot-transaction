package com.springtransaction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springtransaction.entity.Book;

import java.io.Serializable;

@Repository
public interface BookRepository extends CrudRepository<Book, Serializable> {
    public Book findByBookId(int bookId);

}