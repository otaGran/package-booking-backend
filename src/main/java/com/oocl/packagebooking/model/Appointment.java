package com.oocl.packagebooking.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {

    @Id
    private long id;
    private String parcelNumber;
    private Date appointment;


}
