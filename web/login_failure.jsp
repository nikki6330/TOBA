<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    <img src="images/header.jpg" alt="logo" width ="800">
    <br>
    <br>
        
    <p class="margin_far_left"><span style="color: #df2323">*</span>
       <span style="color:#000000">YOU HAVE REACHED THIS PAGE DUE TO AN INCORRECT USERNAME OR PASSWORD</span>
       <span style="color: #df2323">*</span>
    <p>
    <form action="login.jsp">
       <label>&nbsp;</label>
       <input type="submit" value="Back" class="back">
    </form>
    
<c:import url="/includes/footer.jsp" />
