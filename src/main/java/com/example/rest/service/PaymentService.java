package com.example.rest.service;

import com.example.rest.exceptions.NotEnoughMoneyException;
import com.example.rest.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
  public PaymentDetails processPayment() {
    throw new NotEnoughMoneyException();
  }
}
