<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Library Books</title>
    <!-- Bootstrap CSS link -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Library Books</h1>
    <c:forEach items="${libs}" var="lib">
        <div class="card mb-3">
            <div class="card-header">
                <h2 class="card-title">${lib.name}</h2>
            </div>
            <ul class="list-group list-group-flush">
                <c:forEach items="${lib.books}" var="book">
                    <li class="list-group-item">${book.title}</li>
                </c:forEach>
            </ul>
        </div>
    </c:forEach>
</div>
</body>
</html>
