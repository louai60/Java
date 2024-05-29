<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Books</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">All Books</h1>
    <table class="table table-bordered">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th>#Pages</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td><c:out value="${book.id}" /></td>
                <td>
                    <a href="books/${book.id}" ><c:out value="${book.title}" /></a>
                </td>
                <td><c:out value="${book.language}" /></td>
                <td><c:out value="${book.numberOfPages}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
