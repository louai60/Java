<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Library</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Create Library</h1>
    <form:form action="/library" method="post" modelAttribute="library">
        <div class="form-group">
            <label for="name">Name</label>
            <form:errors path="name" cssClass="text-danger" />
            <form:input path="name" id="name" class="form-control" />
        </div>
        <div class="form-group">
            <label for="location">Location</label>
            <form:errors path="location" cssClass="text-danger" />
            <form:input path="location" id="location" class="form-control" />
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
</body>
</html>
