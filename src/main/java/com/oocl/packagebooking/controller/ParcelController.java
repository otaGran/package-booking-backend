package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Appointment;
import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.AppointmentRepository;
import com.oocl.packagebooking.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class ParcelController {



    @Autowired
    private ParcelRepository parcelRepository;

    @GetMapping("/parcels")
    public ResponseEntity getParcel(){

        return ResponseEntity.ok(parcelRepository.findAll());
    }

    @PostMapping("/parcels")
    public ResponseEntity addparcel(@RequestBody Parcel parcel){

        return ResponseEntity.ok(parcelRepository.save(parcel));
    }
}
