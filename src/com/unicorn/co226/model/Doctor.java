package com.unicorn.co226.model;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/30/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class Doctor {
    private String id;
    private String name;
    private String address;
    private String type;
    private String []tele;

    public Doctor(){}

    public Doctor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Doctor(String id, String name, String address, String type, String[] tele) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.type = type;
        this.tele = tele;
    }

    public String[] getTele() {
        return tele;
    }

    public void setTele(String[] tele) {
        this.tele = tele;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
}
