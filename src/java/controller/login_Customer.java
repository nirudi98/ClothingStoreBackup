/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.loginBean;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "login_Customer", urlPatterns = {"/login_Customer"})
public class login_Customer extends HttpServlet {

    HttpSession session;
    private static Connection c;  
    boolean status=false;  
    String id;
    
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
    
            loginBean ub = new loginBean();
            ub.setUsername(request.getParameter("username"));
            ub.setPassword(request.getParameter("pass"));
            
            String pass = ub.getPassword();
            String uname = ub.getUsername();
            
            
             
            
         ResultSet rs;
         Statement st = c.createStatement();
         rs = st.executeQuery("select CustomerID from customerDetails where Username='" + uname + "' and Password='" + pass + "'");
    if (rs.next()) 
    {
        HttpSession s = request.getSession(false);
        s.setAttribute("username",uname);
        id = rs.getString("CustomerID");
        s.setAttribute("cID", id);
        response.sendRedirect("product.html");
      
        
    } 
    else 
    {
                    HttpSession s = request.getSession(false);
                    s.invalidate();
                    request.setAttribute("errorMessage", "Invalid user or password");
                    RequestDispatcher rd = request.getRequestDispatcher("/loginCustomer.jsp");
                    rd.forward(request, response);
    }
            
           
        } catch (Exception ex) {
             PrintWriter out = response.getWriter();
             out.print(ex);
        }
    }

        }
    
    

   


