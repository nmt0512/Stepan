package com.mycompany.app.db;

import com.mycompany.app.model.*;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Feature implements iFeature {

    Student student = new Student("CT0402000", "CT", "Thieu", 0, "Ha Noi", "CT4B", new Date());

    Subject csdl = new Subject("CSDL", "Cơ sở dữ liệu", 3);
    Subject tin = new Subject("THDC", "Tin học đại cương", 3);
    Subject toancc = new Subject("TA1", "Toán cao cấp A1", 4);
    public ArrayList<Subject> subjects = new ArrayList<>();

    Result csdlResult = new Result(student.getCode(), csdl.getCode(), 1, 2, 3);
    Result tinResult = new Result(student.getCode(), tin.getCode(), 5, 2, 0);
    Result toanccResult = new Result(student.getCode(), toancc.getCode(), 7, 5, 2);

   public ArrayList<Result> resultList = new ArrayList<>();


    public Feature() {
        subjects.add(csdl);
        subjects.add(tin);
        subjects.add(toancc);
        resultList.add(csdlResult);
        resultList.add(tinResult);
        resultList.add(toanccResult);
    }

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
//        Connection con = null;
//        Statement statement = null;
//        try {
//            con = getDBconnection.getConnection();
//            con.setAutoCommit(false);
//            statement = con.createStatement();
//            statement.executeUpdate("update Sinhvien values(" + stu.getMaSV() + stu.getTenSV() + stu.getGioitinh() + stu.getQue() + stu.getLop() + ")");
//            con.commit();
//        } catch (Exception e) {
//            if (con != null)
//			try {
//                con.rollback();
//            } catch (SQLException ex) {
//                e.printStackTrace();
//            }
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(Feature.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
    }
    
    public ArrayList<StudentResult> getAllResult() {
       ArrayList<StudentResult> listStudentResult = new ArrayList<>();
       listStudentResult.add(new StudentResult(student, resultList));
        return listStudentResult;
    }

    @Override
    public boolean insertStudent(Student s) {
//        try {
//            query("SET IDENTITY_INSERT Sinhvien ON");
//
//
//ResultSet rs = query("insert into Sinhvien values('CT01', 'THieu', 'Nam', 'Thai Nguyen', 'CT4B', '10/10/2002')" );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        return true;
    }

    @Override
    public Student getStudent(String code) {
        return null;
    }

    @Override
    public Department getDepartment(String code) {
        return null;
    }

    @Override
    public Subject getSubject(String code) {
        return subjects.stream().filter(subject -> subject.getCode().equals(code)).collect(Collectors.toList()).get(0) ;
    }


    public static void main(String[] args) {
        Subject a = new Feature().getSubject("CSDL");
        System.out.println(a.getCode());
    }
    
    public ResultSet query(String query) throws Exception {
        Connection con = getDBconnection.getConnection();
        PreparedStatement statement = con.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }

}
