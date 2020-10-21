<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.demo.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add user page</title>
</head>
<body>
	<c:out value="${'You are in add User'}"/>  
	<form action="<%=request.getContextPath()%>/addUser" method="post">
        <label> Username: </label>
        <input type="text" name="username"><br>
        <label> Password: </label>
        <input type="password" name="password"> <br>
        <label> Email: </label>
        <input type="text" name="email"> <br>
        <label> Role: </label>
        <select name="role">
		  <option value="1">Administrator</option>
		  <option value="2" selected>User</option>
		</select> <br>
        <label>&nbsp; </label>
        <input type="submit" value="Add" name="add">
    </form>
	
</body>
</html>