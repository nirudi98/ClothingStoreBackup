/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.registerBean;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "register_Customer", urlPatterns = {"/register_Customer"})
public class register_Customer extends HttpServlet {
    
    private static Connection c;  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        try {
            
         
            Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
        
            int count = 0;
            registerBean cb = new registerBean();

            cb.setFull(request.getParameter("full"));
            cb.setUser(request.getParameter("user"));
            cb.setEmail(request.getParameter("email"));
            cb.setPassword(request.getParameter("pass"));
            cb.setCPassword(request.getParameter("confirm"));
            cb.setDob(request.getParameter("birthday"));
            cb.setGender(request.getParameter("gender"));
            
            

            String full = cb.getFull();
            String email = cb.getEmail();
            String user= cb.getUser();
            String password = cb.getPassword();
            String confirm = cb.getCPassword();
            String dob = cb.getDob();
            String gender = cb.getGender();
           
            
            
            
            
            

            ResultSet search = DB.search("SELECT COUNT(*) FROM customerdetails");
            if (search.next()) {
                count += Integer.parseInt(search.getString(1));
            }
            String id = "" + count;
            
            
            
            String sql = 
  "insert into customerdetails (CustomerID,FullName,Gender,DOB,Username,Password,ConfirmPass,Email) values (?,?,?,?,?,?,?,?)";
  PreparedStatement pst = c.prepareStatement(sql);
  pst.setString(1, id);
  pst.setString(2, full);
  pst.setString(3, gender);
  pst.setString(4, dob);
  pst.setString(5, user);
  pst.setString(6, password);
  pst.setString(7, confirm);
  pst.setString(8, email);
  int numRowsChanged = pst.executeUpdate();
  // show that the new account has been created
  out.println(" Hello : ");
  out.println(" '"+full+"'");
  pst.close();
   RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginCustomer.jsp");
   rd.include(request, response);     
            
            
            

          //  DB.iud("INSERT INTO customerdetails(CustomerID,FullName, Gender, DOB, Username, Password, ConfirmPass, Email) VALUES ('"+id+"','"+full+"','"+gender+"','"+dob+"','"+user+"','"+password+"','"+confirm+"','"+email+"'");
           // response.sendRedirect("welcome.jsp");
        } catch (Exception ex) {
            PrintWriter writer = response.getWriter();
            writer.print(ex);
        }

    }

    

    

}
