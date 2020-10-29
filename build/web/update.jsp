<%-- 
    Document   : update
    Created on : Oct 29, 2020, 1:30:04 PM
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
String cartid=request.getParameter("cart");
int num=Integer.parseInt(cartid);
Double p = Double.parseDouble(request.getParameter("price"));
String size=request.getParameter("size");
String col=request.getParameter("color");
int amount=Integer.parseInt(request.getParameter("num-product"));
Double tot = p*amount;
String total = String.valueOf(tot);
%>

<h1><%= cartid %></h1>
<h1><%= p %></h1>
<h1><%= size %></h1>
<h1><%= col %></h1>
<h1><%= total %></h1>



<%

try{
Class.forName("com.mysql.jdbc.Driver");
          Connection   c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
          Statement st=null;
st=c.createStatement();
st.executeUpdate("update cart set size='"+size+"',color='"+col+"',amount="+amount+",price='"+tot+"' where cartID='"+num+"'");
response.sendRedirect("shopping-cart.jsp");
}
catch(Exception e){
System.out.println(e);
}
%>
