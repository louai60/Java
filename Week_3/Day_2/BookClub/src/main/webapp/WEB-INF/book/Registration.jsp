<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration and Login</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <div class="col-md-6">
            <h2>User Registration</h2>
            <form:form action="/register" method="post" modelAttribute="user">
                <div class="form-group">
                    <label for="userName">Username</label>
                    <form:errors path="userName" cssClass="text-danger" />
                    <form:input path="userName" id="userName" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <form:errors path="email" cssClass="text-danger"/>
                    <form:input path="email" id="email" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <form:errors path="password" cssClass="text-danger"/>
                    <form:input type="password" path="password" id="password" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="confirm">Confirm Password</label>
                    <form:errors path="confirm" cssClass="text-danger"/>
                    <form:input type="password" path="confirm" id="confirm" class="form-control"/>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
        <div class="col-md-6">
            <h2>User Login</h2>
            <form:form action="/login" method="post" modelAttribute="newLogin">
                <div class="form-group">
                    <label for="loginEmail">Email</label>
                    <form:errors path="email" cssClass="text-danger"/>
                    <form:input path="email" id="loginEmail" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="loginPassword">Password</label>
                    <form:errors path="password" cssClass="text-danger"/>
                    <form:input type="password" path="password" id="loginPassword" class="form-control"/>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
