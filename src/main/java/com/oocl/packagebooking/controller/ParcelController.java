package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.AppointmentRepository;
import com.oocl.packagebooking.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class ParcelController {



    @Autowired
    private ParcelRepository parcelRepository;

    @GetMapping("/parcels")
    public ResponseEntity getParcel(){

        return ResponseEntity.ok(parcelRepository.findAll());
    }
}
