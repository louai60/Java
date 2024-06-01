<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Expense</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="mt-5">Add New Expense</h1>
    <form:form modelAttribute="expense" action="/add" method="post" class="mt-4">
        <div class="form-group">
            <form:label path="name">Name:</form:label>
            <form:input path="name" class="form-control" />
        </div>
        <div class="form-group">
            <form:label path="vendor">Vendor:</form:label>
            <form:input path="vendor" class="form-control" />
        </div>
        <div class="form-group">
            <form:label path="amount">Amount:</form:label>
            <form:input path="amount" class="form-control" />
        </div>
        <div class="form-group">
            <form:label path="description">Description:</form:label>
            <form:textarea path="description" class="form-control" />
        </div>
        <button type="submit" class="btn btn-primary">Add Expense</button>
    </form:form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
