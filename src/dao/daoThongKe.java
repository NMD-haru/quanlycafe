/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.menu;
import entity.thongke;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KhanhPC
 */
public class daoThongKe {
      public static List<thongke> TTTK() throws SQLException, ClassNotFoundException
   {
      List<thongke> listluong = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from bangluong,nhanvien where bangluong.manv=nhanvien.manv";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        thongke tk = new thongke();
        tk.setManv(rs.getString("manv"));
        tk.setTennv(rs.getString("tennv"));
        tk.setGioitinh(rs.getString("gioitinh"));
        tk.setQuequan(rs.getString("quequan"));
        tk.setHesoluong(rs.getFloat("hesoluong"));
        tk.setNgaysinh(rs.getDate("ngaysinh"));
        tk.setSdt(rs.getString("sdt"));
        tk.setNgaycong(rs.getInt("ngaycong"));
        tk.setLuong(rs.getFloat("luong"));
        listluong.add(tk);
        }
        return listluong;
   }  
       public static List<thongke> TKNV(String _tennv) throws SQLException, ClassNotFoundException
   {
      List<thongke> listTK = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn  
        String sql = "select * from bangluong,nhanvien where bangluong.manv=nhanvien.manv and tennv like '%"+_tennv+"%'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        thongke tk2 = new thongke();
        tk2.setManv(rs.getString("manv"));
        tk2.setTennv(rs.getString("tennv"));
        tk2.setGioitinh(rs.getString("gioitinh"));
        tk2.setQuequan(rs.getString("quequan"));
        tk2.setHesoluong(rs.getFloat("hesoluong"));
        tk2.setNgaysinh(rs.getDate("ngaysinh"));
        tk2.setSdt(rs.getString("sdt"));
        tk2.setNgaycong(rs.getInt("ngaycong"));
        tk2.setLuong(rs.getFloat("luong"));
        listTK.add(tk2);
        }       
        return listTK;
   }  
       
       public static void UpdateBangLuong(thongke tk) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "update bangluong set ngaycong = ? where manv = ?";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.setInt(1, tk.getNgaycong());
        pStmt.setString(2, tk.getManv());
    
        pStmt.executeUpdate();
        System.out.print(tk.getLuong());
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
       
}
