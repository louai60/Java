<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <c:if test="${logoutMessage != null}">
        <div class="alert alert-success" role="alert">
            <c:out value="${logoutMessage}"></c:out>
        </div>
    </c:if>
    <h1>Login</h1>
    <c:if test="${errorMessage != null}">
        <div class="alert alert-danger" role="alert">
            <c:out value="${errorMessage}"></c:out>
        </div>
    </c:if>
    <form method="POST" action="/login">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" class="form-control" id="username" name="username">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>
</body>
</html>
