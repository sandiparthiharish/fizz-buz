package com.harish.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzGameServiceTests {

    @Test
    public void getFizzBuzzGameOutput_ReturnsNumberTest() {
        FizzBuzzGameService fizzBuzzGameService = new FizzBuzzGameService();
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(1)).isEqualTo("1");
    }

    @Test
    public void getFizzBuzzGameOutput_ReturnsFizzWithInput_3Test() {
        FizzBuzzGameService fizzBuzzGameService = new FizzBuzzGameService();
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(3)).isEqualTo("fizz");
    }
}