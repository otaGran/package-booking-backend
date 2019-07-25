package com.oocl.packagebooking.controller;

import com.google.gson.Gson;
import com.oocl.packagebooking.model.Appointment;
import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.AppointmentRepository;
import com.oocl.packagebooking.repository.ParcelRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@WebMvcTest(AppointmentController.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ParcelControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ParcelRepository parcelRepository;


    @Test
    public void should_return_all_parcels_when_get() throws Exception {
        Parcel Alex = new Parcel(0000001L,"00000001","Alex","13000000000",0);
        Parcel Lee = new Parcel(0000002L,"00000002","Lee","13000000000",0);

        List<Parcel> parcelList = new ArrayList<>();
        parcelList.add(Alex);
        parcelList.add(Lee);
        when(parcelRepository.findAll()).thenReturn(parcelList);
        mockMvc.perform(get("/parcels"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(new Gson().toJson(parcelList, List.class)));
    }
}