<%--
  Created by IntelliJ IDEA.
  User: sangwookim
  Date: 2020-05-09
  Time: 오전 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Title</title>
</head>
<script>

    $(document).ready(function () {

        $("#listBtn").on("click", function () {
            $.get("/students", function(data)  {
                alert(JSON.stringify(data));
            });
        });

        $("#readBtn").on("click", function () {
            var name = $("#name");
            var nameVal = name.val();

            $.get("/students/"+ nameVal, function(data)  {
                alert(JSON.stringify(data));
            });
        });

        $("#registerBtn").on("click", function () {
            var name = $("#name").val();
            var department_id = $("#department_id").val();
            var department_number = $("#department_number").val();

            var boardObject = {
                name: name,
                department_id: department_id,
                department_number: department_number
            }
            $.ajax({
                type:"POST",
                url : "/students/" + name,
                data : JSON.stringify(boardObject),
                contentType:"application/json; charset=UTF-8",
                success:function (result) {
                    alert("등록된 데이터: " + JSON.stringify(result));
                }
            });
        });

        $("#deleteBtn").on("click", function () {
            var name = $("#name").val();
            var department_id = $("#department_id").val();
            var department_number = $("#department_number").val();

            var boardObject = {
                name: name,
                department_id: department_id,
                department_number: department_number
            }
            $.ajax({
                type:"DELETE",
                url : "/students/" + name,
                data : JSON.stringify(boardObject),
                contentType:"application/json; charset=UTF-8",
                success:function (result) {
                    alert("삭제된 데이터: " + JSON.stringify(result));
                }
            });
        });


        $("#modifyBtn").on("click", function () {
            var name = $("#name").val();
            var department_id = $("#department_id").val();
            var department_number = $("#department_number").val();

            var boardObject = {
                name: name,
                department_id: department_id,
                department_number: department_number
            }
            $.ajax({
                type:"PUT",
                url : "/students/" + name,
                data : JSON.stringify(boardObject),
                contentType:"application/json; charset=UTF-8",
                success:function (result) {
                    alert("수정 결과: " + JSON.stringify(result));
                }
            });
        });
    });
</script>
<body>
<h1>Ajax Home</h1>
<form id="inputTest">
    name : <input type="text" name="name" value="" id="name"><br/>
    department_id : <input type="text" name="department_id" value="" id="department_id"><br/>
    department_number : <input type="text" name="department_number" value="" id="department_number"><br/>
</form>
<div>
    <button id="listBtn">LIST</button>
    <button id="readBtn">READ</button>
    <button id="registerBtn">REGISTER</button>
    <button id="deleteBtn">DELETE</button>
    <button id="modifyBtn">MODIFY</button>
</div>

</body>
</html>
