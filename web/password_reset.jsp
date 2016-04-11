<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    <img src="images/header.jpg" alt="logo" width ="800">
    <br>
    
    <h2>Reset Password</h2>
    <form action="NewPassword" method="post">
        <input type="hidden" name="action" value="change">
        <label>New Password</label>
        <input type="text" name="password" value="${user.password}" required><br>
        <label>&nbsp;</label>
        <input type="submit" value="Change" class="margin_left">
    </form>
<c:import url="/includes/footer.jsp" />