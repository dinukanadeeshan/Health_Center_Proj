package com.unicorn.co226.model;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/30/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class Treatment {
    private String drug_id;
    private String examination_id;
    private String dosage;
   // private String duration;

    public Treatment(){}

    public Treatment(String drug_id, String examination_id, String dosage) {
        this.drug_id = drug_id;
        this.examination_id = examination_id;
        this.dosage = dosage;
       // this.duration = duration;
    }

    public String getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(String drug_id) {
        this.drug_id = drug_id;
    }

    public String getExamination_id() {
        return examination_id;
    }

    public void setExamination_id(String examination_id) {
        this.examination_id = examination_id;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
}
