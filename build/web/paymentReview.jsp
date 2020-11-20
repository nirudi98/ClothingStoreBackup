<%-- 
    Document   : paymentReview
    Created on : Nov 18, 2020, 10:13:55 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<% Double total = 0.00; %>                                               
                        


<html>
<body>
<center>
<h1>Check Out Details</h1>
<br>
<table border="1" >
<tr>

<td>product name</td>
<td>color</td>
<td>size</td>
<td>amount</td>
<td>total</td>

</tr>
<%
try{
    
Class.forName("com.mysql.jdbc.Driver");
          Connection   c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothingdb?useTimezone=true&serverTimezone=UTC", "root", "");
    
           HttpSession s1 = request.getSession(true);
           String customerID = (String) s1.getAttribute("cID");
           
            
ResultSet rs;
         Statement st = c.createStatement();
         rs = st.executeQuery("select * from cart where customer='" + customerID + "'");
    while (rs.next()) 
    {
       String  pname = rs.getString("productName");
       String  col = rs.getString("color");
       String size = rs.getString("size");
       Integer a = rs.getInt("amount");
       String price = rs.getString("price");
       total = total + Double.parseDouble(price);
       
       
    
%>
<tr>
      
<td><%=pname %></td>
<td><%=col %></td>
<td><%=size %></td>
<td><%=a %></td>
<td><%=price %></td>

</tr>





<%
}
c.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
   
</table>
           
<form name="form2" action="checkout.jsp">
    <input type="submit" value="Checkout Confirm">
</form>
<br>  
<form name="form1" action="product.html">
    <input type="submit" value="Checkout Cancel">
</form>


</center>
    </body>
</html>

