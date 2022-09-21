<%-- 
    Document   : index
    Created on : Aug 10, 2022, 5:20:49 PM
    Author     : ThileebanS
--%>

<%@page import="com.mycompany.myweb.User"%>
<%@page import="com.mycompany.myweb.Util2"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.myweb.Util"%>
<%@page import="com.mycompany.myweb.Car"%>
<%@page import="com.mycompany.myweb.Vehicle"%>
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
            if (username != null) {
                out.print("Login Successful");
                out.print("Welcome " + username.getFirstName());
                out.print("Your Nic " + username.getNic());
            } else {

            }


        %>

        <table class="table">
            <tr>
                <th>First Name</th>
                <th>Last name</th>
                <th>Model</th>
                <th>Year</th>
            </tr>
            <%                for (Vehicle v : Util.getVehicle()) {%>
            <tr>
                <td><%out.print(v.getName());%></td>
                <td><%out.print(v.getPrice());%></td>
                <td><%out.print(v.getYear());%></td>
            </tr>
            <% }
            %> 
            <%
                for (Car car : Util2.getCar()) {%>
            <tr>
                <td><%out.print(car.getName());%></td>
                <td><%out.print(car.getPrice());%></td>
                <td><%out.print(car.getYear());%></td>
                <td><%out.print(car.getModel());%></td>
            </tr>
            <% }
            %> 
        </table>
        <div class="panel">
            <h1>

            </h1>
        </div>
    </body>
</html>
