package com.mycompany.app.db;

import com.mycompany.app.model.Student;
import java.util.Vector;

public interface iFeature {

    Vector findPointByID(int maSV);

    void updateStudent(Student stu);
    
   
}
