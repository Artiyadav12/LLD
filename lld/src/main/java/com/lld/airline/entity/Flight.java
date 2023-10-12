package com.lld.airline.entity;


import lombok.Data;

import java.sql.Date;
@Data
public class Flight {
    private String flightName;
    private String fid;
    private String departureCity;
    private String arrivalCity;
    private Date departureTime;
    private Date arrivalTime;
    private String flightStatus;
    private Integer availableSeats;
}
