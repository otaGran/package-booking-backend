package com.oocl.packagebooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Parcel {
    @Id
    private long id;

    private String parcelNumber;
    private String addressee;
    private String tel;
    private int status;

}
