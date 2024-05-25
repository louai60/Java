<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Fruit Store</title>
    <style>
        /* Your custom CSS styles */
        /* Add styling here to flex your CSS muscles */
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Fruit Store</h1>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="fruit" items="${fruits}">
        <tr>
            <td>${fruit.name}</td>
            <td>${fruit.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
