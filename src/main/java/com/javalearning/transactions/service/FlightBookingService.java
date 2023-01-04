package com.javalearning.transactions.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.javalearning.transactions.dto.BookingAcknoledgement;
import com.javalearning.transactions.dto.FlightBookingRequest;
import com.javalearning.transactions.entity.PassengerInfo;
import com.javalearning.transactions.entity.PaymentInfo;
import com.javalearning.transactions.repo.PassengerInfoRepository;
import com.javalearning.transactions.repo.PaymentInfoRepository;
import com.javalearning.transactions.utils.PaymentUtils;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public BookingAcknoledgement bookFlghtTicket(FlightBookingRequest request) {

        BookingAcknoledgement bookingAcknoledgement = null;

        PassengerInfo passenger = request.getPassengerInfo();
        passenger = passengerInfoRepository.save(passenger);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCredentials(paymentInfo.getAccountNo(), passenger.getFare());

        paymentInfo.setPassengerId(passenger.getPId());
        paymentInfo.setAmount(passenger.getFare());

        paymentInfoRepository.save(paymentInfo);

        return new BookingAcknoledgement("SUCCESS", passenger.getFare(), UUID.randomUUID().toString().split("-")[0],
                passenger);

    }

}
