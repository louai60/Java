<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Expense</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Edit Expense</h1>
    <form:form modelAttribute="expense" action="/edit/${expense.id}" method="post" class="needs-validation">
        <div class="form-group">
            <form:label path="name" class="form-label">Name:</form:label>
            <form:input path="name" class="form-control" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="vendor" class="form-label">Vendor:</form:label>
            <form:input path="vendor" class="form-control" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="amount" class="form-label">Amount:</form:label>
            <form:input path="amount" type="number" step="0.01" class="form-control" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="description" class="form-label">Description:</form:label>
            <form:textarea path="description" class="form-control" rows="3"></form:textarea>
        </div>
        <button type="submit" class="btn btn-primary">Update Expense</button>
    </form:form>
</div>
</body>
</html>
