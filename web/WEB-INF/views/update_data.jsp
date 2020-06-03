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
<form:form action="/update_data_pro" method="post" modelAttribute="updateStudentBean">
    <div>
        <form:label path="department_id">수정할 학과 아이디</form:label>
        <form:input path="department_id"/>
    </div>
    <div>
        <form:label path="name">대상 이름</form:label>
        <form:input path="name"/>
    </div>
    <div>
        <form:button>입력</form:button>
    </div>

</form:form>


</body>
</html>
