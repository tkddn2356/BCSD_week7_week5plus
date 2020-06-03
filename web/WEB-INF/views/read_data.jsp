<%--
  Created by IntelliJ IDEA.
  User: sangwookim
  Date: 2020-04-29
  Time: 오전 2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>department_number</th>
        <th>department_id</th>
    </tr>
<c:forEach var='obj' items="${list}">
    <tr>
        <td>${obj.student_id }</td>
        <td>${obj.name }</td>
        <td>${obj.department_number }</td>
        <td>${obj.department_id }</td>
    </tr>
</c:forEach>
</table>

</body>
</html>
