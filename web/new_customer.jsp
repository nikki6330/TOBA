<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    
    <h2>New User Registration</h2>
        <p style="color: #df2323">${message}</p>
        <form action="NewCustomer" method="post">
            <input type="hidden" name="action" value="add">
            <label>First Name</label>
            <input type="text" name="firstName" value="${user.firstName}"><br>
            <label>Last Name</label>
            <input type="text" name="lastName" value="${user.lastName}"><br>
            <label>Phone #</label>
            <input type="text" name="phoneNumber" maxlength="10" value="${user.phoneNumber}"><br>
            <label>Address</label>
            <input type="text" name="address" value="${user.address}"><br>
            <label>City</label>
            <input type="text" name="city" value="${user.city}"><br>
            <label>State</label>
            <input type="text" name="state" value="${user.state}"><br>
            <label>ZIP Code</label>
            <input type="text" name="zip" maxlength="5" value="${user.zip}"><br>
            <label>Email</label>
            <input type="email" name="email" value="${user.email}"><br>
            <label>&nbsp;</label>
            <input type="submit" value="Submit" class="margin_left">
            <a href="login.jsp" class="margin_left">Already a user?</a>
        </form>
        
<c:import url="/includes/footer.jsp" />
