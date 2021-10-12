<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="head.jsp"%>
</head>
<body>

	<div class="container">
		<div class="col-md-8">
			<br>
			<legend>
				<b>Update The Details of the Employee :-</b>
			</legend>
			<br>
			<form class="form-inline" method="post" action="UpdateData">
			<div class="mb-12s">
					<label for="firstName" class="form-label">Employee First-Name :-</label> 
					<input type="text" class="form-control is-valid " id="firstName"
						name="firstName" value="${EmployeeID.firstName}" required>
				</div><br>
				<div class="mb-12s">
					<label for="lastName" class="form-label">Employee Last-Name :-</label> 
					<input type="text" class="form-control is-valid " id="lastName"
						name="lastName" value="${EmployeeID.lastName}" required>
				</div>
				<br>
			<div class="mb-12s">
					<label for="location" class="form-label">Employee Location :-</label> 
					<input type="text" class="form-control is-valid " id="location"
						name="location" value="${EmployeeID.location}" required>
				</div>
				<br>
				<div class="mb-12s">
					<label for="empID" class="form-label">Employee ID :-</label> 
					<input type="number" class="form-control is-valid " id="empID"
						name="empID" value="${EmployeeID.empId}" required>
				</div>
				<br>
				<div class="mb-12s">
					<label for="salary" class="form-label">Employee Salary :-</label> 
					<input type="number" class="form-control is-valid " id="salary"
						name="salary" value="${EmployeeID.salary}" required>
				</div>
				<br>
				<div class="col-12">
					<button class="btn btn-primary" type="submit">Submit</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>