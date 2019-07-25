package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {


    @Autowired
    private AppointmentRepository appointmentRepository;



    @GetMapping("/appointments")
    public ResponseEntity getAppointment(){
        return ResponseEntity.ok(appointmentRepository.findAll());
    }
}
