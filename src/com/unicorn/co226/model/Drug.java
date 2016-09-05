package com.unicorn.co226.model;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/30/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class Drug {
    private String id;
    private String brand;
    private String description;

    public Drug(){}

    public Drug(String id, String brand, String description) {
        this.id = id;
        this.brand = brand;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return id+"-"+brand+"-"+description;
    }
}
