package com.springtransaction.controller;

import com.springtransaction.entity.Book;
import com.springtransaction.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    @ResponseBody
    public Book getBookDetails(int bookId) {
        Book bookResponse = bookService.findByBookId(bookId);
        return bookResponse;
    }

    @RequestMapping(value = "/savebook", method = RequestMethod.POST)
    @ResponseBody
    public Book saveBook(@RequestBody Book book) {
        Book bookResponse = bookService.saveBook(book);
        return bookResponse;
    }
}