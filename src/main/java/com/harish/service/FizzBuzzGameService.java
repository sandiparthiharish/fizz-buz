package com.harish.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzGameService {

    public String getFizzBuzzGameOutput(int number) {
        return String.valueOf(number);
    }
}