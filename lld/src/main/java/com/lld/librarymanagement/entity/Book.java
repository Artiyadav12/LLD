package com.lld.librarymanagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "book")
@Entity
public class Book {

    @Column(name = "book_id")
    @Id
    private String bookId;

    @Column(name = "is_available")
    private Boolean isAvailability;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;
}
