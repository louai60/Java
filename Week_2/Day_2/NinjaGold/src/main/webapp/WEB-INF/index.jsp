<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ninja Gold Game</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container mt-5">
	<h1 class="text-center mb-4">Ninja Gold Game</h1>
	<p>Your gold: <c:out value="${gold}"/></p>
	<div class="row">
		<div class="col-md-3">
			<div class="card">
				<div class="card-body">
					<h3 class="card-title">Farm</h3>
					<p class="card-text">(earn 10-20 gold)</p>
					<form action="/" method="post">
						<input class="btn btn-primary btn-block" type="submit" name="farm" value="Find Gold!"/>
					</form>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="card">
				<div class="card-body">
					<h3 class="card-title">Cave</h3>
					<p class="card-text">(earn 5-10 gold)</p>
					<form action="/" method="post">
						<input class="btn btn-primary btn-block" type="submit" name="cave" value="Find Gold!"/>
					</form>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="card">
				<div class="card-body">
					<h3 class="card-title">House</h3>
					<p class="card-text">(earn 2-5 gold)</p>
					<form action="/" method="post">
						<input class="btn btn-primary btn-block" type="submit" name="house" value="Find Gold!"/>
					</form>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="card">
				<div class="card-body">
					<h3 class="card-title">Quest</h3>
					<p class="card-text">(earn 20-50 gold)</p>
					<form action="/" method="post">
						<input class="btn btn-primary btn-block" type="submit" name="quest" value="Find Gold!"/>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="mt-4">
		<h3>Activities:</h3>
		<iframe src="/activities" title="Activities Iframe" class="w-100" height="300"></iframe>
	</div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
