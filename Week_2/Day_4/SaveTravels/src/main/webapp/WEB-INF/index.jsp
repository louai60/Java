<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Expense Tracker</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="mt-5">Expense Tracker</h1>
    <table class="table table-bordered mt-3">
        <thead class="thead-dark">
        <tr>
            <th>Name</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${expenses}" var="expense">
            <tr>
                <td>${expense.name}</td>
                <td>${expense.vendor}</td>
                <td>${expense.amount}</td>
                <td>
                    <a href="/view/${expense.id}" class="btn btn-info btn-sm">View</a>
                    <a href="/edit/${expense.id}" class="btn btn-warning btn-sm">Edit</a>
                    <a href="/delete/${expense.id}" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure you want to delete this expense?');">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/add" class="btn btn-success">Add New Expense</a>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
