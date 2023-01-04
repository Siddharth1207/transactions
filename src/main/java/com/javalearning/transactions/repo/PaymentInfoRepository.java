package com.javalearning.transactions.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearning.transactions.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
