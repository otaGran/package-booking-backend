package com.oocl.packagebooking.controller;


import com.google.gson.Gson;
import com.oocl.packagebooking.model.Appointment;
import com.oocl.packagebooking.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@WebMvcTest(AppointmentController.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AppointmentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AppointmentRepository appointmentRepository;

    @Test
    public void should_return_all_appointments_when_get() throws Exception {
        Appointment Alex =new Appointment(00000001L,"0000000001",System.currentTimeMillis());
        Appointment Lee =new Appointment(00000002L,"0000000002",System.currentTimeMillis());
       List<Appointment> appointmentList = new ArrayList<>();
       appointmentList.add(Alex);
       appointmentList.add(Lee);
       when(appointmentRepository.findAll()).thenReturn(appointmentList);
        mockMvc.perform(get("/appointments"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(new Gson().toJson(appointmentList, List.class)));

    }


}
