package com.example.rest.controller;

import com.example.rest.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
  /*@GetMapping("/france")
  public Country france() {
    return Country.of("France", 67);
  }*/

  @GetMapping("/france")
  public ResponseEntity<Country> france() {
    Country c = Country.of("france", 67);

    return ResponseEntity
        .status(HttpStatus.ACCEPTED)
        .header("continent", "Europe")
        .header("capital", "Paris")
        .header("favourite_food", "cheese and wine")
        .body(c);
  }

  @GetMapping("/all")
  public List<Country> all() {
    Country c1 = Country.of("France", 67);
    Country c2 = Country.of("Spain", 47);
    return List.of(c1,c2);
  }
}
