<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
    <head>
        <title>Admin</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/main.css" type="text/css" />
    </head>
    <body>
        <h1>Reports</h1>
        <sql:setDataSource
        var="users"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/toba"
        user="root" password="nikki6330" />
     
        <sql:query var="listUsers"   dataSource="${users}">
            SELECT * FROM user;
        </sql:query>
        
        <table border="1" cellpadding="5">
            <h2>List of users</h2>
            <tr>
                <th>Username</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.USER_NAME}" /></td>                    
                    <td><c:out value="${user.FIRST_NAME}" /></td>
                    <td><c:out value="${user.LAST_NAME}" /></td>
                    <td><c:out value="${user.EMAIL}" /></td>
                </tr>
            </c:forEach>
        </table>
        
        <h2>User Table</h2>
        <p><a href="userTableSpreadsheet">Return as an XLS file</a></p>

</body>
</html>