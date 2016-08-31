package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Examination;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/31/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class ExaminationController {
    /**
     * Add new record to Examination table
     *
     * @param examination Examination model
     * @return the value that return by executeUpdate() method
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static int addExamination(Examination examination) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO examination VALUES(?,?,?,?,?,?)";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(query);
        statement.setString(1,examination.getId());
        statement.setString(2,examination.getDoctor_id());
        statement.setString(3,examination.getPatient_id());
        statement.setString(5,examination.getDisease_description());
        statement.setString(4,examination.getExamination_date());
        statement.setString(6,examination.getDoctor_decision());

        return statement.executeUpdate();


    }
}
