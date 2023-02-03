<%@ page contentType="text/html;charset=UTF-8"
language="java" %>
<%@ page import="java.util.Objects" %>

<html>
    <head>
        <title>Formulaire</title>
    </head>
    <%
        String print = "";
        if(!Objects.isNull(request.getAttribute("erreur"))) {
            print = ((String) request.getAttribute("erreur"));
        }
    %>
    <body>
        <form method="POST" action="LoginServlet">
            <input type="text" name="username">
            <input type="text" name="password">
            <input type="submit" value="submit">
        </form>
        <p> <%= print %> </p>
    </body>
</html>