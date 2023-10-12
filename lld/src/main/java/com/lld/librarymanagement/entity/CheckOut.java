package com.lld.librarymanagement.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@IdClass(UserBookMappingIds.class)
@Table(name = "user_book_mapping")
public class CheckOut {

    @Column(name = "book_id")
    @Id
    private String bookId;

    @Column(name = "user_id")
    @Id
    private String userId;

    @Column(name = "issue_time")
    private Date issueDate;

    @Column(name = "return_day")
    private Date returnDays;

    private Integer bookedDays;

    public CheckOut(String bookId, String userId, Date issueDate, Date returnDays) {
        this.bookId = bookId;
        this.userId = userId;
        this.issueDate = issueDate;
        this.returnDays = returnDays;
    }
}
