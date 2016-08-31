package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Project - HealthCenterProj
 * Created by Dinuka Nadeeshan on 8/31/16.
 * dinuka.nadeeshan1993@gmail.com
 */
public class StudentController {
    public static int addStudent(Student student) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO student VALUES(?,?,?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        con.setAutoCommit(false);

        PreparedStatement pre_stm = con.prepareStatement(query);
        pre_stm.setString(1,student.getId());
        pre_stm.setString(2,student.getRegNo());
        pre_stm.setString(3,student.getFaculty());
        pre_stm.setString(4,student.getMedical());

        try{
            if (student.getPatient() != null){
                int res = PatientController.addPatient(student.getPatient());

                if(res > 0){
                    res = pre_stm.executeUpdate();
                    if (res > 0){
                        con.commit();

                    }else{
                        con.rollback();

                    }
                    return res;
                } else {
                    con.rollback();
                    return res;
                }
            }
            return -1;
        }catch (SQLException e){
            con.rollback();
            throw e;
        }finally {
            con.setAutoCommit(true);
        }

    }

}
