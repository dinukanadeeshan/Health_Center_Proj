package com.unicorn.co226.controller;

import com.unicorn.co226.db.DBConnection;
import com.unicorn.co226.model.Patient;
import com.unicorn.co226.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public static Student getStudentByRegNo(String regNo) throws SQLException, ClassNotFoundException {
        String sql = "SELECT p.id, name, address , dob, regNo, faculty, medical FROM Student s, Patient p where s.id = p.id and regNo = ?";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        statement.setString(1,regNo);
        ResultSet rst = statement.executeQuery();
        if (rst.next()){
            return new Student(new Patient(rst.getString(1),rst.getString(2),rst.getString(3),0,rst.getString(4)),rst.getString(1),rst.getString(5),rst.getString(6),rst.getString(7));
        }
        return null;
    }
}
