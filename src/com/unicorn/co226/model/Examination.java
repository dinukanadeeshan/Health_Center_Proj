package com.unicorn.co226.model;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/30/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class Examination {
    private String id;
    private String doctor_id;
    private String patient_id;
    private String examination_date;
    private String disease_description;
    private String doctor_decision;

    public Examination(String id, String doctor_id, String patient_id, String examination_date, String disease_description, String doctor_decision) {
        this.id = id;
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
        this.examination_date = examination_date;
        this.disease_description = disease_description;
        this.doctor_decision = doctor_decision;
    }

    public Examination(){}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getExamination_date() {
        return examination_date;
    }

    public void setExamination_date(String examination_date) {
        this.examination_date = examination_date;
    }

    public String getDisease_description() {
        return disease_description;
    }

    public void setDisease_description(String disease_description) {
        this.disease_description = disease_description;
    }

    public String getDoctor_decision() {
        return doctor_decision;
    }

    public void setDoctor_decision(String doctor_decision) {
        this.doctor_decision = doctor_decision;
    }
}
