/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.registerBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandupama
 */
public class viewcustomer 
{
    Connection c;
    public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static List<registerBean> getAllRecords(int id){
	List<registerBean> list=new ArrayList<registerBean>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from customerdetails where CustomerID=?");
		ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
		while(rs.next()){
			registerBean u=new registerBean();
			u.setFull(rs.getString("FullName"));
			u.setDob(rs.getString("DOB"));
                        u.setPassword(rs.getString("Password"));
                        u.setCPassword(rs.getString("ConfirmPass"));
                        u.setGender(rs.getString("Gender"));
                        u.setUser(rs.getString("Username"));
                        u.setEmail(rs.getString("Email"));
                        
			
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static List<registerBean> getRecordById(int id){
	List<registerBean> list=new ArrayList<registerBean>();
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from customerdetails where CustomerID=?");
		ps.setInt(2,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			registerBean u=new registerBean();
			u.setFull(rs.getString("FullName"));
			u.setDob(rs.getString("DOB"));
                        u.setPassword(rs.getString("Password"));
                        u.setCPassword(rs.getString("ConfirmPass"));
                        u.setGender(rs.getString("Gender"));
                        u.setUser(rs.getString("Username"));
                        u.setEmail(rs.getString("Email"));
                        
              	
                        list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
}


    

