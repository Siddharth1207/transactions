package com.javalearning.transactions.utils;

import java.util.HashMap;
import java.util.Map;

import com.javalearning.transactions.exception.InsufficientAmount;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("a1", 12000.0);
        paymentMap.put("a2", 120.0);
        paymentMap.put("a3", 130.0);
        paymentMap.put("a4", 14000.0);
    }

    public static boolean validateCredentials(String accountNumber, double paidAmount) {

        if (paidAmount > paymentMap.get(accountNumber)) {
            throw new InsufficientAmount("Insufficient amount");
        } else {
            return true;
        }
    }

}
