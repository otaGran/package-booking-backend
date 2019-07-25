package com.oocl.packagebooking.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Parcel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String parcelNumber;
    private String addressee;
    private String tel;
    private int status;

    public long getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(long appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    private long appointmentTime;

    public Parcel() {
    }

    public Parcel(long id, String parcelNumber, String addressee, String tel, int status) {
        this.id = id;
        this.parcelNumber = parcelNumber;
        this.addressee = addressee;
        this.tel = tel;
        this.status = status;
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

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
