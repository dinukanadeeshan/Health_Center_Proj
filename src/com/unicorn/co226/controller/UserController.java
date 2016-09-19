/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author K. A. Dinuka Nadeeshan - dinuka.nadeeshan1993@gmail.com
 */
public class UserController {
    public static boolean authUser(User user) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM User WHERE userName = ? AND password = password(?)";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        statement.setString(1, user.getUserName());
        statement.setString(2, user.getPassword());
        return statement.executeQuery().next();
    }
}
