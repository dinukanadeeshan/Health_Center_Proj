/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unicorn.co226.model;

/**
 *
 * @author K. A. Dinuka Nadeeshan - dinuka.nadeeshan1993@gmail.com
 */
public class WaitingListItem {
    private Student student;
    private boolean hasFever;
    private boolean isUrgent;

    public WaitingListItem() {
    }

    public WaitingListItem(Student student, boolean hasFever, boolean isUrgent) {
        this.student = student;
        this.hasFever = hasFever;
        this.isUrgent = isUrgent;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean hasFever() {
        return hasFever;
    }

    public void setHasFever(boolean hasFever) {
        this.hasFever = hasFever;
    }

    @Override
    public String toString() {
        return student.getRegNo()+" - "+student.getPatient().getName();
    }
    
    
}
