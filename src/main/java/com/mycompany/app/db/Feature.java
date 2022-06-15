package com.mycompany.app.db;

import com.mycompany.app.model.Student;
import com.mycompany.app.model.StudentResult;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Feature implements iFeature {

    @Override
    public Vector findPointByID(int maSV) {
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        Vector row = null;
        try {
            con = getDBconnection.getConnection();
            row = new Vector();
            statement = con.prepareStatement("select sv.MaSV,sv.TenSV,sv.Lop,mh.MaMH,kq.Diem "
                    + "from (Sinhvien sv join Ketqua kq on sv.MaSV=kq.MaSV) join Monhoc mh on kq.MaMH=mh.MaMH "
                    + "where sv.MaSV=? order by MaMH asc");
            statement.setInt(1, maSV);
            rs = statement.executeQuery();
            rs.next();
            row.add(rs.getInt("MaSV"));
            row.add(rs.getString("TenSV"));
            row.add(rs.getString("Lop"));
            for (int i = 1; i <= 5; i++) {
                if (rs.getInt("MaMH") == i) {
                    row.add(rs.getInt("Diem"));
                } else {
                    row.add("");
                }
                rs.next();
            }
            return row;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                return null;
            }
        }
    }

    @Override
    public void updateStudent(Student stu) {
        Connection con = null;
        Statement statement = null;
        try {
            con = getDBconnection.getConnection();
            con.setAutoCommit(false);
            statement = con.createStatement();
            statement.executeUpdate("update Sinhvien values(" + stu.getMaSV() + stu.getTenSV() + stu.getGioitinh() + stu.getQue() + stu.getLop() + ")");
            con.commit();
        } catch (Exception e) {
            if (con != null)
			try {
                con.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Feature.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public ArrayList<StudentResult> getAllResult() {
        var result = new HashMap<Integer, Float>();
        result.put(1, 4.5f);
        var studentResult = new StudentResult(new Student(0, "Thieu", "Nam", "Thai Nguyen", "CT4B", "10/12/2001"), result);
        var listStudentResult = new ArrayList<StudentResult>();
        listStudentResult.add(studentResult);
        return listStudentResult;
    }
    
    public void insert(Student s) {
        try {
            var rs = query("insert into Sinhvien values('CT01', 'THieu', 'Nam', 'Thai Nguyen', 'CT4B', '10/10/2002')" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Feature().insert(new Student());
    }
    
    public ResultSet query(String query) throws Exception {
        var con = getDBconnection.getConnection();
        var statement = con.prepareStatement(query);
        var rs = statement.executeQuery();
        return rs;
    }

}
