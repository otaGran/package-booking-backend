package com.oocl.packagebooking.controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


public class AppointmentControllerTest {
    @Autowired
    private AppointmentController appointmentController;

    private MockMvc mockMvc;

    @Test
    public void should_return_all_appointments_when_get() throws Exception{
        mockMvc.perform(get("/appointments"))
                .andDo(print());

    }


}
