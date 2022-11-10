package com.harish.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzGameService {

    public String getFizzBuzzGameOutput(int number) {
        if(number % 3 == 0) return "fizz";
        return String.valueOf(number);
    }
}