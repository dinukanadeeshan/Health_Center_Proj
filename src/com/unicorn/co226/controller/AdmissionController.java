package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Admission;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/31/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class AdmissionController {
    public static int addAdmission(Admission admission) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO admission(id,Examination_id,admit_date,guradian_tele) VALUES(?,?,?,?,?)";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(query);
        statement.setString(1,admission.getId());
        statement.setString(2,admission.getExamination_id());
        statement.setString(3,admission.getAdmit_date());
        statement.setString(4,admission.getGurdian_tele());
//        statement.setString(5,admission.getDischarge_date());

        return statement.executeUpdate();
    }
}
