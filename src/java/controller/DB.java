/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class DB {
     private static Connection c;

    public static void createMyConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            createMyConnection();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            createMyConnection();
        }
        return c.createStatement().executeQuery(sql);

    }
    public static Connection getMyConnection()throws Exception{
        if (c==null) {
            createMyConnection();
        }
        return  c;
    }
}
