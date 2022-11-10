package com.harish.controller;

import com.harish.service.FizzBuzzGameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class FizzBuzzGameControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FizzBuzzGameService fizzBuzzGameService;

    @Test
    public void fizzBuzzGameHandlerApi_NotFoundTest() throws Exception {

        when(fizzBuzzGameService.getFizzBuzzGameOutput(1)).thenReturn("1");
        mockMvc.perform(get("/fizz-buzz/{number}", ""))
                .andExpect(status().isNotFound());
    }

    @Test
    public void fizzBuzzGameHandlerApi_FoundTest() throws Exception {

        when(fizzBuzzGameService.getFizzBuzzGameOutput(1)).thenReturn("1");
        mockMvc.perform(get("/fizz-buzz/{number}", 1))
                .andExpect(status().isOk());
    }
}