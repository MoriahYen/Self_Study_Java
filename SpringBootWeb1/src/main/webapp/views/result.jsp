<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="../style.css">
    </head>
    </body>
        <!-- using plain Java -->
<%--        <h2>Result is: <%= session.getAttribute("result") %></h2>--%>

        <!--  using jstl tags -->
        <p> ${alien}  </p>
        <p> Welcome to ${course} World! </p>

    </body>
</html>