package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.repository.AppointmentRepository;
import com.oocl.packagebooking.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

    @Autowired
    private ParcelRepository parcelRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;
}
