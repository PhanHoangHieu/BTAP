<%-- 
    Document   : ListUser.jsp
    Created on : Oct 7, 2020, 8:29:41 PM
    Author     : ThanhNguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background: #e0f5ed;
            }
            body table{
                margin: 0 auto;
                border-collapse: collapse;
            }
            table tr{
                height: 2.5em;
            }
            .ds1{
                margin-top: 1.4em;
            }
            .addUser{
                margin-top: 10px;
                background: #48b98f;
                border-radius: 100%;
            }
            .aUser{
                margin: 0 0 0 29.6em;
                text-decoration:none;
                width: 10em ;
                color:white;
            }
            a:hover{
                color: #6d0925;
            }
            .search{
                margin: -2.2em 15.55em 0 0;
                float: right;
            }
            #user{
                margin-left: 77em;
            }
            .edit:hover{
                color:blue;
            }
            .delete:hover{
                color: red;
            }
        </style>
    </head>
    <body>
        <div id="user">
            <h4>Account :  ${ObjectUser.username}</h4>
        </div>
        <div>
            <h3 style="margin-left: 32em;">DANH SÁCH USER</h3>
            <div class="search">
                <form action="SearchController" method="get">
                    <input type="text" placeholder="Tìm kiếm .... " name="search">
                    <input type="submit" value="Tìm">
                </form>
            </div>
        </div>
        <div class="addUser">
            <a href="addUserController" class="aUser"><b>Add User</b></a>
        </div>
        <div class="ds1">
            <table  border="solid 1px" width="40%" style="text-align: center">
                <tr>
                    <th>ID</th>
                    <th>USERNAME</th>
                    <th>PASSWORD</th>
                    <th>ADDRESS</th>
                    <th>ROLE_ID</th>
                    <th colspan="2">ACTIONS</th>
                </tr> 
                <c:if test="${listusers!=null}">
                    <c:forEach var="user" items="${listusers}">
                        <tr>
                            <td>${user.getUser_id()}</td>
                            <td>${user.getUsername()}</td>
                            <td>${user.getPassword()}</td>
                            <td>${user.getAddress()}</td>
                            <td>${user.getRole_id()}</td>
                            <td width="63px"><a href="EditController?id=${user.getUser_id()}" class="edit">Edit</a></td>
                            <td><a href="DeleteController?id=${user.getUser_id()}" class="delete">Delete</a></td>
                        </tr>
                    </c:forEach>
                </c:if>
                <c:if  test="${empty listusers}">
                    <tr>
                        <td colspan="6">Không tìm thấy !!!</td>
                    </tr>
                </c:if>
            </table>
        </div>
        <div class="addUser">
            <a href="LoginController" class="aUser"><b>Exit</b></a>
        </div>
    </body>
</html>
