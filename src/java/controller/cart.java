/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.loginBean;
import beans.productBean;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet(name = "cart", urlPatterns = {"/cart"})
public class cart extends HttpServlet {

    HttpSession session;
    private static Connection c;  
    boolean status=false;  
    String pp;
    Double total;
    
          @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
    
           
         
            productBean ub = new productBean();
            ub.setColor(request.getParameter("color"));
            ub.setSize(request.getParameter("size"));
            ub.setProductName(request.getParameter("product_no"));
            ub.setAmount(Integer.parseInt(request.getParameter("num-product")));
            
            
            
            String size = ub.getSize();
            String col = ub.getColor();
            String name = ub.getProductName();
            int amount = ub.getAmount();
            
            
             PrintWriter out = response.getWriter();
             out.println(size);
             out.println(col);
             out.println(name );
             out.println(amount);
             
             
            PreparedStatement ps=c.prepareStatement("SELECT price FROM product WHERE productName = '" + name + "'"); 
            ResultSet rs = ps.executeQuery(); 
            
            
            while(rs.next()) 
                       { 
                         pp = rs.getString("price"); 
                       }      
            
           
            out.println(pp);
            total = Double.parseDouble(pp) * amount;
            out.println(total);
            
         
         
        } catch (Exception ex) {
             PrintWriter out = response.getWriter();
             out.print(ex);
        }
    }

        }
    
    

   


   
