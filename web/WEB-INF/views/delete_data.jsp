<%--
  Created by IntelliJ IDEA.
  User: sangwookim
  Date: 2020-04-29
  Time: 오후 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/delete_data_pro" method="post" modelAttribute="deleteStudentBean">
    <div>
        <form:label path="name">이름</form:label>
        <form:input path="name"/>
    </div>
    <div>
        <form:label path="department_id">학과 아이디</form:label>
        <form:input path="department_id"/>
    </div>
    <div>
        <form:button>입력</form:button>
    </div>

</form:form>


</body>
</html>
