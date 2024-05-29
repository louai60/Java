<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Burger Tracker</title>
</head>
<body style="margin:10vw;">
<h1>Burger Tracker</h1>
<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>Burger Name</th>
        <th>Restaurant Name</th>
        <th>Rating (out of 5)</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="burger" items="${burgers}">
        <tr>
            <td><c:out value="${burger.burgerName}"/></td>
            <td><c:out value="${burger.restoName}"/></td>
            <td><c:out value="${burger.rating}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<h2>Add new burger</h2>
<form:form action="/addBurger" mode="post" modelAttribute="burger">
    <div>
        <form:label path="burgerName">Burger Name:</form:label><br>
        <form:errors path="burgerName" class="text-danger"/>
        <form:input path="burgerName" style="width:250px;"/>
    </div>
    <div>
        <form:label path="restoName">Restaurant Name:</form:label><br>
        <form:errors path="restoName" class="text-danger"/>
        <form:input path="restoName" style="width:250px;"/>
    </div>
    <div>
        <form:label path="rating">Rating:</form:label><br>
        <form:errors path="rating" class="text-danger"/>
        <form:input path="rating" style="width:250px;"/>
    </div>
    <div>
        <form:label path="notes">Notes:</form:label><br>
        <form:errors path="notes" class="text-danger"/>
        <form:textarea path="notes" rows="3" style="width:250px;"/>
    </div>
    <div>
        <input type="submit" value="Submit"/>
    </div>
</form:form>
</body>
</html>