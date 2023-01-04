package com.javalearning.transactions.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passenger_Info")
public class PassengerInfo {
    @Id
    @GeneratedValue
    private Long pId;
    private String name;
    private String email;
    private String source;
    private String destibation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY")
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;

}
