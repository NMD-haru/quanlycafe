/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author Khanh-PC
 */
public class connection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=quanlyquancafe;user=sa;password=123");
//        if(conn != null) System.out.println("connected");
        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "database=cafe;"
                + "user=sa;"
                + "password=123123;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
            System.out.println("thanh cong!");
        } // Handle any errors that 
    }
}
