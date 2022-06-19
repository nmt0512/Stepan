/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app.controller;

import com.mycompany.app.db.Feature;

/**
 * @author Admin
 */
public class LoginController {
    private LoginController() {

    }

    private static LoginController instance;

    public static LoginController getInstance() {
        if (instance == null) instance = new LoginController();
        return instance;
    }

    public LoginRespone login(String username, String pass) {
        return LoginRespone.SUSSCESS;
    }

    public void get() {

    }

    public static void main(String[] args) {
        Feature feature = new Feature();
    }

    public enum LoginRespone {
        SUSSCESS,
        NO_USER_FOUND_ERROR,
        DONT_KNOW_WHY_ERROR
    }

}
