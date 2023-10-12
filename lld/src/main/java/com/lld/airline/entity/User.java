package com.lld.airline.entity;

import lombok.Data;

@Data
public class User {

    private String userId;
    private String userName;
    private String bookingStatus;
    private Integer seatNumber;
}
