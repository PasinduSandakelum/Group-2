package com.example.test.demotest;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(SampleControllerTest.class)
public class SampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SampleController sampleController;

    @Test
    public void testIsOk() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/animal").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
//                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
//                .andReturn();
//                .andExpect(MockMvcResultMatchers.content().json());

    }
    @Test
    public void testNotFound() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/animals").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
//                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON_VALUE))
//                .andReturn();
//                .andExpect(MockMvcResultMatchers.content().json());

    }

}