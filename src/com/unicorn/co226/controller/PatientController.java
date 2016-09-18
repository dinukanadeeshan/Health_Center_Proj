package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Patient;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/31/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class PatientController {
    public static int addPatient(Patient patient) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO patient values(?,?,?,year(now()) - year(?),?)";

        PreparedStatement pre_stm = DBConnection.getInstance().getConnection().prepareStatement(query);

        pre_stm.setString(1,patient.getId());
        pre_stm.setString(2,patient.getName());
        pre_stm.setString(3,patient.getAddress());
        pre_stm.setString(4, patient.getDob());
        pre_stm.setString(5,patient.getDob()); 
        
        return pre_stm.executeUpdate();

    }
}
