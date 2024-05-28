<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Omikuji Form</title>
    <link rel="stylesheet" type="text/css" href="/static/style.css">
</head>
<body>
    <h1>Omikuji Form</h1>
    <form action="/omikuji/submit" method="post">
        <label for="question">Ask your question:</label><br>
        <input type="text" id="question" name="question"><br><br>
        <input type="submit" value="Send">
    </form>
</body>
</html>
