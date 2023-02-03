<%@ page contentType="text/html;charset=UTF-8"
language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="User.User" %>

<html>
    <head>
        <title>User</title>
    </head>
    <body>
        <%
            User user = ((User) request.getSession().getAttribute("user"));
        %>

        <h1>
            <%= user.getNom() + " " + user.getPrenom()  %>
        </h1>
        <form method="GET" action="UserServlet">
            <input type="submit">
        </form>
    </body>
</html>