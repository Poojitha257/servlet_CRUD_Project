<%@page import="servlet_CRUD.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Employee Records</h1>
<%
List<Employee> records=(List<Employee>) request.getAttribute("records");
%>

<table border="1">
<tr>
<th>Name</th>
<th>Mobile</th>
<th>Email</th>
<th>Salary</th>
<th>Delete</th>
<th>Edit</th>

</tr>
<%
for(Employee record:records){
	%>
	<tr>
	<th><%=record.getEmpName() %></th>
	<th><%=record.getEmpMobile() %></th>
	<th><%=record.getEmpEmail() %></th>
	<th><%=record.getEmpSalary() %></th>
	<th><a href="delete?id=<%=record.getEmpId() %>"><button>Delete</button></a></th>
	<th><a href="edit?id=<%=record.getEmpId() %>"><button>Edit</button></a></th>
	</tr>
	<%
	}
	%>
</table>
</div>
</body>
</html>