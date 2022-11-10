package com.harish.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzGameServiceTests {

    private FizzBuzzGameService fizzBuzzGameService;

    @Before
    public void setUp() {
        fizzBuzzGameService = new FizzBuzzGameService();
    }

    @Test
    public void getFizzBuzzGameOutput_ReturnsNumberTest() {
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(1)).isEqualTo("1");
    }

    @Test
    public void getFizzBuzzGameOutput_ReturnsFizzWithInput_3Test() {
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(3)).isEqualTo("fizz");
    }

    @Test
    public void getFizzBuzzGameOutput_ReturnsFizzWithInputMultipleOf_3Test() {
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(9)).isEqualTo("fizz");
    }

    @Test
    public void getFizzBuzzGameOutput_ReturnsBuzzWithInput_5Test() {
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(5)).isEqualTo("buzz");
    }

    @Test
    public void getFizzBuzzGameOutput_ReturnsBuzzWithInputMultipleOf_5Test() {
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(20)).isEqualTo("buzz");
    }

    @Test
    public void getFizzBuzzGameOutput_ReturnsBuzzWithInputMultipleOf_3_5Test() {
        assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(15)).isEqualTo("fizz buzz");
    }
}