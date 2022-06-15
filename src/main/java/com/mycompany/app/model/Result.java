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
public class Result {

    private int maSV;
    private int maMH;
    private int Diem;

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int diem) {
        Diem = diem;
    }

    public Result(int maSV, int maMH, int diem) {
        this.maSV = maSV;
        this.maMH = maMH;
        Diem = diem;
    }

    public Result() {

    }
}
