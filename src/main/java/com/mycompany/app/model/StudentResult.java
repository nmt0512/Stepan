/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.model;

import java.util.HashMap;

/**
 *
 * @author Phong
 */
public class StudentResult {
    private Student student;

    public StudentResult(Student student, HashMap<Integer, Float> resultMap) {
        this.student = student;
        this.resultMap = resultMap;
    }
    private HashMap<Integer, Float> resultMap;

    public Student getStudent() {
        return student;
    }

    public HashMap<Integer, Float> getResultMap() {
        return resultMap;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setResultMap(HashMap<Integer, Float> resultMap) {
        this.resultMap = resultMap;
    }
     
    
    
}
