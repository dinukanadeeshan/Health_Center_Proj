package com.unicorn.co226.model;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/30/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class Student {
    private Patient patient;
    private String id;
    private String regNo;
    private String faculty;
    private String medical;


    public Student(Patient patient, String id, String regNo, String faculty, String medical) {
        this.patient = patient;
        this.id = id;
        this.regNo = regNo;
        this.faculty = faculty;
        this.medical = medical;
    }

    public Student(){}

    public Student(String id, String regNo, String faculty) {
        this.id = id;
        this.regNo = regNo;
        this.faculty = faculty;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Student(String id, String regNo, String faculty, String medical) {
        this.id = id;
        this.regNo = regNo;
        this.faculty = faculty;
        this.medical = medical;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }
}
