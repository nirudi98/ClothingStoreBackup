<%-- 
    Document   : checkout
    Created on : Nov 18, 2020, 10:15:23 PM
    Author     : DELL
--%>



<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%

try{
Class.forName("com.mysql.jdbc.Driver");
          Connection   c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
          Statement st=null;
          
          HttpSession s = request.getSession(true);
String customerID = (String) s.getAttribute("cID");
          
st=c.createStatement();

String stat= "1";
st.executeUpdate("update payment set status='"+stat+"'");

Statement st1=c.createStatement();
st1.executeUpdate("delete from cart where customer = '"+ customerID +"'"); 

response.sendRedirect("thankyou.html");
}
catch(Exception e){
System.out.println(e);
}
%>