package com.company.Strategy;

public interface PayStrategy {
    boolean pay (int paymentAmount);
    void collectPaymentDetails();
}
