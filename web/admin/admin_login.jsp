<%-- 
    Document   : admin_login.jsp
    Created on : May 2, 2016, 5:27:45 PM
    Author     : nicole
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Admin Login</h1>
        <form action="j_security_check" method="POST">
            <label>Username</label>
            <input type="text" name="j_username"><br>
            <label>Password</label>
            <input type="text" name="j_password"><br>
            <label>&nbsp;</label>
            <input type="submit" value="login" class="margin_left">
        </form>
    </body>
</html>
