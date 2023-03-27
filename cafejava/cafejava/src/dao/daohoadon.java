/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entity.hoadon;
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
public class daohoadon {
    public static List<hoadon> getALLHD() throws SQLException, ClassNotFoundException
    {
        List<hoadon> listketqua = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from hoadon";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        hoadon hd1 = new hoadon();
        hd1.setMahd(rs.getInt("mahd"));
        hd1.setTienban(rs.getInt("tienban"));
        listketqua.add(hd1);
        }
            
        return listketqua;
    }
    public static List<hoadon> getOneHD(String _mahd) throws SQLException, ClassNotFoundException
    {
        List<hoadon> listketqua = new ArrayList<>();
        Connection cnn = tienich.EmpConnection.getConnection();
        //-- Xây dựng câu lệnh truy vấn
        String sql = "select * from hoadon where mahd = '"+_mahd+"'";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = cnn.prepareStatement(sql);
        ResultSet rs = pStmt.executeQuery();
        while(rs.next())
        {
        hoadon hd1 = new hoadon();
        hd1.setMahd(rs.getInt("mahd"));
        hd1.setTienban(rs.getInt("tienban"));
        listketqua.add(hd1);
        }
        
        return listketqua;
    }
    public static void InsertHD(hoadon hd1) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "insert into hoadon(tienban) values (?)";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        pStmt.setInt(1, hd1.getTienban());
        
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
    public static void DeleteHD(hoadon hd1) throws SQLException, ClassNotFoundException
    {
        // Mở kết nối - xác định câu lệnh truy vấn -> thực thi
        Connection conn = tienich.EmpConnection.getConnection();
        //-- Xác định câu lệnh truy vấn
        String sql = "delete from hoadon where mahd = ?";
        // -- Thực thi câu lệnh truy vấn
        PreparedStatement pStmt = conn.prepareStatement(sql);
        
        pStmt.setInt(1, hd1.getMahd());
        
        pStmt.executeUpdate();
        // đóng kết nối
        tienich.EmpConnection.closePreparedStatement(pStmt);
        tienich.EmpConnection.closeConnection(conn);
    }
}

/**
 *
 * @author KhanhPC
 */

