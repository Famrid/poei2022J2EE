<%@ page contentType="text/html;charset=UTF-8"
language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="User.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<html>
    <head>
        <title>User</title>
    </head>
    <%

    %>
    <body>
        <table>
            <% for(User user : (List<User>) request.getAttribute("listeUser")) { %>
            <tr>
                <td>
                    <%= user.getNom() %>
                </td>
                <td>
                    <%= user.getPrenom() %>
                </td>
            </tr>
            <% } %>
        </table>
    </body>
</html>