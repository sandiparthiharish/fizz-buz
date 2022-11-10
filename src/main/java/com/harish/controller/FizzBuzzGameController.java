package com.harish.controller;

import com.harish.service.FizzBuzzGameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzGameController {

    private FizzBuzzGameService fizzBuzzGameService;

    public FizzBuzzGameController(FizzBuzzGameService fizzBuzzGameService) {
        this.fizzBuzzGameService = fizzBuzzGameService;
    }

    @GetMapping(path = "/fizz-buzz/{number}")
    public String fizzBuzzGameHandler(@PathVariable int number) {
        return fizzBuzzGameService.getFizzBuzzGameOutput(number);
    }
}