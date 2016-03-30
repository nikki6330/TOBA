<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>New User</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <img src="images/header.jpg" alt="logo" width ="800">
        <br>
        <h2>New User Registration</h2>
        <p style="color: #df2323">${message}</p>
        <form action="NewCustomer" method="post">
            <input type="hidden" name="action" value="add">
            <label>First Name</label>
            <input type="text" name="firstName" value="${user.firstName}"><br>
            <label>Last Name</label>
            <input type="text" name="lastName" value="${user.lastName}"><br>
            <label>Phone #</label>
            <input type="text" name="phoneNumber" value="${user.phoneNumber}"><br>
            <label>Address</label>
            <input type="text" name="address" value="${user.address}"><br>
            <label>City</label>
            <input type="text" name="city" value="${user.city}"><br>
            <label>State</label>
            <input type="text" name="state" value="${user.state}"><br>
            <label>ZIP Code</label>
            <input type="text" name="zip" value="${user.zip}"><br>
            <label>Email</label>
            <input type="email" name="email" value="${user.email}"><br>
            <label>Username</label>
            <input type="text" name="username" value="${user.username}"><br>
            <label>Password</label>
            <input type="text" name="password" value="${user.password}"><br>
            <label>&nbsp;</label>
            <input type="submit" value="Submit" class="margin_left">
            <a href="login.jsp" class="margin_left">Already a user?</a>
        </form>
    </body>
</html>

