<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    <img src="images/header.jpg" alt="logo" width ="800">
    <br>
    
    <h2>Login</h2>
        <form action="Login" method="post">
            <label>Username</label>
            <input type="text" name="username" value="${user.username}" required><br>
            <label>Password</label>
            <input type="text" name="password" value="${user.password}" required><br>
            <label>&nbsp;</label>
            <a href="new_customer.jsp" class="margin_left">New User?</a>
            <a href="password_reset.jsp" class="margin_left">Reset Password</a><br> 
            <label>&nbsp;</label>
            <input type="submit" value="Login" class="margin_left">
        </form>
        
<c:import url="/includes/footer.jsp" />

