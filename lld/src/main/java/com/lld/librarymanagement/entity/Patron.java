package com.lld.librarymanagement.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity
@Data
public class Patron {
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_id")
    @Id
    private String userId;

    // private String List<Book>;

    @Column(name = "user_email")
    private String email;
}
