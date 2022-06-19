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
public class Subject {

    private String code;
    private String name;

    public Subject(String code, String name, int creditNumber) {
        this.code = code;
        this.name = name;
        this.creditNumber = creditNumber;
    }
    private int creditNumber;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public Subject() {
    }

 }
