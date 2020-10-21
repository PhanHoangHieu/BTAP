<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.demo.model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit user page</title>
</head>
<body>
	<c:out value="${'You are in edit User'}"/>  
	<form action="<%=request.getContextPath()%>/editUser" method="post">
        <label> Username: </label>
        <input type="text" name="username" value="${user.username}" disabled="disabled"><br>
        <label> Password: </label>
        <input type="text" name="password" value="${user.password}" disabled="disabled"> <br>
        <label> Email: </label>
        <input type="text" name="email" value="${user.email}"> <br>
        <!--<label>Choose Avatar</label> 
        <input type="file" name="avatar" /> <br/>-->
        <label>&nbsp; </label>
        <input type="hidden" name="id" value="${user.id}">
        <input type="submit" value="Update" name="update">
    </form>
	
</body>
</html>