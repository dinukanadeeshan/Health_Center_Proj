package com.unicorn.co226.model;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/30/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class Admission {
    private String id;
    private String examination_id;
    private String admit_date;
    private String gurdian_tele;
    private String discharge_date;

    public Admission(){}
    public Admission(String id, String examination_id, String admit_date, String gurdian_tele, String discharge_date) {
        this.setId(id);
        this.setExamination_id(examination_id);
        this.setAdmit_date(admit_date);
        this.setGurdian_tele(gurdian_tele);
        this.setDischarge_date(discharge_date);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExamination_id() {
        return examination_id;
    }

    public void setExamination_id(String examination_id) {
        this.examination_id = examination_id;
    }

    public String getAdmit_date() {
        return admit_date;
    }

    public void setAdmit_date(String admit_date) {
        this.admit_date = admit_date;
    }

    public String getGurdian_tele() {
        return gurdian_tele;
    }

    public void setGurdian_tele(String gurdian_tele) {
        this.gurdian_tele = gurdian_tele;
    }

    public String getDischarge_date() {
        return discharge_date;
    }

    public void setDischarge_date(String discharge_date) {
        this.discharge_date = discharge_date;
    }
}
