/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.model;

/**
 *
 * @author leduc
 */
public class Student {

    private int maSV;
    private String tenSV;
    private String gioitinh;
    private String que;
    private String lop;
    private String ngaysinh;

    public Student(int maSV, String tenSV, String gioitinh, String que, String lop, String ngaysinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioitinh = gioitinh;
        this.que = que;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
    }

    public Student() {

    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

}
