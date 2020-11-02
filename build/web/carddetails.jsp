<%-- 
    Document   : 1
    Created on : Nov 1, 2020, 11:59:44 AM
    Author     : Kavindhya
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String cn=request.getParameter("cn");
String cid=request.getParameter("cid");
String cno=request.getParameter("cno");
String date=request.getParameter("date");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into payment(cn,cid,cno,date)values('"+cn+"','"+cid+"','"+cno+"','"+date+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>