<%-- 
    Document   : login
    Created on : Sep 26, 2020, 12:57:30 PM
    Author     : ThanhNguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">  
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>  
            h1{
                color:#009999;
            }
            #formlogin{
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
                text-align: right;
            }
            .texttx{
                width: 20em;
                height: 2em;
                margin: -0.9em 0 2.1em 0;
            }
            .submit input{
                border: solid 1px #009999 ;
                margin-right: -9.4em;
                width: 20.7em;
                height: 3em;
                border-radius: .4em;
            }
        </style>
    </head>
    <body>
        <form action="LoginController" method="post">
            <div id="formlogin">
                <h1>Login to the system</h1>
                <label>User:</label>
                <input type="text" class="texttx" name="user"><br>
                <label>Password:</label>
                <input type="password" class="texttx" name="password"> <br>
                <div class="submit">
                    <input type="submit" value="Login">
                </div>
            </div>
        </form>
    </body>
</html>

