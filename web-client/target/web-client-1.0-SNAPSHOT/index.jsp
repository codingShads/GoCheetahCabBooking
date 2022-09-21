<%-- 
    Document   : index
    Created on : Aug 10, 2022, 5:20:49 PM
    Author     : ThileebanS
--%>


<%@page import="icbt.User"%>
<%@page import="icbt.Person"%>

<%@page import="com.mycompany.web.client.Util"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="main.css">
    </head>
    <body>
        <%

            User username = Util.authenticate(request, response, session);
//            if (username != null) {
//                //out.print("Login Successful");
//                //out.print("Welcome " + username.getFirstName());
//                //out.print("Your Nic " + username.getNic());
//            } else {
//
//            }


        %>

        <table class="table">
            <tr>
                <th>First Name</th>
                <th>Last name</th>
                <th>Model</th>
                <th>Year</th>
            </tr>
            
            
            
            
        </table>
        <div class="panel">
            <h1>

            </h1>
        </div>
    </body>
</html>
