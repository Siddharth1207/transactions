package com.javalearning.transactions.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javalearning.transactions.entity.PassengerInfo;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
