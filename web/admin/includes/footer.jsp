<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="now" value="<%=new java.util.Date()%>" />
    <br>
    <p>&copy; Copyright <fmt:formatDate type="date" value="${now}" /> TOBA Online Banking</p>
</body>
</html>
