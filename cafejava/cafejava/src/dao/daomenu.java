/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frinkin
 */
public class daomenu {
    public static List<menu> getALLMN() throws SQLException, ClassNotFoundException
    {
        List<menu> listketqua = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from menu";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        menu mn1 = new menu();
        mn1.setTenh(rs.getString("tenh"));
        mn1.setDongia(rs.getInt("dongia"));
        listketqua.add(mn1);
        }
            
        return listketqua;
    }
    public static List<menu> getOneMN(String _tenh) throws SQLException, ClassNotFoundException
    {
        List<menu> listketqua = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from menu where tenh = '"+_tenh+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        menu mn1 = new menu();
        mn1.setTenh(rs.getString("tenh"));
        mn1.setDongia(rs.getInt("dongia"));
        listketqua.add(mn1);
        }
        
        return listketqua;
    }
    public static void InsertMN(menu mn1) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into menu(tenh,dongia) values (?,?)";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.setString(1, mn1.getTenh());
        pStmt.setInt(2, mn1.getDongia());
        
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
    public static void DeleteMN(menu mn1) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "delete from menu where tenh = ?";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        
        pStmt.setString(1, mn1.getTenh());
        
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
}
