package com.javalearning.transactions;

import java.io.Serial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.transactions.dto.BookingAcknoledgement;
import com.javalearning.transactions.dto.FlightBookingRequest;
import com.javalearning.transactions.service.FlightBookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionsApplication {
	@Autowired
	private FlightBookingService service;

	@PostMapping("/bookingFlightTicket")
	public BookingAcknoledgement bookingTicket(@RequestBody FlightBookingRequest request) {

		return service.bookFlghtTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(TransactionsApplication.class, args);
	}

}
