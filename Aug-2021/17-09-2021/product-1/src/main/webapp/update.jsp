<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="head.jsp" %>
</head>
<body>
<div class="container">
		<div class="col-md-12">
			<form class="form-inline" method="get" action="GetData">
			<%@include file="nav.jsp" %>
				<legend>
					<b>Update The Details of the Employee :-</b>
				</legend>
				<br>
				<br>
				<table class="table table-bordered border-primary" id="update">
					<thead>
						<tr>
							<th scope="col"><b>Employee Id</b></th>
							<th scope="col">Employee Name</th>
							<th scope="col">Branch  Of the Employee</th>
							<th scope="col">Salary</th>
							<th scope="col">Update</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach var="entry" items="${EmployeeID}">
						<tr>
							<td>${entry.value.empId}</td>
							<td>${entry.value.firstName}${entry.value.lastName}</td>
							<td>${entry.value.location}</td>
							<td>${entry.value.salary}</td>
							<td>
							<a href="UpdateController?empID=${entry.value.empId}">UPDATE</a></td>
						</tr>
						</c:forEach>
				
					</tbody>
				</table>
				<br>
				
			</form>
		</div>
	</div>
</body>
</html>