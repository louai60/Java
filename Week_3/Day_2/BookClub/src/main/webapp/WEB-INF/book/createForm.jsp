<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Book</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>New Book</h1>
    <form:form action="/book" method="post" modelAttribute="book">
        <div class="form-group">
            <label for="title">Title</label>
            <form:errors path="title" cssClass="text-danger" />
            <form:input path="title" id="title" class="form-control" />
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <form:errors path="description" cssClass="text-danger" />
            <form:textarea path="description" id="description" class="form-control" rows="3"></form:textarea>
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
        <div class="form-group">
            <label for="library">Library</label>
            <form:select path="library" id="library" class="form-control">
                <option value="">Choose a library</option>
                <c:forEach items="${libraries}" var="lib">
                    <option value="${lib.id}">${lib.name}</option>
                </c:forEach>
            </form:select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
</body>
</html>
