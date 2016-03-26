<%--
  Created by IntelliJ IDEA.
  User: macb
  Date: 27/02/16
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IMB</title>

    <%@include file="/WEB-INF/views/jsp/parts/bootstrap.jspf" %>
</head>
<body>
    <div class="container">
        <div class="page-header">${currentuser}
            <h3>Hello, Bootstrap!</h3>

            ul>${1 gt 2}
            <c:forEach items="${userList}" var="user">
                <li>${user.id} ${user.name} <fmt:formatDate value="${student.registerDate}" pattern="dd.MM.yyyy" type="date" /></li>
            </c:forEach>
            </ul>


        </div>
    </div>

</body>
</html>
