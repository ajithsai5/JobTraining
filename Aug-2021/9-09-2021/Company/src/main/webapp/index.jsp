<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<%@include file="head.jsp" %>
</head>
<body>
<div class="container">
		<div class="col-md-12">
			<form class="form-inline" method="get" action="FindController">
				<%@include file="nav.jsp" %>
				<legend>
					<b>Find The Details of the Employee :-</b>
				</legend>
				<div class="mb-12s">
					<label for="empID" class="form-label">Employee ID :-</label> <input
						type="number" class="form-control is-valid " id="empID" name="empID"
						placeholder="220345" required>
				</div>
				<br>
				<div class="col-12">
					<button class="btn btn-primary" type="submit" onclick="showData()">Find
						The Employee Details</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>