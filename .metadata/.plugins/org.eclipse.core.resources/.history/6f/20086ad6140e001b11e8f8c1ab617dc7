<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.demo.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page</title>
</head>
<body>
 
	<% 
		User userBean = (User) request.getSession().getAttribute("userBean");
		out.print("Welcome, " + userBean.getUsername());
	%>
	<br/>
	<a href="addUser">AddUser</a>
	<table>
		<tr>
			<th>Id</th>
			<!--<th>Avatar</th>-->
			<th>UserName</th>
			<th>Password</th>
			<th>Email</th>
			<th>Role</th>
			<th colspan="2">Actions</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<!--<c:url value="/image?fname=${user.avatar}" var="imgUrl"></c:url>
				<td><img height="70" width="90" src="${imgUrl}" /></td>-->
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.email}</td>
				<td>${user.role}</td>
				<td><a href="editUser?id=${user.id}">Edit</a></td>
				<td><a href="deleteUser?id=${user.id}">Delete</a></td>
			</tr>
		</c:forEach>
		
	</table>
	</body>
</html>