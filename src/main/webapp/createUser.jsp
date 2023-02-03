<%@ page contentType="text/html;charset=UTF-8"
language="java" %>

<html>
    <head>
        <title>Formulaire</title>
    </head>
    <body>
        <form method="POST" action="UserServlet">
            <input type="text" name="name">
            <input type="text" name="surname">
            <input type="date" name="date">
            <label> Homme </label>
            <input type="radio" name="genre" value="homme">
            <label> Femme </label>
            <input type="radio" name="genre" value="femme">
            <input type="submit" value="submit">
        </form>
    </body>
</html>