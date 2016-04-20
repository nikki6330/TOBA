<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
    
    <h2>Account Activity</h2>
    <c:if test="${user != null}">
        <p>Welcome ${user.firstName}  ${user.lastName},</p>
        <p>From here you can monitor your account activity</p>
    </c:if>
    <c:if test="${user == null}">
        <p>Not Logged In</p>
    </c:if>         
        
<c:import url="/includes/footer.jsp" />

