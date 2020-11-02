<%-- 
    Document   : deleteCart
    Created on : Oct 28, 2020, 5:04:48 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 

<%
String id=request.getParameter("Id");
int no=Integer.parseInt(id);
try{
    
Class.forName("com.mysql.jdbc.Driver");
          Connection   c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
    
           HttpSession s = request.getSession(true);
           String customerID = (String) s.getAttribute("cID");
           

Statement st=c.createStatement();
st.executeUpdate("delete from cart where cartID = '"+ no +"'"); 
response.sendRedirect("shopping-cart.jsp");
    
c.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
