<html>
<%@ page import="java.util.Calendar" %>
<title>
    hello world
</title>
<%!
    Calendar dateDuJour = Calendar.getInstance();
%>
<body>
    <%=dateDuJour.get(Calendar.DAY_OF_MONTH) %> / <%=dateDuJour.get(Calendar.MONTH) %> / <%= dateDuJour.get(Calendar.YEAR)%> &eacute
</body>
</html>