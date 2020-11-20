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
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

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
    int id,ID;
    Double total;
    int count=1;
    
    
    
          @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
    
            PrintWriter out = response.getWriter();
             
            
             //retrieving username and ID based on registered user
            HttpSession s = request.getSession(true);
            String username= (String)s.getAttribute("username");
            out.println(username);
            
            
            String name = request.getParameter("product_no");
            int amount = Integer.parseInt(request.getParameter("num-product"));
            int amount1 = Integer.parseInt(request.getParameter("num-product"));
            int amount2 = Integer.parseInt(request.getParameter("num-product"));
         
            
            
            
            
            //customer ID to track the customer
            PreparedStatement userID=c.prepareStatement("SELECT CustomerID FROM customerdetails WHERE Username = '" + username + "'"); 
            ResultSet rs1 = userID.executeQuery(); 
            
            
            while(rs1.next()) 
                       { 
                         ID = Integer.parseInt(rs1.getString("CustomerID"));
                       }      
            
           
            HttpSession idsession = request.getSession(false);
            idsession.setAttribute("customerID", ID);
            userID.close();
            
            
            
            
             //getting total price for one product
            PreparedStatement ps=c.prepareStatement("SELECT price,ID FROM product WHERE productName = '" + name + "'"); 
            ResultSet rs = ps.executeQuery(); 
            
            
            while(rs.next()) 
                       { 
                         pp = rs.getString("price"); 
                         id = Integer.parseInt(rs.getString("ID"));
                       }      
            
           
            
            total = Double.parseDouble(pp) * amount;
            ps.close();
            
            
            
            //setting amounts in product bean
            productBean ub = new productBean();
            ub.setColor(request.getParameter("color"));
            ub.setSize(request.getParameter("size"));
            ub.setProductName(request.getParameter("product_no"));
            ub.setAmount(Integer.parseInt(request.getParameter("num-product")));
            ub.setTotal(total);
            ub.setPid(ID);
            
            String color = ub.getColor();
            String psize = ub.getSize();
            String pname = ub.getProductName();
            String quantity = String.valueOf(ub.getAmount());
            String tot = String.valueOf(ub.getTotal());
            String pid = String.valueOf(ub.getPid());
            
            
            
             ResultSet search = DB.search("SELECT COUNT(*) FROM cart");
            if (search.next()) {
                count += Integer.parseInt(search.getString(1));
            }
            String ID = "" + count;
            
            
                
            String query = "insert into cart(cartID,customer,productName,size,color,amount,price) values(?,?,?,?,?,?,?)";
            
                PreparedStatement ps1=c.prepareStatement(query);
                ps1.setString(1, ID);
                ps1.setString(2,pid);
                ps1.setString(3,pname);
                ps1.setString(4,psize);
                ps1.setString(5,color);
                ps1.setString(6,quantity);
                ps1.setString(7,tot);
                
               ps1.executeUpdate(); 
              
               System.out.println("User Successfuly created");
               ps1.close();
               c.close();
               response.sendRedirect("product.html");
            /*
            int i=controller.viewcart.save(ub);
            if(i>0)
            {
            response.sendRedirect("product.html");
            }
            */
            
             
         
        } catch (Exception ex) {
             PrintWriter out = response.getWriter();
             out.print(ex);
        }
        
      
    }
}

 
        
    
    

   


   
