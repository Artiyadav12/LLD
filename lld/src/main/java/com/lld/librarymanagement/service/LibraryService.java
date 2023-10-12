package com.lld.librarymanagement.service;

import java.util.List;

import com.lld.librarymanagement.entity.Book;
import com.lld.librarymanagement.entity.CheckOut;
import com.lld.librarymanagement.entity.Patron;

public interface LibraryService {
    boolean addBook(List<Book> books);
    Boolean checkout(CheckOut checkOut);


}
