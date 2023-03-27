/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.user;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Haru
 */

public class daouser {
     private static daouser instance;
    user account = new user();

    public daouser() {
        
    }

    public static daouser getInstance() {
        if (instance == null) {
            instance = new daouser();
        }
        return instance;
    }

    public static void setInstance(daouser instance) {
        daouser.instance = instance;
    }

    public static List<user> getAllND() throws SQLException, ClassNotFoundException {
        List<user> a = new ArrayList<>();
        //--- Kết nối CSDL, lấy dữ liệu
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from NguoiDung";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        //-- Xử lý kết quả trả về
        while (rs.next()) {
            user ndx = new user();
            ndx.setId(rs.getInt("id"));
            ndx.setTaikhoan(rs.getString("taikhoan"));
            ndx.setMatkhau(rs.getString("matkhau"));
            a.add(ndx);
        }
        return a;
    }
    public user Getuser(){
        return account;
        
    }
    
    public static List<user> getOneND(String _taikhoan, String _pass) throws SQLException, ClassNotFoundException {
        List<user> a = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        String sql = "select * from NguoiDung where taikhoan= '" + _taikhoan + "' and matkhau= '" + _pass + "'";
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while (rs.next()) {
            user ndx = new user();
            ndx.setId(rs.getInt("id"));
            ndx.setTaikhoan(rs.getString("taikhoan"));
            ndx.setMatkhau(rs.getString("matkhau"));
            ndx.setAdmin(rs.getString("quyen"));
            a.add(ndx);
        }
        return a;
    }
      public static List<user> getADMR(String _taikhoan) throws SQLException, ClassNotFoundException {
        List<user> a = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        String sql = "select * from NguoiDung where taikhoan= '" + _taikhoan + "'";
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while (rs.next()) {
            user ndx = new user();
            ndx.setId(rs.getInt("id"));
            ndx.setTaikhoan(rs.getString("taikhoan"));
            ndx.setMatkhau(rs.getString("matkhau"));
            ndx.setAdmin(rs.getString("quyen"));
            a.add(ndx);
        }
        return a;
    }
      
    public static void DeleteNV(user nv1) throws SQLException, ClassNotFoundException {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "delete from NguoiDung where id = ?";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);

        pStmt.setInt(1, nv1.getId());

        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }

    public static void InsertNV(user nv1) throws SQLException, ClassNotFoundException {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into NguoiDung(taikhoan,matkhau) values (?,?)";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.setString(1, nv1.getTaikhoan());
        pStmt.setString(2, nv1.getMatkhau());

        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }

    public static void UpdateNV(user nv1) throws SQLException, ClassNotFoundException {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "update NguoiDung set matkhau =? where id = ?";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.setString(1, nv1.getMatkhau());
        pStmt.setInt(2, nv1.getId());

        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
    public static Boolean DoiMatKhau(String tk, String pass) throws SQLException, ClassNotFoundException {
         Connection conn = tienich.EmpConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("UPDATE NguoiDung SET matkhau=? WHERE taikhoan=?");
            pstmt.setString(1, pass);
            pstmt.setString(2, tk);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        return false;
    }
    
    public static String getPass(String _taikhoan) throws SQLException, ClassNotFoundException {
        String a = "";
        Connection cnn = tienich.EmpConnection.getConnection();
        String sql = "select * from NguoiDung where taikhoan= '" + _taikhoan + "'";
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while (rs.next()) {
            a = rs.getString("matkhau");
        }
        return a;
    }
}
