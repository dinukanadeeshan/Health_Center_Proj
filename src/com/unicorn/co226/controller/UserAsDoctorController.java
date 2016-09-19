/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Doctor;
import com.unicorn.co226.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author K. A. Dinuka Nadeeshan - dinuka.nadeeshan1993@gmail.com
 */
public class UserAsDoctorController {
    public static Doctor getDoctorForUser(User user) throws ClassNotFoundException, SQLException{
        String sql = "SELECT Doctor_id FROM DoctorAsUser WHERE User_id=(SELECT id FROM User WHERE userName = ? AND password = password(?))";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        statement.setString(1, user.getUserName());
        statement.setString(2, user.getPassword());
        ResultSet rst = statement.executeQuery();
        rst.next();
        
        return DoctorController.getDoctor(rst.getString(1));
    }
}
