package com.harish.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class FizzBuzzGameControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void fizzBuzzGameHandlerApi_NotFoundTest() throws Exception {

        mockMvc.perform(get("/fizz-buzz/{number}", 1))
                .andExpect(status().isNotFound());
    }
}