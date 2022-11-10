package com.harish.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzGameService {

    public String getFizzBuzzGameOutput(int number) {
        if(isMultipleOf3(number) && isMultipleOf5(number)) {
            return "fizz buzz";
        } else if(isMultipleOf3(number)) {
            return "fizz";
        } else if (isMultipleOf5(number)) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}