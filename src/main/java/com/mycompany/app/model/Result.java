/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.model;

/**
 * @author leduc
 */
public class Result {

    private String studentCode;
    private String subjectCode;
    private float point1;
    private float point2;
    private float point3;

    public Result(String studentCode, String subjectCode, float point1, float point2, float point3) {
        this.studentCode = studentCode;
        this.subjectCode = subjectCode;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Result() {
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getSubejctCode() {
        return subjectCode;
    }

    public void setSubejctCode(String subejctCode) {
        this.subjectCode = subejctCode;
    }

    public float getPoint1() {
        return point1;
    }

    public void setPoint1(float point1) {
        this.point1 = point1;
    }

    public float getPoint2() {
        return point2;
    }

    public void setPoint2(float point2) {
        this.point2 = point2;
    }

    public float getPoint3() {
        return point3;
    }

    public void setPoint3(float point3) {
        this.point3 = point3;
    }

    /**
     * Get average point of this result
     * @return
     */
    public float getAveragePoint() {
        return (float) (point1 * 0.1 + point2 * 0.2 + point3 * 0.7);
    }
}
