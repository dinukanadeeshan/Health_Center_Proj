package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Doctor;
import com.unicorn.co226.model.Drug;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/31/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class DrugController {
    public static int addDrug(Drug drug) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO drug VALUES(?,?,?)";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(query);

        statement.setString(1,drug.getId());
        statement.setString(2,drug.getBrand());
        statement.setString(3,drug.getDescription());

        return statement.executeUpdate();
    }

    public static List<Drug> getAllDrugs() throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM drug";

        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        List<Drug> drugList = new ArrayList<Drug>();
        while (rst.next()){
            drugList.add(new Drug(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return drugList;
    }

}
