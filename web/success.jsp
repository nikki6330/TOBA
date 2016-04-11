<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    <img src="images/header.jpg" alt="logo" width ="800">
    <br>
    
    <h1>Welcome to TOBA Online Banking!</h1>
    <h2>Your account was successfully created.</h2>
    <br>
    <p>Here is the information that you entered:</p>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <label>Phone Number:</label>
        <span>${user.phoneNumber}</span><br>
        <label>Address:</label>
        <span>${user.address}</span><br>
        <label>City:</label>
        <span>${user.city}</span><br>
        <label>State:</label>
        <span>${user.state}</span><br>
        <label>Zip:</label>
        <span>${user.zip}</span><br>
        <label>Email:</label>
        <span>${user.email}</span><br>
        <label>Username:</label>
        <span>${user.username}</span><br>
        <label>Password:</label>
        <span>${user.password}</span><br>
        
        <form action="login.jsp">
            <label>&nbsp;</label>
            <input type="submit" value="Login" class="margin_left">
        </form>
    
<c:import url="/includes/footer.jsp" />
