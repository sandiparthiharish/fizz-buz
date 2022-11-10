package com.harish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzGameController {

    @GetMapping(path = "/fizz-buzz/{number}")
    public String fizzBuzzGameHandler(@PathVariable int number) {
        return String.valueOf(number);
    }
}