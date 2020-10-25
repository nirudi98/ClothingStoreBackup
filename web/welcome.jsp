<%-- 
    Document   : welcome
    Created on : Oct 7, 2020, 1:59:47 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="beans.productBean"%>
<jsp:useBean id="u" class="beans.productBean"></jsp:useBean>
<jsp:getProperty property="pid" name="u"/><br>  
<jsp:getProperty property="productName" name="u"/><br>  
<jsp:getProperty property="size" name="u" /><br>  
<jsp:getProperty property="color" name="u" /><br>  
<jsp:getProperty property="amount" name="u" /><br>  
<jsp:getProperty property="total" name="u" /><br>  




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Clothina</title>
    </head>
    <body>
        
       <td>Username: </td>
       <td><input type="text" value="<%= session.getAttribute("username") %>" /></td>
            
       <form name="view" action="viewcart" method="post">
           <input type="submit"name="sub" value="view cart">
       </form>
      
    </body>
</html>
