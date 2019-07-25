package com.oocl.packagebooking.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {

    @Id
    private long id;
    private String parcelNumber;
    private long appointment;

    public Appointment() {
    }

    public Appointment(long id, String parcelNumber, long appointment) {
        this.id = id;
        this.parcelNumber = parcelNumber;
        this.appointment = appointment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParcelNumber() {
        return parcelNumber;
    }

    public void setParcelNumber(String parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public long getAppointment() {
        return appointment;
    }

    public void setAppointment(long appointment) {
        this.appointment = appointment;
    }
}
