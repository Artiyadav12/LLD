package com.lld.librarymanagement.controller;


import com.lld.librarymanagement.entity.Book;
import com.lld.librarymanagement.entity.CheckOut;
import com.lld.librarymanagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/library/*")
public class LibraryController {

    //1. add/update/delete books
    //2. Create/Update users
    //3. show/listing all books
    //4. User search books(by title/author/bookid
    //5. User checkout books/return books
    //6. Checkout Managements(1.DisplayCheckouts(),2.GetDueDate(Book book)
    //6. Generating Reports(Generate-> User,Book,Checkout)


    @Autowired
    private LibraryService libraryService;

    @PostMapping(value = "addBook")
    public boolean addBook(@RequestBody List<Book> books){
        return libraryService.addBook(books);
    }

    @PostMapping(value = "checkout")
    public boolean checkout(@RequestBody CheckOut checkOut){
        return libraryService.checkout(checkOut);
    }
}
