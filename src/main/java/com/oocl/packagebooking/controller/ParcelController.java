package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Parcel;
import com.oocl.packagebooking.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
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

    @PatchMapping("/parcels/{parcelNumber}")
    public ResponseEntity patchparcel(@PathVariable String parcelNumber,@RequestBody Parcel parcel){
        Parcel parcel1 = parcelRepository.findByParcelNumber(parcelNumber).get(0);
        parcel1.setStatus(parcel.getStatus());
        return ResponseEntity.ok(parcelRepository.save(parcel1));
    }
}
