package com.lld.airline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline/*")
public class AirlineController {

//class->
    //1.flight  (fname,fid,departure city, arrival city, departure time, arrival time, flight status, and available seats.)
    //2.user  (id,name, booking status, and seat number)
    //3.booking (booking_no,finfo,userinfo,booking status,payment)
    //4.staff(sname,sid)

    //functionalities
    //1.flight add/delete/edit
    //2.user  (id,name, booking status, and seat number)
    //3.search flight
    //4.book (check avalability)
    //5.cancel
    //6.view reservation
    //7.generate reports


}
