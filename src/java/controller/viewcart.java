/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.productBean;
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
 * @author DELL
 */
public class viewcart 
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
public void save(String color,String psize,String pname,String quantity,String tot,String id){
    int count = 0;
	
            try{
                Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
        
                
                 ResultSet search = DB.search("SELECT COUNT(*) FROM cart");
            if (search.next()) {
                count += Integer.parseInt(search.getString(1));
            }
            String i = "" + count; 
                
            String query = "insert into cart(cartID,customer,productName,size,color,amount,price) values(?,?,?,?,?,?,?)";
            
                PreparedStatement ps=c.prepareStatement(query);
                ps.setString(1, i);
                ps.setString(2,id);
                ps.setString(3,pname);
                ps.setString(4,psize);
                ps.setString(5,color);
                ps.setString(6,quantity);
                ps.setString(7,tot);
                
               ps.executeUpdate(); 
              
               System.out.println("User Successfuly created");
               ps.close();
            }catch(Exception e){System.out.println(e);}
           
        }


public static int update(productBean u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("update product set productName=?,category=?,price=? where id=?");
		//ps.setString(1,u.getproductName());
		//ps.setString(2,u.getcategory());
		//ps.setString(3,u.getprice());
		//ps.setInt(4,u.getId());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int delete(productBean u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from product where id=?");
		//ps.setInt(1,u.getId());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<productBean> getAllRecords(int id){
	List<productBean> list=new ArrayList<productBean>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from cart where customer=?");
		ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
		while(rs.next()){
			productBean u=new productBean();
			u.setProductName(rs.getString("productName"));
			u.setSize(rs.getString("size"));
                        u.setColor(rs.getString("color"));
                        u.setAmount(Integer.parseInt(rs.getString("amount")));
                        u.setTotal(Double.parseDouble(rs.getString("price")));
			
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static List<productBean> getRecordById(int id){
	List<productBean> list=new ArrayList<productBean>();
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from cart where customer=?");
		ps.setInt(2,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			productBean u=new productBean();
			u.setPid(rs.getInt("customer"));
			u.setProductName(rs.getString("productName"));
			u.setSize(rs.getString("size"));
                        u.setColor(rs.getString("color"));
                        u.setAmount(Integer.parseInt(rs.getString("amount")));
                        u.setTotal(Double.parseDouble(rs.getString("price")));
              	
                        list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
}


    

