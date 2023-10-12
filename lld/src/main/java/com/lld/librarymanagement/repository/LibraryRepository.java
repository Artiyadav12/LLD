package com.lld.librarymanagement.repository;

import com.lld.librarymanagement.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository extends CrudRepository<Book,String>{

}