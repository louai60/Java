<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Book</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Update Book</h1>
    <form:form action="/book/${book.id}" method="post" modelAttribute="book">
        <input type="hidden" name="_method" value="put">
        <div class="form-group">
            <label for="title">Title</label>
            <form:errors path="title" cssClass="text-danger" />
            <form:input path="title" id="title" class="form-control" />
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <form:errors path="description" cssClass="text-danger" />
            <form:textarea path="description" id="description" class="form-control" rows="5" />
        </div>
        <div class="form-group">
            <label for="language">Language</label>
            <form:errors path="language" cssClass="text-danger" />
            <form:input path="language" id="language" class="form-control" />
        </div>
        <div class="form-group">
            <label for="numberOfPages">Pages</label>
            <form:errors path="numberOfPages" cssClass="text-danger" />
            <form:input type="number" path="numberOfPages" id="numberOfPages" class="form-control" />
        </div>
        <button type="submit" class="btn btn-primary">Update</button>
    </form:form>
</div>
</body>
</html>
