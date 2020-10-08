<%-- 
    Document   : welcome
    Created on : Oct 7, 2020, 1:59:47 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        
       <td>Username: </td>
       <td><input type="text" value="<%= session.getAttribute("username") %>" /></td>
            
      
    </body>
</html>
