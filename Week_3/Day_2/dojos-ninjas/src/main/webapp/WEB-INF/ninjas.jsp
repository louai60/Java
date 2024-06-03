<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Cars</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="d-inline-flex justify-content-between w-100">
        <div><h1 class="mb-4">All Ninjas</h1></div>
        <div class="ml-auto"><a href="/cars/new">Add ninja</a></div>
    </div>

    <table class="table table-bordered">
        <thead class="thead-dark">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ninjas}" var="ninja">
            <tr>
                <td><c:out value="${ninja.firstName}" /></td>
                <td><c:out value="${ninja.lastName}" /></td>
                <td><c:out value="${ninja.age}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
