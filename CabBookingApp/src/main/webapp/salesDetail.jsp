<%-- 
    Document   : salesDetail
    Created on : Sep 21, 2022, 8:05:00 AM
    Author     : ThileebanS
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="ClientCSS.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"/>
        <title>Manage Bookings</title>
    </head>
    <body>
        <section id="menu">
            <div class="logo">
                <img src="" alt="">
                <h2>Admin</h2>
            </div>

            <div class="submenu">
                <li><i class="fas fa-bars"></i><a href="salesDetail.jsp">Sales</a></li>
                <li><i class="fas fa-bell"></i><a href="driver.jsp">Driver Info</a></li>
                <li><i class="fas fa-bell"></i><a href="vehicle.jsp">Vehicle Info</a></li>
                <li><i class="fas fa-bell"></i></i><a href="customerBoard.jsp">Customer Info</a></li>
                <li><i class="fas fa-bars"></i><a href="admin.jsp">User Info</a></li>

            </div>
        </section>

        <section id="interface">
            <div class="navigation">
                <div class="n1">
                    <div class="search">
                        <h1>Booking Information</h1>
                    </div>
                </div>

                <%
                    try {
                        Connection connection = null;
                        Statement statement = null;
                        ResultSet rs = null;

                        Class.forName("com.mysql.jdbc.Driver");
                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabbooking", "root", "pass");
                        statement = connection.createStatement();
                        rs = statement.executeQuery("select * from user");

                        while (rs.next()) {

                %>
                <div class="profile">
                    <i class="fas fa-bell"></i>
                    <h1><% out.print(rs.getString("user"));%></h1>
                </div>
                <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }%>
            </div>

            <h3 class="i-name">
                Dashboard
            </h3>

            <div class="values">
                <div class="val-box">
                    <i class="fas fa-users"></i>
                    <div>
                        <h3>835</h3>
                        <span>New User</span>
                    </div>
                </div>

                <div class="val-box">
                    <i class="fas fa-users"></i>
                    <div>
                        <h3>835</h3>
                        <span>New User</span>
                    </div>
                </div>

                <div class="val-box">
                    <i class="fas fa-users"></i>
                    <div>
                        <h3>835</h3>
                        <span>New User</span>
                    </div>
                </div>

                <div class="val-box">
                    <i class="fas fa-users"></i>
                    <div>
                        <h3>835</h3>
                        <span>New User</span>
                    </div>
                </div>
            </div>

            <div class="board">
                <table width="100%">
                    <thead>
                        <tr>
                            <td>Name</td>
                            <td>Title</td>
                            <td>Status</td>
                            <td>Status</td>
                            <td>Status</td>
                            <td>Status</td>
                        </tr>
                    </thead>
                    <tbody>

                        <%
                            try {
                                Connection connection = null;
                                Statement statement = null;
                                ResultSet rs = null;

                                Class.forName("com.mysql.jdbc.Driver");
                                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabbooking", "root", "pass");
                                statement = connection.createStatement();
                                rs = statement.executeQuery("select * from sales");

                                while (rs.next()) {

                        %>
                        <tr>
                            <td class="people">
                                <img src="" alt="">
                                <div class="people-de">
                                    <h5><% out.print(rs.getString("customername"));%></h5>
                                    <p>john@example.com</p>
                                </div>
                            </td>
                            <td class="people-des">
                                <h5><% out.print(rs.getString("vehicleno"));%></h5>
                                <p>Web dev</p>
                            </td>
                            <td class="active">
                                <p><% out.print(rs.getString("tripstart"));%></p>
                            </td>
                            <td class="role">
                                <p><% out.print(rs.getString("tripend"));%></p>
                            </td>
                            <td class="role">
                                <p><% out.print(rs.getString("tripstatus"));%></p>
                            </td>
                            <td class="edit">
                                <a href='updateSales.jsp?sale=<%rs.getString("salesid");%>'>Edit</a>
                            </td>
                        </tr>


                        <% }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }%>



                    </tbody>
                </table>
            </div>
        </section>
    </body>
</html>
