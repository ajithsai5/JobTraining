<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h1>Employee Details</h1>
<h4>Employee Name:-</h4>
<p>${EmployeeID.firstName}${EmployeeID.lastName}</p>
<h4>Employee Location:-</h4>
<p>${EmployeeID.location}</p>
<h4>Employee ID:-</h4>
<p>${EmployeeID.empId}</p>
<h4>Employee Salary:-</h4>
<p>${EmployeeID.salary}</p>
</body>
</html>