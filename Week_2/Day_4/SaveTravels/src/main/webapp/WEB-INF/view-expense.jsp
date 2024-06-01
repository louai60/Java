<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Expense</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Expense Details</h1>
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">Name: ${expense.name}</h5>
            <p class="card-text">Vendor: ${expense.vendor}</p>
            <p class="card-text">Amount: ${expense.amount}</p>
            <p class="card-text">Description: ${expense.description}</p>
            <a href="/" class="btn btn-primary">Back to Home</a>
        </div>
    </div>
</div>
</body>
</html>
