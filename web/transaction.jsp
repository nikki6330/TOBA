<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
       
    <h2>Transfer Between Accounts</h2>
    <p style="color: #df2323">${message}</p>    
    <label>Current Checking:</label>
    <span>${user.getCheckingBalance()}</span><br>
    <label>Current Savings:</label>
    <span>${user.getSavingsBalance()}</span><br>
    <br>
    
    <form action="Transfer" method="post">
            <input type="hidden" name="action" value="transfer">
            <label>From:</label>
            <select name="account_1" class="margin_left">
                <option value="${user.getSavingsBalance()}" selected>Savings</option>
                <option value="${user.getCheckingBalance()}">Checking</option> 
            </select><br>
            <label>To:</label>
            <select name="account_2" class="margin_left">
                <option value="${user.getSavingsBalance()}" >Savings</option>
                <option value="${user.getCheckingBalance()}" selected>Checking</option> 
            </select><br>
            <label>Transfer Amount</label>
            <input type="text" name="amount" value="${account.amount}"><br>
            <label>&nbsp;</label>
            <input type="submit" value="Transfer" class="margin_left">
    </form>                   
    
<c:import url="/includes/footer.jsp" />
