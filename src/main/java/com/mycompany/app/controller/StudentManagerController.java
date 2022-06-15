package com.mycompany.app.controller;

import com.mycompany.app.db.Feature;
import com.mycompany.app.db.getDBconnection;
import com.mycompany.app.model.StudentResult;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentManagerController {
    private static StudentManagerController instance;
    public static StudentManagerController getInstance() {
        if (instance == null) {
            instance = new StudentManagerController();
        }
        return instance;
    }
    private ArrayList<StudentResult> studentResult;
    Feature dao = new Feature();
    public ArrayList<StudentResult> getAllResult() {
        studentResult = dao.getAllResult();
        return studentResult;
    }
    
    public ArrayList<StudentResult> sortByName() {
        studentResult.sort((o1, o2) -> {
            var nameO1 = o1.getStudent().getTenSV().split(" ");
            var nameO2 = o2.getStudent().getTenSV().split(" ");       
            //so sanh tu cuoi cung cua ten 
            return nameO1[nameO1.length - 1].compareTo(nameO2[nameO2.length - 1]);
        });
        return studentResult;
    }
    
    
}
