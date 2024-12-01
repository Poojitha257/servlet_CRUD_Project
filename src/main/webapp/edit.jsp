<%@page import="servlet_CRUD.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="servlet_CRUD.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Employee emp = (Employee) request.getAttribute("emp");
	%>
	<div align="center">
		<form action="update" method="post">
			<h1>Updating Data</h1>
			<input type="text" name="id" value="<%=emp.getEmpId()%>"hidden> <label
				for="name">Name</label> <input type="text" name="name"
				value="<%=emp.getEmpName()%>"> <br>
			<br> <label for="email">Email</label> <input type="email"
				name="email" value="<%=emp.getEmpEmail()%>"> <br>
			<br> <label for="mobile">Mobile</label> <input type="tel"
				pattern=[0-9]{10} name="mobile" value="<%=emp.getEmpMobile()%>">
			<br>
			<br> <label for="salary">Salary</label> <input type="number"
				id="salary" name="salary" value="<%=emp.getEmpSalary()%>"> <br>
			<br>
			<button>UPDATE</button>
		</form>
</body>
</html>