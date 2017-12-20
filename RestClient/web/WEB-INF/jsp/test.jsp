<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <th>
                    username
                </th>
                <th>
                    pass
                </th>
               <th>
                    ma quyen
                </th>
            </tr>
            <c:forEach items="${listTK}" var="tk">
                <tr>
                    <td>${tk.username}</td>
                    <td>${tk.password}</td>
                    <td>${tk.maQ.maQ}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
