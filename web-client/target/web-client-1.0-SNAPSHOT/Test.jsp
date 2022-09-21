<%-- 
    Document   : index
    Created on : Aug 17, 2022, 4:22:01 PM
    Author     : ThileebanS
--%>

<%@page import="icbt.Person"%>
<%@page import="icbt.ICBTService"%>
<%@page import="icbt.ICBTService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            ICBTService_Service service = new ICBTService_Service();
            ICBTService proxy = service.getICBTServicePort();
            
            Person p = proxy.getPersons().get(0);
            out.print(p.getFirstName());
            
            
           
            
            out.print(p.getFirstName());
            
            
            %></h1>
            
            <h2>
                <%
                out.print(p.getLastName()); 
                
                %>
            </h2>
            
            
            <h3>
                <%
                out.print(p.getLastName()); 
                
                %>
            </h3>
    </body>
</html>
