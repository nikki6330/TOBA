<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
       
    <h2>Transaction</h2>
    <label>Current Balance:</label>
    <span>${account.balance}</span><br>
    <label>Checking:</label>
    <span>${account.checking}</span><br>
    
    <form action="Transfer" method="post">
            <input type="hidden" name="action" value="add">
            <label></label>
            <input type="text" name="firstName" value="${account.balance}"><br>
    
<c:import url="/includes/footer.jsp" />
