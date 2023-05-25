/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlycafe;

import entity.user;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Haru
 */
public class qlcf {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
//        Connection conn = tienich.EmpConnection.getConnection();
//        user nd1 = new user();
//        nd1.setId(1);
//        nd1.setTaikhoan("haru");
//        nd1.setMatkhau("haru");
    dao.daouser.getOneND("khanh","khanh567");
    }
}
