package com.example.rest.controller.advice;

import com.example.rest.exceptions.NotEnoughMoneyException;
import com.example.rest.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

  @ExceptionHandler(NotEnoughMoneyException.class)
  public ResponseEntity< ErrorDetails > exceptionNotEnoughMoneyHandler(){
    ErrorDetails errorDetails = new ErrorDetails();
    errorDetails.setMessage("Not enough money to make the payment.");

    return ResponseEntity
        .badRequest()
        .body(errorDetails);
  }
}
