<%-- 
    Document   : AddUser
    Created on : Oct 8, 2020, 3:36:02 PM
    Author     : ThanhNguyen
--%>

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
                margin-right: -20.4em;
                width: 8.9em;
                height: 3em;
                border-radius: .4em;
            }
            .registration_h1{
                margin-left: 2em;
                width: 105%;
            }
        </style>
    </head>
    <body>
        <form action="addUserController" method="post">
            <div id="formlogin">
                <div class="registration_h1">
                    <h1>Registration User</h1>
                </div>
                <label>UserName:</label>
                <input type="text" class="texttx" name="user"><br>
                <label>Address:</label>
                <input type="text" class="texttx" name="address"> <br>
                <label>Password:</label>
                <input type="password" class="texttx" name="password"> <br>
                <div class="submit">
                    <input type="submit" value="REGISTRATION">
                </div>
            </div>
        </form>
    </body>
</html>
