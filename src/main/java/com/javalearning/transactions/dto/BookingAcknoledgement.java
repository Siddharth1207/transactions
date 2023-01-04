package com.javalearning.transactions.dto;

import com.javalearning.transactions.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingAcknoledgement {

    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;

}
