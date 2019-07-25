package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Appointment;
import com.oocl.packagebooking.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class AppointmentController {


    @Autowired
    private AppointmentRepository appointmentRepository;



    @GetMapping("/appointments")
    public ResponseEntity getAppointment(){

        return ResponseEntity.ok(appointmentRepository.findAll());
    }

    @PostMapping("/appointments")
    public ResponseEntity addAppointment(@RequestBody Appointment appointment){

        return ResponseEntity.ok(appointmentRepository.save(appointment));
    }
}
