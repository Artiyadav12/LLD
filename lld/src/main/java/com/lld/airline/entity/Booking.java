package com.lld.airline.entity;

import lombok.Data;

@Data
public class Booking {

    private String bookingNo;
    Flight finfo;
    User userinfo;
    private String bookingStatus;
    private String paymentType;
}
