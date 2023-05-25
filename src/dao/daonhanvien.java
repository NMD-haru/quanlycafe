/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.nhanvien;
import entity.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haru
 */
public class daonhanvien {
    public static List<nhanvien> getALLNV() throws SQLException, ClassNotFoundException
    {
        List<nhanvien> listketqua = new ArrayList<>();
        List<user> listnhanvien = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from nhanvien";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        nhanvien nv1 = new nhanvien();
        nv1.setManv(rs.getString("manv"));
        nv1.setTennv(rs.getString("tennv"));
        nv1.setGioitinh(rs.getString("gioitinh"));
        nv1.setQuequan(rs.getString("quequan"));
        nv1.setHesoluong(rs.getFloat("hesoluong"));
        nv1.setNgaysinh(rs.getDate("ngaysinh"));
        nv1.setSdt(rs.getString("sdt"));
        listketqua.add(nv1);
        }
            
        return listketqua;
    }

 public static List<nhanvien> getOneNV(String _manv) throws SQLException, ClassNotFoundException
    {
        List<nhanvien> listketqua = new ArrayList<>();
        List<user> a = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from nhanvien where manv = '"+_manv+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        nhanvien nv1 = new nhanvien();
        nv1.setManv(rs.getString("manv"));
        nv1.setTennv(rs.getString("tennv"));
        nv1.setGioitinh(rs.getString("gioitinh"));
        nv1.setQuequan(rs.getString("quequan"));
        nv1.setHesoluong(rs.getFloat("hesoluong"));
        nv1.setNgaysinh(rs.getDate("ngaysinh"));
        nv1.setSdt(rs.getString("sdt"));
        listketqua.add(nv1);
        }
            
        return listketqua;
    }
  public static void InsertNV(nhanvien nv1) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into bangluong(manv) values (?)";
        String sql2 = "insert into nhanvien(manv,tennv,ngaysinh,gioitinh,quequan,sdt,hesoluong) values (?,?,?,?,?,?,?)";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt2 = conn.prepareStatement(sql2);
        pStmt2.setString(1, nv1.getManv());
        pStmt2.setString(2, nv1.getTennv());
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        
        pStmt2.setString(3, dateFormat.format(nv1.getNgaysinh()));
        pStmt2.setString(4, nv1.getGioitinh());
        pStmt2.setString(5, nv1.getQuequan());
        pStmt2.setString(6, nv1.getSdt());
        pStmt2.setFloat(7, nv1.getHesoluong());
        
        pStmt2.executeUpdate();
                
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.setString(1, nv1.getManv());
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt2);
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
  
  public static void UpdateNV(nhanvien nv1) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "update nhanvien set tennv = ?, ngaysinh =?, gioitinh =?,quequan =?,sdt =?,hesoluong =? where manv = ?";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        
        pStmt.setString(1, nv1.getTennv());
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        
        
        pStmt.setString(2, dateFormat.format(nv1.getNgaysinh()));
        pStmt.setString(3, nv1.getGioitinh());
        pStmt.setString(4, nv1.getQuequan());
        pStmt.setString(5, nv1.getSdt());
        pStmt.setFloat(6, nv1.getHesoluong());
        pStmt.setString(7, nv1.getManv());
        
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
  
  public static void DeleteNV(nhanvien nv1) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "delete from bangluong where manv = ?";
        String sql2 = "delete from nhanvien where manv=? ";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);       
        pStmt.setString(1, nv1.getManv());   
         pStmt.executeUpdate();
        
        PreparedStatement pStmt2 = conn.prepareStatement(sql2);       
        pStmt2.setString(1, nv1.getManv());       
        
        pStmt2.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closePreparedStatement(pStmt2);
        tienich.EmpConnection.closeConnection(conn);      
    }
  
  public static List<nhanvien> FindNV(String _manv) throws SQLException, ClassNotFoundException
    {
        List<nhanvien> listketqua = new ArrayList<>();
        List<user> a = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from nhanvien where manv like ? or tennv like ?";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        pStmt.setString(1, "%"+_manv+"%");
        pStmt.setString(2, "%"+_manv+"%");
        
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        nhanvien nv1 = new nhanvien();
        nv1.setManv(rs.getString("manv"));
        nv1.setTennv(rs.getString("tennv"));
        nv1.setGioitinh(rs.getString("gioitinh"));
        nv1.setQuequan(rs.getString("quequan"));
        nv1.setHesoluong(rs.getFloat("hesoluong"));
        nv1.setNgaysinh(rs.getDate("ngaysinh"));
        nv1.setSdt(rs.getString("sdt"));
        listketqua.add(nv1);
        }
            
        return listketqua;
    }
   
}
