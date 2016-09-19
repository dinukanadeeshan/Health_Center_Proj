package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Treatment;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Project - HealthCenterProj Created by Dinuka Nadeeshan on 8/31/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class TreatmentController {

    public static int addTreatment(Treatment treatment) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO treatment VALUES(?,?,?,?)";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(query);
        statement.setString(1, treatment.getDrug_id());
        statement.setString(2, treatment.getExamination_id());
        statement.setString(3, treatment.getDosage());
        statement.setString(4, "");

        return statement.executeUpdate();

    }

    public static int addTreatments(ArrayList<Treatment> treatments) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO treatment VALUES(?,?,?,?)";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(query);
        for (Treatment treatment : treatments) {

            statement.setString(1, treatment.getDrug_id());
            statement.setString(2, treatment.getExamination_id());
            statement.setString(3, treatment.getDosage());
            statement.addBatch();
        }
        
        statement.executeBatch();
        return 1;
    }
}
