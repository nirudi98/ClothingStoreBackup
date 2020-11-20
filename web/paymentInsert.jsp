<%-- 
    Document   : paymentInsert.jsp
    Created on : Nov 18, 2020, 8:03:33 PM
    Author     : DELL
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="controller.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>



<%

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");


HttpSession s = request.getSession(true);
String customerID = (String) s.getAttribute("cID");
Integer status =0;
Integer count =1;

 ResultSet search = DB.search("SELECT COUNT(*) FROM Payment");
            if (search.next()) {
                count += Integer.parseInt(search.getString(1));
            }
            String id = "" + count;
            

String sql="insert into payment(paymentID,customer,status) values(?,?,?)";
  PreparedStatement pst = conn.prepareStatement(sql);
  pst.setString(1,id);
  pst.setString(2 , customerID);
  pst.setString(3, String.valueOf(status));
  int numRowsChanged = pst.executeUpdate(); 
  response.sendRedirect("paymentReview.jsp");
//out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>      
       
