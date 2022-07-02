package com.example.auth.login;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
public class LoginTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void loginTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/login"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
