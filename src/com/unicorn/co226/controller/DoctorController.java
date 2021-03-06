package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Doctor;

import java.sql.Connection;
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
public class DoctorController {
    public static int addDoctor(Doctor doctor) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            String query = "INSERT INTO doctor VALUES(?,?,?,?)";
            PreparedStatement pre_stm = connection.prepareStatement(query);
            pre_stm.setString(1, doctor.getId());
            pre_stm.setString(2, doctor.getName());
            pre_stm.setString(3, doctor.getAddress());
            pre_stm.setString(4, doctor.getType());

            int res = pre_stm.executeUpdate();
            if (res > 0) {
                 query = "INSERT INTO doctor_telephone VALUES(?,?)";
                 pre_stm = connection.prepareStatement(query);
                for (String tele:doctor.getTele()) {
                   
                    pre_stm.setString(1,doctor.getId());
                    pre_stm.setString(2,tele);
                    pre_stm.addBatch();
                }

                int[] xr = pre_stm.executeBatch();
                for(int i:xr){
                    if(i <= 0){
                        connection.rollback();
                        return -1;
                    }
                }

                connection.commit();
                return 1;
            } else {
                connection.rollback();
                return -1;
            }

        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public static List<Doctor> getAllDoctors() throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM doctor";

        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
       List<Doctor> doctorList = new ArrayList<Doctor>();
        while (rst.next()){
            doctorList.add(new Doctor(rst.getString(1),rst.getString(2)));
        }
        return doctorList;
    }
    
    public static Doctor getDoctor(String id) throws SQLException, ClassNotFoundException{
        String query = "SELECT * FROM doctor WHERE id = '"+id+"'";

        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
       
       if (rst.next()){
         return   new Doctor(rst.getString(1),rst.getString(2));
        }
       return null;
    }

}
