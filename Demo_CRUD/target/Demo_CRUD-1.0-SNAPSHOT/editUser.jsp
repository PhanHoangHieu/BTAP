<%-- 
    Document   : EditUser
    Created on : Oct 8, 2020, 12:45:47 PM
    Author     : ThanhNguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #formlogin{
                background: #8e8a8a14;
                border-radius: 1em;
                box-shadow: 0.5em 0.1em 0.8em grey;
                text-align: center;
                width: 30%;
                padding: 1em;
                border: solid 1px;
                margin: 0 auto;
                margin-top: 5.5em;
            }
            label{
                float: left;
                width: 30%;
                text-align: center;
            }
            .texttx{
                border-radius: 1em;
                width: 20em;
                height: 2em;
                margin: -0.9em 0 2.1em 0;
                border-style: double;
                text-align: center;
            }
            .submit input{
                border: solid 1px #009999;
                margin-right: -22.4em;
                width: 6.7em;
                height: 3em;
                border-radius: .4em;
            }
        </style>
    </head>
    <body>
        <form action="EditController" method="post">
            <div id="formlogin">
                <div>
                    <h2>FORM EDIT</h2>
                </div>
                <label>User:</label>
                <input type="text" class="texttx" name="user" value="${user.getUsername()}" ><br>
                <label>Address:</label>
                <input type="text" class="texttx" name="address" value="${user.getAddress()}" ><br>
                <label>Password:</label>
                <input type="password" class="texttx" name="password"value="${user.getPassword()}" > <br>

                <input type="hidden" value="${user.getUser_id()}" name="id">              
                <div class="submit">
                    <input type="submit" value="Update">
                </div>
            </div>
        </form>
    </body>
</html>
