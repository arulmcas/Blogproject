package com.blogproject.address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;

    private String streetaddress;

    private String zip;

    private String landmark;

    public Address(String streetaddress, String zip, String landmark) {
        this.streetaddress = streetaddress;
        this.zip = zip;
        this.landmark = landmark;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetaddress;
    }

    public void setStreetAddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", streetAddress:'" + streetaddress + '\'' +
                ", zip:'" + zip + '\'' +
                ", landmark:'" + landmark + '\'' +
                '}';
    }
}
