<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login to TOBA</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <img src="images/header.jpg" alt="logo" width ="800">
        <br>
        <h2>Login</h2>
        <form action="Login" method="post" accept-charset="utf-8">
        <label>Username</label>
        <input type="text" name="username" value="${user.username}"><br>
        <label>Password</label>
        <input type="text" name="password" value="${user.password}"><br>
        <label>&nbsp;</label>
        <input type="submit" value="Login" class="margin_left">
        <a href="new_customer.jsp" class="margin_far_left">New User?</a>        
        </form>
    </body>
</html>

